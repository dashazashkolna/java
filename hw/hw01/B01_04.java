import java.util.Scanner;


public class B01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.printf("%.4f\n", Math.pow(num1 * num2 * num3, 1.0 / 3));
        sc.close();
    }
}