package com.infoshare.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Display the menu
        System.out.println("1\t Lista samochodów");
        System.out.println("2\t Szczegóły samochodu");
        System.out.println("3\t Rezerwacja");
        System.out.println("4\t Koniec");

        System.out.println("Wybór:");

        //Get user's choice
        int choice = in.nextInt();

        //Display the title of the chosen position
        switch (choice) {
            case 1:
                System.out.println("Lista samochodów");
                break;
            case 2:
                System.out.println("Szczegóły samochodu");
                break;
            case 3:
                System.out.println("Rezerwacja");
                break;
            case 4:
                System.out.println("Koniec");
                break;
            default:
                System.out.println("Błędny wybór!");
        }
    }
}
