public abstract class CakeDecorator implements Cake{
    private final Cake decoratedCake;

    public CakeDecorator(Cake c){
        this.decoratedCake = c;
    }

    public String getToppings(){
        return decoratedCake.getToppings();
    }
}
