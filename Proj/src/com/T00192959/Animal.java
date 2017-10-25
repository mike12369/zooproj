package com.T00192959;

public class Animal {

    private String name;
    private int age;
    private String type;
    private String location;
    private int yearsInZoo;
    private String status;

    public Animal(){ this("No Name", 0,"No Type", "No Location", 0, "Inactive");}

    public Animal(String name, int age, String type, String location, int yearsInZoo, String status) {
        setName(name);
        setAge(age);
        setType(type);
        setLocation(location);
        setYearsInZoo(yearsInZoo);
        setStatus(status);
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getType() { return type; }
    public String getLocation() { return location; }
    public int getYearsInZoo() { return yearsInZoo; }
    public String getStatus() { return status; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setType(String type) { this.type = type; }
    public void setLocation(String location) { this.location = location; }
    public void setYearsInZoo(int yearsInZoo) { this.yearsInZoo = yearsInZoo; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString(){
        String animalString = String.format("\nName: %-1s \nAge: %-1s year/s \nType: %-1s \nLocation: %-1s Zoo \nYears in Zoo: %-1s \nStatus: %-1s",
                                            getName(),getAge(),getType(),getLocation(),getYearsInZoo(),getStatus());
        //JOptionPane.showMessageDialog(null,"\n " + animalString, "Animal",JOptionPane.INFORMATION_MESSAGE);
        return animalString;

    }

}
