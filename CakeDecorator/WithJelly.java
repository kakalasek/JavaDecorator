package CakeDecorator;

import CakeDecorator.CakeDecorator;

public class WithJelly extends CakeDecorator {
    public WithJelly(Cake c) {
        super(c);
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " Jelly";
    }
}
