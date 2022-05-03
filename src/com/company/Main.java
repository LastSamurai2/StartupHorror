package com.company;

import com.company.humans.*;
import com.company.projects.DaysToRealisation;
import com.company.projects.DifficultyLevel;
import com.company.projects.Project;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Janusz","Polak",55, ClientType.LAIDBACK);
        Programmer programmer1 = new Programmer("Marcin","Fyrek",36,5000.00,90.00,80.00);
        Seller seller1 = new Seller("Tomasz","Kowalski",42,3000.00,85.00);
        Tester tester1 = new Tester("Magda","Nowak",28,4000.00);
        Subcontractor subcontractor1 = new Subcontractor("Adam","Adamowicz",24,2000.00,SubcontractorType.DUDE);
        Project project1 = new Project("Wordpress website", DaysToRealisation.WORDPRESS,client1, LocalDate.of(2020,1,10),1000,2500.00,2, DifficultyLevel.EASY);
        Player player = new Player("Kacper");

        System.out.println(player);
        player.setMyProjects(project1);
        player.setMyEmployees(programmer1);
        System.out.println(player);

        System.out.println("data przed oddaniem projektu " + project1.payDate);
        player.addDays(15); //test wypłaty
        player.endProject(project1);
        System.out.println(player);
        System.out.println("data po oddaniu projektu " + project1.payDate);

        System.out.println(player.getCash());
        player.addDays(2); //test wypłaty
        //System.out.println("dni po doddaniu " + player.getCurrentDate());
        project1.payPlayerForEndProject(player,player.getCurrentDate());
        System.out.println(player.getCash());

    }
}
