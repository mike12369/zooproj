package com.T00192959;

public class Main {

    public static void main(String[] args) {

//          Animal ConstructorTest = new Animal();
//          ConstructorTest.toString();

//          Animal Monkey = new Animal("Bobo an",3,"Monkey","Dublin",1,"Active");
//          Monkey.toString();

////        Animal Fish = new Animal("Nemo an",10,"Fish","Dublin",10,"Dead");
////        Fish.toString();

            Monkey monktest = new Monkey();
            monktest.toString();

            Monkey Bobo = new Monkey("Bobo",3,1,"Alive","Blue",2,2,"Yes",20);
            Bobo.toString();

            Fish fishtest = new Fish();
            fishtest.toString();

            Fish Nemo = new Fish("Nemo",10,10,"Dead","Black","Fresh",2,10,20);
            Nemo.toString();

    }
}
