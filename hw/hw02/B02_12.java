import java.util.Scanner;


public class B02_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("k = ");
        int k = sc.nextInt();

        int mask = ~(1 << k);
        int result = n & mask;

        System.out.println(result);
        sc.close();
    }
}
