public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        // int amount = 2500; //стоимость билета
        //  int x = 20; // кол-во рублей для начисления бонуса в соотношении 20:1
        //  int miles; // начилсенные мили
        //  miles = amount / x;
        // System.out.println("Начисленные мили: " + miles);
    }
}