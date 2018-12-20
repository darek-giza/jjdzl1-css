package com.infoshare.academy.menu;

public enum Messages {
    LIST_OF_CARS("Lista samochodów"),
    PRINT_DESCRIPTION("Szczegóły samochodu"),
    RESERVATION("Rezerwacja"),
    END("Koniec"),
    BAD_CHOICE("Błędny wybór!");

    private String text;

    Messages(String text) {
    }

    public String getText() {
        return text;
    }

    public void Messages(String text) {
        this.text = text;
    }
}
