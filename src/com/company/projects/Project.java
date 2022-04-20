package com.company.projects;

import com.company.humans.Client;

import java.time.LocalDate;

public class Project {
    private String projectName;
    private DaysToRealisation daysToRealisation;
    private Client client;
    public final LocalDate deadline;
    private Integer amountPenalty;
    private Double price;
    private Integer daysToPay;
    private DifficultyLevel difficultyLevel;


    public Project(String projectName, DaysToRealisation daysToRealisation, Client client, LocalDate deadline, Integer amountPenalty, Double price, Integer daysToPay, DifficultyLevel difficultyLevel) {
        this.projectName = projectName;
        this.daysToRealisation = daysToRealisation;
        this.client = client;
        this.deadline = deadline;
        this.amountPenalty = amountPenalty;
        this.price = price;
        this.daysToPay = daysToPay;
        this.difficultyLevel = difficultyLevel;
    }
}
