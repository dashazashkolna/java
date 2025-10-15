import java.util.Scanner;

public class B05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int openCount = 0;
        int closeCount = 0;
        boolean correct = true;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '(') openCount++;
            if (c == ')') closeCount++;

            if (openCount > 1 || closeCount > 1) {
                correct = false;
                break;
            }
            if (closeCount > openCount) {
                correct = false;
                break;
            }
        }

        if (openCount != closeCount) correct = false;

        if (!correct) {
            System.out.println("incorrectly placed brackets");
        } else {
            int start = text.indexOf('(');
            int end = text.indexOf(')');
            if (start != -1 && end != -1) {
                String result = text.substring(0, start) + text.substring(end + 1);
                System.out.println(result);
            } else {
                System.out.println("no brackets");
            }
        }

        sc.close();
    }
}
