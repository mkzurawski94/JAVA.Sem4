package com.company.devices;

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

    public String toString(){
        return mark + "" + model ;}




}

