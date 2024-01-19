package org.example.Pizza;
public class PizzaBillGenerator {
    public static void main(String[] args) {
//        pizza basePizza = new pizza(false);
//        basePizza.addExtraCheese();
//        basePizza.addExtraTopping();
//        //basePizza.takeAway();
//        basePizza.getBill();
//        //basePizza.getPizzaPrice();

        deluxePizza dp = new deluxePizza(true);
        dp.addExtraCheese();
        dp.takeAway();
        dp.getBill();
    }

}
