package com.company;

public class CupHolder {
    static private int fluidOunces;
    static private int quantity;

    public CupHolder(int fluidOunces, int quantity){
        this.fluidOunces = fluidOunces;
        this.quantity = quantity;
    }

    public void dispenseCup(){
        System.out.println(fluidOunces);
        quantity--;
    }

    public void refill(int amt){
        quantity += amt;
    }
}
