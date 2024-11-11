public class AutoTestLevel2 {
    public static void main(String[] args) {
        Basket basket = new Basket(1234);
        basket.addItem("bread", 0.95);
        basket.addItem("ham", 2.15);
        basket.addItem("pear", 1.09);
        basket.addItem("tomato", 0.78);
        basket.addItem("cucumber", 0.75);
        basket.addItem("milk", 1.05);
        basket.addItem("muffin", 1.62);
        System.out.print(basket.toString());
        System.out.println("========== test findAnItem ==================");
        System.out.print(basket.findAnItem("bread", 0.95));
        System.out.println();
        System.out.print(basket.findAnItem("Bread", 0.95));
        System.out.println();
        System.out.print(basket.findAnItem("bread", 1.95));
        System.out.println();
        System.out.println("========== test cheapestItem ===============");
        System.out.print(basket.cheapestItem());
        System.out.println();
        System.out.println("========== test mostExpensiveItem ==========");
        System.out.print(basket.mostExpensiveItem());
        System.out.println();
    }
}


