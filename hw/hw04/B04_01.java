public class B04_01 {
    public static void main(String[] args) {
        Gift gift = new Gift();

        gift.addCandy(new Chocolate("Milka", 50, 25, 30));
        gift.addCandy(new Caramel("Toffee", 30, 20, 45));
        gift.addCandy(new Chocolate("Snickers", 45, 22, 25));

        System.out.println("Усі цукерки у подарунку:");
        gift.showAll();

        gift.sortByVolume();
        System.out.println("\nПісля сортування за об’ємом:");
        gift.showAll();

        System.out.println("\nЦукерки з вмістом цукру від 20 до 22:");
        for (Candy c : gift.findBySugar(20, 22)) {
            System.out.println(c);
        }
    }
}
