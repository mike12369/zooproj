package com.T00192959;

import javax.swing.*;

public class Fish extends Animal {

    private String eyes;
    private String water;
    private int fins;
    private int gills;
    private float weight;

    public Fish() {
        this("No Name", 0, 0, "Doesn't exist", "None", "None",0, 0, 0.0f);
    }

    public Fish(String name, int age, int yearsInZoo, String status, String eyes, String water, int fins, int gills, float weight) {
        super(name, age, "Fish", "Dublin", yearsInZoo, status);
        this.eyes = eyes;
        this.water = water;
        this.fins = fins;
        this.gills = gills;
        this.weight = weight;
    }

    public String getEyes() { return eyes; }
    public String getWater() { return water; }
    public int getFins() { return fins; }
    public int getGills() { return gills; }
    public float getWeight() { return weight; }

    @Override
    public String toString() {
        String fishTypeString = String.format("\nEye Colour: %-1s \nWater: %-1s \nFins: %-1s \nGills: %-1s \nWeight: %-1s KG", getEyes(), getWater(), getFins(), getGills(), getWeight());
        String fishTypesString = super.toString() + fishTypeString;
        JOptionPane.showMessageDialog(null, "\n " + fishTypesString, "Fish",JOptionPane.INFORMATION_MESSAGE);
        return fishTypesString;
    }
}