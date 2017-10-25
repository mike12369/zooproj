package com.T00192959;

import javax.swing.*;

public class Monkey extends Animal {

    private String eyes;
    private int legs;
    private int arms;
    private String tail;
    private float weight;

    public Monkey(){ this("No Name",0,0,"Doesn't exist","None",0,0,"Yes",0.0f);}

    public Monkey(String name, int age, int yearsInZoo, String status, String eyes, int legs, int arms, String tail, float weight) {
        super(name, age, "monkey", "Dublin", yearsInZoo, status);
        this.eyes = eyes;
        this.legs = legs;
        this.arms = arms;
        this.tail = tail;
        this.weight = weight;
    }

    public String getEyes() { return eyes; }
    public int getLegs() { return legs; }
    public int getArms() { return arms; }
    public String getTail() { return tail; }
    public float getWeight() { return weight; }

    @Override
    public String toString() {
        String monkTypeString = String.format("\nEye Colour: %-1s \nLegs: %-1s \nArms: %-1s \nHas Tail: %-1s \nWeight: %-1f KG", getEyes(),getLegs(),getArms(),getTail(),getWeight());
        String monkTypesString = super.toString() + monkTypeString;
        JOptionPane.showMessageDialog(null,"\n " + monkTypesString, "Monkey",JOptionPane.INFORMATION_MESSAGE);
        return monkTypesString;

    }
}
