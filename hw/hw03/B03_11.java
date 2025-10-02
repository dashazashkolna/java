import java.util.*;

class Abiturient {
    private String name;
    private String address;
    private String phone;
    private int[] grades;

    public Abiturient() {
        this.name = "";
        this.address = "";
        this.phone = "";
        this.grades = new int[0];
    }

    public Abiturient(String name, String address, String phone, int[] grades) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.grades = grades.clone();
    }

    public Abiturient(Abiturient other) {
        this.name = other.name;
        this.address = other.address;
        this.phone = other.phone;
        this.grades = other.grades.clone();
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public int[] getGrades() { return grades; }

    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setGrades(int[] grades) { this.grades = grades.clone(); }

    public int sumGrades() {
        int sum = 0;
        for (int g : grades) sum += g;
        return sum;
    }

    @Override
    public String toString() {
        return "ПІБ: " + name + ", Адреса: " + address + ", Телефон: " + phone +
               ", Сума балів: " + sumGrades();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Abiturient) {
            Abiturient a = (Abiturient) o;
            return name.equals(a.name) && address.equals(a.address) &&
                   phone.equals(a.phone) && Arrays.equals(grades, a.grades);
        }
        return false;
    }

    // a) абітурієнти з сумою балів < заданої
    public static Abiturient[] filterBySum(Abiturient[] arr, int limit) {
        ArrayList<Abiturient> result = new ArrayList<>();
        for (Abiturient a : arr) {
            if (a.sumGrades() < limit) result.add(a);
        }
        return result.toArray(new Abiturient[0]);
    }

    // b) n абітурієнтів з найбільшою сумою балів
    public static Abiturient[] topN(Abiturient[] arr, int n) {
        Arrays.sort(arr, (a, b) -> Integer.compare(b.sumGrades(), a.sumGrades()));
        if (n > arr.length) n = arr.length;
        return Arrays.copyOf(arr, n);
    }
}

public class B03_11 {
    public static void main(String[] args) {
        Abiturient[] abits = {
            new Abiturient("Іван Іванов", "Київ", "123456", new int[]{10, 9, 8}),
            new Abiturient("Петро Бла", "Львів", "654321", new int[]{12, 11, 10}),
            new Abiturient("Оксана Коваль", "Одеса", "111111", new int[]{7, 6, 8}),
            new Abiturient("Марія Йоу", "Харків", "333412", new int[]{12, 12, 12})
        };

        System.out.println("Абітурієнти з сумою балів < 30:");
        for (Abiturient a : Abiturient.filterBySum(abits, 30)) {
            System.out.println(a);
        }

        System.out.println("\nТоп абітурієнти:");
        for (Abiturient a : Abiturient.topN(abits, 2)) {
            System.out.println(a);
        }
    }
}
