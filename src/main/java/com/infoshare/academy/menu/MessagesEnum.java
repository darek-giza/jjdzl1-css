package com.infoshare.academy.menu;

public enum MessagesEnum {
    LIST_OF_CARS("Lista samochodów"),
    PRINT_DESCRIPTION("Szczegóły samochodu"),
    RESERVATION("Rezerwacja"),
    END("Koniec"),
    BAD_CHOICE("Błędny wybór!"),

    CANNOT_PARSE_DATA("Nie można przeanalizować danych"),
    ENTER_START_DATE_OF_RESERVATION("Wpisz datę rozpoczęcia rezerwacji( YYYY-MM-DD )"),
    ENTER_END_DATE_OF_RESERVATION("Wpisz datę zakończenia rezerwacji( YYYY-MM-DD )"),
    END_DATE_CANNOT_BE_LESS_THAN_END_DATE("Data końcowa nie może być mniejsza niż data końcowa"),
    LIST_AVAILABLE_CARS_IN_TIME_RANGE("Lista dostępnych samochodów w podanym przedziale czasowym"),
    CHOOSE_ID_CAR("Wybierz id auta"),
    RESERVATION_WAS_MADE("Dokonano rezerwacji "),
    INCORRECT_DATE_TRY_AGAIN("Nieprawidłowa data spróbuj ponownie"),

    //iostream
    FILE_NOT_EXIST("Plik nie istnieje @"),
    IO_ERROR("Błąd we/wy @"),
    BAD_LINE_NUMBER("Zły numer linii @"),

    ;



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
