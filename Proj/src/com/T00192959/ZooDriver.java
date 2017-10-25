package com.T00192959;

import javax.swing.*;

public class ZooDriver {

    public static void main(String[] args) {

        String name;
        int age;
        String type;
        String location;
        int yearsInZoo;
        String status;


        Animal[] Zoo = new Animal[5];

        Zoo[0] = new Animal("Bobo", 3, "Monkey", "Dublin", 3, "Active");
        Zoo[1] = new Animal("Koba", 7, "Monkey", "Dublin", 5, "Active");
        Zoo[2] = new Animal("Robo", 2, "Monkey", "Dublin", 2, "Active");
        Zoo[3] = new Animal("Yobo", 8, "Monkey", "Dublin", 4, "Dead");
        Zoo[4] = new Animal("Sobo", 1, "Monkey", "Dublin", 1, "Active");

        for(int x=0; x<=4; x++){

            name = JOptionPane.showInputDialog("Enter Name: ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter age: "));
            type = JOptionPane.showInputDialog("Enter Type: ");
            location = JOptionPane.showInputDialog("Enter Location: ");
            yearsInZoo = Integer.parseInt(JOptionPane.showInputDialog("Enter Years At Zoo: "));
            status = JOptionPane.showInputDialog("Enter Status: ");

            Zoo[x] = new Animal(name,age,type,location,yearsInZoo,status);
        }

        display(Zoo);
    }

    public static void display(Animal [] Zoo){

        JTextArea jta = new JTextArea("Zoo:\n\n");
        for (int x=0; x<=4; x++){
            jta.append(Zoo[x].toString());
        }

        JOptionPane.showMessageDialog(null,jta);

    }
}
