public class WithCream extends CakeDecorator{

    public WithCream(Cake c) {
        super(c);
    }

    public String getToppings(){
        return super.getToppings() + " Cream";
    }
}
