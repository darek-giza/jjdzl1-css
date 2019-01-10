package com.infoshare.academy.menu;

public enum MessagesEnum {
    LIST_OF_CARS("Lista samochodów"),
    PRINT_DESCRIPTION("Szczegóły samochodu"),
    RESERVATION("Rezerwacja"),
    END("Koniec"),
    BAD_CHOICE("Błędny wybór!");

    private String message;

    MessagesEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void Messages(String text) {
        this.message = text;
    }
}
