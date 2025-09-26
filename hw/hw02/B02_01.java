import java.util.Scanner;

public class B02_01 {

    public static double find_max(double[] arr, int len) {
        double maxi = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введіть довжину масива: ");
        int len = sc.nextInt();
        double[] arr = new double[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextDouble();
        }

        find_max(arr, len);
        System.out.println(find_max(arr, len));
        sc.close();
    }
}