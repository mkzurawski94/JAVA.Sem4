package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Jacek";
        me.lastName = "Placek";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";

        me.setSalary(1000.0);
        Human wife = new Human();
        wife.firstName = "Grazyna";
        wife.lastName = "Nowjaak";


//        System.out.println(me.pet.name);

        Animal dog = new Animal("dog");
        dog.name = "Akita";
        me.pet = dog;

/*
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
*/


        Car passat = new Car("Volkswagen", "Passat", 1984, 1.9, "Red");
        me.setCar(passat);
//        System.out.println(me.getCar());
//        wife.setCar(passat);

//        System.out.println(me.species);
//        me.feed();

//        System.out.println(me instanceof Human);
//        System.out.println(me instanceof Animal);

//        System.out.println(me instanceof Object);
        // Object to klasa do ktorej naleza wszytskie klasy

//    me.beEaten();
//    me.pet.beEaten();
        me.car.sell();
        Human Buyman = new Human();
        Human Sellman = new Human;
        Sellman.cash = 0.0;
        Buyman.cash = 1000.0;
        System.out.println(Buyman.cash);
    }


}

