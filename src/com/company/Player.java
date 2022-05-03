package com.company;
import java.util.Random;

import com.company.humans.Client;
import com.company.humans.ClientType;
import com.company.humans.Employee;
import com.company.projects.Project;
import java.time.LocalDate;
import java.util.LinkedList;

public class Player {
    private static final Double DEFAULT_CASH = 5000.0;
    private static final LocalDate DEFAULT_START_DATE = LocalDate.of(2020,01,01);
    private String name;
    private Double cash;
    private LocalDate currentdate;
    private LinkedList<Project> myProjects;
    private LinkedList<Project> endedProjects;
    private LinkedList<Employee> myEmployees;

    public Player(String name) {
        this.name = name;
        this.cash = DEFAULT_CASH;
        this.currentdate = DEFAULT_START_DATE;
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
        myProjects.remove(project);
        endedProjects.add(project);

        Random rand = new Random();
        double deleyInPayWeek = rand.nextDouble();
        double deleyInPayMonth = rand.nextDouble();
        double noPunishForDeley = rand.nextDouble();
        double lossContract = rand.nextDouble();
        double neverPay = rand.nextDouble();
        Client klient = project.client;

        int additionalDay = 0;
        boolean neverPayFlag = false;
        if (klient.clientType.equals(ClientType.LAIDBACK)){
            if (deleyInPayWeek <= 0.3){
                additionalDay+=7;
            }
            if (noPunishForDeley <=0.2){
                project.setDeleyPunishFlag(true);
                System.out.println("Masz szczęście uniknąłeś kary");
            }
        }
        else if (klient.clientType.equals(ClientType.DEMANDING)){
            if (deleyInPayWeek <= 0){
                additionalDay+=7;
            }
            if (noPunishForDeley <=0){
                project.setDeleyPunishFlag(true);
                System.out.println("Masz szczęście uniknąłeś kary");
            }
            if (lossContract <= 0.5){}
        }
        else if(klient.clientType.equals(ClientType.MOFO)){
            if (noPunishForDeley <=0){
                project.setDeleyPunishFlag(true);
                System.out.println("Masz szczęście uniknąłeś kary");
            }
            if (lossContract <= 1){}


            if (neverPay <= 0.01){
                neverPayFlag = true;
            }

            else if (deleyInPayMonth <= 0.05){
                additionalDay+=30;
            }
            else if (deleyInPayWeek <= 0.3){
                additionalDay+=7;
            }

        }

        if (neverPayFlag == true){
            project.setPayDateNever();
        }
        else {
            project.setPayDate(additionalDay, currentdate);
        }
        project.setEndProjectDate(currentdate);

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
    public Double getCash() {
        return cash;
    }
    public void addCash( Double newCash) {
        cash+=newCash;
    }
    public LocalDate getCurrentDate() {
        return currentdate;
    }
    public void addDays(int days) {
        currentdate = currentdate.plusDays(days);
    }

}
