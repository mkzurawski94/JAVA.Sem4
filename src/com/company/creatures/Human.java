package com.company.creatures;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
   public Animal pet;
    private Car car;
    private Double salary;
    public final static Double DEFAULT_HUMAN_WEIGHT = 70.0;

    public Human() {
        super( "homo sapiens");
        this.weight= DEFAULT_HUMAN_WEIGHT;
    }


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.value)
        {
            System.out.println("kupiles auto");
        }
        else if (this.salary== car.value)
        {
            System.out.println("mozesz kupic");
        }else;


        this.car = car;
    }
//    public String toString
//    {
//        String s = this.firstName + " " + this.lastName;
//        var s1 = s;
//        return s1;
//    }
}
