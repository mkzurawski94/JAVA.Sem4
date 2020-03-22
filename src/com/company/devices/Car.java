package com.company.devices;

public class Car {
    final public String mark;
    final public String model;
    final public Integer yearOfProduction;
    final public Double engineCapacity;
    final public String color;
    public Double value;

    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.color = colour;
        this.value = 2000.0;

    }

    public String toString(){
        return mark + "" + model ;}




}

