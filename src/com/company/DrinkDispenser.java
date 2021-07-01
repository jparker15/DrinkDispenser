package com.company;

import java.util.ArrayList;
import java.util.List;

public class DrinkDispenser {

    List syrups = new ArrayList<Syrup>();
    List shots = new ArrayList<Shots>();

    CupHolder small = new CupHolder(8,150);
    CupHolder medium = new CupHolder(16,200);
    CupHolder large = new CupHolder(32,150);


    public void serveDrink(char size, int syrupIndex){

    }
}
