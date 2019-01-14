package com.infoshare.academy.menu;

public enum MessagesEnum {
    APP_START("   ___          ___ _             _           ___         _             \n  / __|__ _ _ _/ __| |_  __ _ _ _(_)_ _  __ _/ __|_  _ __| |_ ___ _ __  \n | (__/ _` | '_\\__ \\ ' \\/ _` | '_| | ' \\/ _` \\__ \\ || (_-<  _/ -_) '  \\ \n  \\___\\__,_|_| |___/_||_\\__,_|_| |_|_||_\\__, |___/\\_, /__/\\__\\___|_|_|_|\n                                        |___/     |__/                  "),
    WELCOME("Witamy w programie!"),
    LIST_OF_CARS("*Lista samochodów*"),
    PRINT_DESCRIPTION("*Szczegóły samochodu*"),
    RESERVATION("*Rezerwacja*"),
    END("Wyłączanie aplikacji..."),
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
