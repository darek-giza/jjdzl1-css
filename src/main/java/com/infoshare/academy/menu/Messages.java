package com.infoshare.academy.menu;

public enum Messages {
    LIST_OF_CARS("Lista samochodów"),
    PRINT_DESCRIPTION("Szczegóły samochodu"),
    RESERVATION("Rezerwacja"),
    END("Koniec"),
    BAD_CHOICE("Błędny wybór!");

//    private String mDisplayName;
//
//    Messages(String displayName) {
//        mDisplayName = displayName;
//    }
//
//    public String getDisplayName() {
//        return mDisplayName;
//    }

    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void Messages(String text) {
        this.message = text;
    }
}
