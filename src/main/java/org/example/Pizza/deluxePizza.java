package org.example.Pizza;
import org.example.Pizza.pizza;

public class deluxePizza  extends pizza {
    public deluxePizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();
    }
}
