package com.company.humans;

public class Subcontractor extends Employee{
    private SubcontractorType subcontractorType;
    public Subcontractor(String name, String surname, Integer age, Double salary,SubcontractorType subcontractorType) {
        super(name, surname, age, salary);
        this.subcontractorType = subcontractorType;
    }
}
