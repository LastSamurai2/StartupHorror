package com.company.humans;

public abstract class Human {
    private String name;
    private String surname;
    private Integer age;

    protected Human(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " age " + age;
    }

}
