package com.company;

import com.company.humans.*;
import com.company.projects.DaysToRealisation;
import com.company.projects.DifficultyLevel;
import com.company.projects.Project;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Janusz","Polak",55, ClientType.MOFO);
        Programmer programmer1 = new Programmer("Marcin","Fyrek",36,5000.00,90.00,80.00);
        Seller seller1 = new Seller("Tomasz","Kowalski",42,3000.00,85.00);
        Tester tester1 = new Tester("Magda","Nowak",28,4000.00);
        Subcontractor subcontractor1 = new Subcontractor("Adam","Adamowicz",24,2000.00,SubcontractorType.DUDE);
        Project project1 = new Project("Wordpress website", DaysToRealisation.WORDPRESS,client1, LocalDate.of(2021,1,10),1000,2500.00,2, DifficultyLevel.EASY);
        Player player = new Player("Kacper");

        System.out.println(player);
        player.setMyProjects(project1);
        player.setMyEmployees(programmer1);
        System.out.println(player);
        player.endProject(project1);
        System.out.println(player);

    }
}
