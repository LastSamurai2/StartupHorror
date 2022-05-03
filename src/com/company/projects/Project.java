package com.company.projects;

import com.company.Player;
import com.company.humans.Client;

import java.time.LocalDate;

public class Project {
    private String projectName;
    private DaysToRealisation daysToRealisation;
    public Client client;
    private LocalDate deadline;
    private Integer amountPenalty;
    public Double price;
    private Integer daysToPay;
    private DifficultyLevel difficultyLevel;
    public LocalDate payDate;


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
    @Override
    public String toString() {
        return projectName + " dni do realizacji " + daysToRealisation + " dead line " + deadline + " poziom " + difficultyLevel + " cena " + price ;
    }

    public void setPayDate(int additionalDays,LocalDate endProjectDate) {
        if (additionalDays > 0) {
            payDate = endProjectDate.plusDays(daysToPay+additionalDays);
        }
        else {
            payDate = endProjectDate.plusDays(daysToPay);
        }

    }
    public void setPayDateNever() {
            payDate = LocalDate.of(9999,1,1);
    }
    public void payPlayerForEndProject(Player player, LocalDate localPlayerDate) {
        System.out.println("płatonść " + payDate + " " + localPlayerDate);
        if (payDate.equals(localPlayerDate)){
            player.addCash(price);
            System.out.println("Dostałeś wypłate za projekt " + projectName);
        }

    }
}
