import java.util.Scanner;

// пункт g

public class B02_17 {
    static double sinh(double x, double eps) {
        double term;
        double sum = 0;
        int k = 0;

        while (true) {
            term = Math.pow(x, 2 * k + 1) / factorial(2 * k + 1);

            if (Math.abs(term) <= eps) {
                sum += term;
            }

            if (Math.abs(term) < 1e-15) {
                break;
            }

            k++;
        }

        return sum;
    }


    static long factorial(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        double x = sc.nextDouble();
        System.out.print("eps = ");
        double eps = sc.nextDouble();

        double result = sinh(x, eps);
        System.out.println(result);

        sc.close();
    }
}
