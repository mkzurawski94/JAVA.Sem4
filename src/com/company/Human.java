package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;



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
}
