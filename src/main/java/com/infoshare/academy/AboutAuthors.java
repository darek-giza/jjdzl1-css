package com.infoshare.academy;

public class AboutAuthors {

    public static void printAuthors() {

        System.out.println("Autorzy projektu:");
        System.out.println("\nDariusz Giza - developer");
        System.out.println("Arkadiusz Szlachta - developer");
        System.out.println("Łukasz Waręcki - scrum master");
        System.out.println("Kamil Wawer - developer");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
