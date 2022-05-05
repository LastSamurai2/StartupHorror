package com.company;
import java.util.Scanner;

public class Controller {



    public static void mainSwitch(int option,Player player){
        switch (option){
            case 1:
                System.out.println("Podpisz umowę na realizację jednego z dostępnych projektów:");
                break;
            case 2:
                System.out.println("Przeznacz dzień na szukanie klientów (każde 5 dni to jeden nowy dostępny projekt)");
                break;
            case 3:
                System.out.println("Przeznacz dzień na programowanie");
                break;
            case 4:
                System.out.println("Przeznacz dzień na testowanie (możesz testować własny kod, kod podwykonawców i kod pracowników)");
                break;
            case 5:
                System.out.println("Oddaj gotowy projekt klientowi");
                break;
            case 6:
                System.out.println("Zatrudnij nowego pracownika");
                break;
            case 7:
                System.out.println("Zwolnij pracownika");
                break;
            case 8:
                System.out.println("Przeznacz dzień na rozliczenia z urzędami (jeśli nie poświęcisz na to 2 dni w miesiącu ZUS wjeżdża z taką kontrolą, że zamykasz firmę z długami)");
                break;
            case 9:
                baseStaticMenu(player);
                break;
        }
    }

    public static void infoSwitch(int option,Player player){
        switch (option) {
            case 1:
                System.out.println("stan realizacji poszczególnych projektów");
                break;
            case 2:
                System.out.println("przejrzyj dostępne projekty");
                break;
            case 3:
                System.out.println("przejrzyj dostępnych pracowników ");
                break;
            case 4:
                System.out.println("Stan konta: " + player.getCash());
                break;
            case 5:
                baseStaticMenu(player);
                break;
        }
    }
    public static void baseSwitch(int option,Player player){
        switch (option){
            case 1:
                optionListInfoSwitch();
                do {
                    System.out.println("Opcja: ");
                    Scanner input = new Scanner(System.in);
                    int number = input.nextInt();
                    infoSwitch(number,player);
                }while (option==1);
                break;
            case 2:
                optionListMainSwitch();
                do {
                    System.out.println("Opcja: ");
                    Scanner input2 = new Scanner(System.in);
                    int number2 = input2.nextInt();
                    mainSwitch(number2,player);
                }while (option==2);
                break;
        }
    }
    public void baseMenu(Player player){
        optionListBaseSwitch();
        System.out.println("Opcja: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        baseSwitch(number,player);
    }
    public static void baseStaticMenu(Player player){
        optionListBaseSwitch();
        System.out.println("Opcja: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        baseSwitch(number,player);
    }


    public static void optionListBaseSwitch(){
        System.out.println("");
        System.out.println("Wybierz jedną z poniższych opcji");
        System.out.println("1 - uzyskaj informacje\n2 - wykonaj czynność (koszt każdej czynności to 1 dzień roboczy)");
    }
    public static void optionListInfoSwitch(){
        System.out.println("Wybierz jedną z poniższych opcji");
        System.out.println("1 - stan realizacji poszczególnych projektów\n2 - przejrzyj dostępne projekty\n3 - przejrzyj dostępnych pracowników\n4 - sprawdź stan konta\n5 - POWRÓT");
    }
    public static void optionListMainSwitch(){
        System.out.println("Wybierz jedną z poniższych opcji");
        System.out.println("1 - Podpisz umowę na realizację jednego z dostępnych projektów:\n2 - Przeznacz dzień na szukanie klientów (każde 5 dni to jeden nowy dostępny projekt)\n" +
                "3 - Przeznacz dzień na programowanie\n4 - Przeznacz dzień na testowanie (możesz testować własny kod, kod podwykonawców i kod pracowników)\n" +
                "5 - Oddaj gotowy projekt klientowi\n6 - Zatrudnij nowego pracownika\n" +
                "7 - Zwolnij pracownika\n8 - Przeznacz dzień na rozliczenia z urzędami (jeśli nie poświęcisz na to 2 dni w miesiącu ZUS wjeżdża z taką kontrolą, że zamykasz firmę z długami)\n" +
                "9 - POWRÓT");
    }

}
