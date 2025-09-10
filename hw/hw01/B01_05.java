import java.util.Scanner;

public class B01_05 {
    public static void main(String[] args) {
        int N, M;

        if (args.length == 2) {
            try {
                N = Integer.parseInt(args[0]);
                M = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                return;
            }
        } else {
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            M = sc.nextInt();
            sc.close();
        }

        for (int i = 0; i < N; i++) {
            System.out.println((int) (Math.random() * M));
        }
    }
}
