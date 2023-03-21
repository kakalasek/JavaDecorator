public class Main {
    public static void main(String[] args) {
        Cake c = new Base();
        System.out.println("Toppings: " + c.getToppings());

        c = new WithCream(c);
        System.out.println("Toppings: " + c.getToppings());

        c = new WithCoconut(c);
        System.out.println("Toppings: " + c.getToppings());

    }
}
