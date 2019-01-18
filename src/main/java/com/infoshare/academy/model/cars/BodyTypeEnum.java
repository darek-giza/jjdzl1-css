package com.infoshare.academy.model.cars;

public enum BodyType {

    CABRIOLET("Kabriolet"),
    COUPE("Coupe"),
    CONVERTIBLE("Zmienny"),
    CROSSOVER("Crossover"),
    HATCHBACK("Hatchback"),
    ROADSTER("Roadster"),
    SEDAN("Sedan"),
    TOURING("Kombi"),
    SUV("SUV"),
    MINIVAN("Minivan"),
    WAGON("Dostawczy");

    private String message;

    BodyType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void Messages(String text) {
        this.message = text;
    }

}
