import java.util.Scanner;

public class B05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean a = false;
        if (s.length() > 1 && Character.isDigit(s.charAt(0)) && s.charAt(0) != '0') {
            int num = s.charAt(0) - '0';
            String letters = s.substring(1);
            boolean onlyLetters = true;
            for (int i = 0; i < letters.length(); i++) {
                if (!Character.isLetter(letters.charAt(i))) {
                    onlyLetters = false;
                    break;
                }
            }
            if (onlyLetters && letters.length() == num) a = true;
        }

        boolean b = false;
        int digitCount = 0;
        int digitValue = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digitCount++;
                digitValue = s.charAt(i) - '0';
            }
        }
        if (digitCount == 1 && digitValue == s.length()) b = true;

        boolean c = false;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        if (sum == s.length()) c = true;

        System.out.println("(a) " + a);
        System.out.println("(b) " + b);
        System.out.println("(c) " + c);

        sc.close();
    }
}
