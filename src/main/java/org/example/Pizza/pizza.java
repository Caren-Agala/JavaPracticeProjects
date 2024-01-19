package org.example.Pizza;

public class pizza {
    private int price;
    private Boolean veg;
    private int extraCheese = 200;
    private int extraToppings = 250;
    private int doTakeAway = 150;
    private int baseprice;
    private boolean isExtraCheese = false;
    private boolean isExtraToppings = false;
    private boolean isDoingTakeaway = false;


    public pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 1000;
        }
        else {
            this.price = 1200;
        }
        baseprice = this.price;
    }
    //public void getPizzaPrice() {

    //}
    public void addExtraCheese(){
        isExtraCheese = true;
        System.out.println("Extra cheese added");
        this.price += extraCheese;

    }
    public void addExtraTopping(){
        isExtraToppings = true;
        System.out.println("Extra toppings added");
        this.price += extraToppings;

    }
    public void takeAway(){
        isDoingTakeaway = true;
        System.out.println("Extra take away price added");
        this.price += doTakeAway;

    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza: " + baseprice);
        if (isExtraCheese){
            System.out.println("Extra cheese: " + extraCheese);
        }
        if(isExtraToppings){
            System.out.println("Extra topping: " + extraToppings);
        }
        if(isDoingTakeaway){
            System.out.println("Extra topping: " + doTakeAway);
        }
        System.out.println("Kshs. " + this.price);

    }
}
