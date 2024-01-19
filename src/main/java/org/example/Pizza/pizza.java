package org.example.Pizza;

public class pizza {
    private int price;
    private Boolean veg;

    public pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 1000;
        }
        else {
            this.price = 1200;
        }
    }
    public void getPizzaPrice() {
        System.out.println(this.price);
    }
}
