package com.company;

public class Shots {

    private String flavor;
    private int totalAmount;
    private int shotAmount;

    public Shots(String flavor, int totalAmount, int shotAmount){
        this.flavor = flavor;
        this.totalAmount = totalAmount;
        this.shotAmount = shotAmount;
    }

    public String dispense(){
        if(totalAmount < shotAmount){
            return null;
        }
        totalAmount -= shotAmount;
        return flavor;
    }

    public void getVolume(){
        System.out.println("total number of shots left:" + totalAmount/shotAmount);
    }
}
