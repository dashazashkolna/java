public class B01_03 {
    public static void main(String[] args) {
        int p = 1;
        for (int i = 0; i < args.length; i++) {
            try {
				p *= Integer.parseInt(args[i]);
			}
			catch (NumberFormatException e) {
				System.out.println("Аргумент \"" + args[i] + "\" не є цілим числом.");
			}
        }
        System.out.println(p);
    }
}