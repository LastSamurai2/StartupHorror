package com.company.humans;

public class Programmer extends  Employee{
    private double accuracy;
    private double punctuality;

    public Programmer(String name, String surname, Integer age, Double salary,Double accuracy, Double punctuality) {
        super(name, surname, age, salary);
        this.accuracy = accuracy;
        this.punctuality = punctuality;
    }
}
