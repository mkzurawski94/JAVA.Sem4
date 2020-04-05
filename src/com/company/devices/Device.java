package com.company.devices;

public class Device {
    final public String model;
    final public String mark;
    final public Integer yearOfProduction;


    public Device(String mark, String model, Integer yearOfProduction) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

}