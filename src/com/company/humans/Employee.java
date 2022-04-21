package com.company.humans;

public class Employee extends Human{
    private Double salary;

    public Employee(String name, String surname, Integer age, Double salary) {
        super(name, surname, age);
        this.salary = salary;
    }
}
