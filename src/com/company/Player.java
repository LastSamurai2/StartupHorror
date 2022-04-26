package com.company;

import com.company.humans.Employee;
import com.company.projects.Project;

import java.util.LinkedList;

public class Player {
    private static final Double DEFAULT_CASH = 5000.0;
    private String name;
    private Double cash;
    private LinkedList<Project> myProjects;
    private LinkedList<Project> endedProjects;
    private LinkedList<Employee> myEmployees;

    public Player(String name) {
        this.name = name;
        this.cash = DEFAULT_CASH;
        this.myProjects = new LinkedList<>();
        this.myEmployees = new LinkedList<>();
        this.endedProjects = new LinkedList<>();

    }

    public LinkedList<Project> getMyProjects() {
        return myProjects;
    }

    public void setMyProjects(Project project) {
        myProjects.add(project);
    }

    public void endProject(Project project){
        cash+=project.price;
        myProjects.remove(project);
        endedProjects.add(project);
    }

    public LinkedList<Employee> getMyEmployees() {
        return myEmployees;
    }

    public void setMyEmployees(Employee employee) {
        myEmployees.add(employee);
    }


    @Override
    public String toString() {
        return name + " " + cash + " " + myProjects + " " + myEmployees ;
    }
}
