package com.company.devices;
import com.company.creatures.SaleAble;
public class Car extends Device {

    final public Double engineCapacity;
    final public String color;
    public Double value;

    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour) {
        super(mark, model, yearOfProduction);
        this.engineCapacity = engineCapacity;
        this.color = colour;
        this.value = 2000.0;

    }

    public String toString() {
        return mark + "" + model;
    }


    @Override
    void turnOn() {
        System.out.println("grrrrrr car");
    }

    @Override
    public void sell() {
        System.out.println("sprzedano auto");
    }
}

