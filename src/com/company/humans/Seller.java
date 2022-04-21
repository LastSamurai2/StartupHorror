package com.company.humans;

public class Seller extends Employee{
    private Double effeciveness;

    public Seller(String name, String surname, Integer age, Double salary, Double effeciveness) {
        super(name, surname, age, salary);
        this.effeciveness = effeciveness;
    }
}
