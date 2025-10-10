import java.util.*;

public class Gift {
    private List<Candy> candies = new ArrayList<>();

    public void addCandy(Candy c) {
        candies.add(c);
    }

    public void sortByVolume() {
        Collections.sort(candies);
    }

    public List<Candy> findBySugar(double min, double max) {
        List<Candy> result = new ArrayList<>();
        for (Candy c : candies) {
            if (c.getSugar() >= min && c.getSugar() <= max) {
                result.add(c);
            }
        }
        return result;
    }

    public void showAll() {
        for (Candy c : candies) {
            System.out.println(c);
        }
    }
}
