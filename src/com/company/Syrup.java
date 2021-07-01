package com.company;

public class Syrup {

    private String drinkName;
    private int totalAmount;


    public Syrup (String drinkName, int totalAmount){
        this.drinkName = drinkName;
        this.totalAmount = totalAmount;

    }

    public void dispense(int amt){
        totalAmount -= amt;
    }

    public int getLiquidTotal(){
        return totalAmount;
    }
}
