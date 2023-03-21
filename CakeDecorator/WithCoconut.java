package CakeDecorator;

import CakeDecorator.CakeDecorator;

public class WithCoconut extends CakeDecorator {
    public WithCoconut(Cake c) {
        super(c);
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " Coconut";
    }
}
