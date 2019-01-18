package com.infoshare.academy.model.cars;

public enum Color {
    BIEGE("Beżowy"),
    BLACK("Czarny"),
    BLUE("Niebieski"),
    BRONZE("Brązowy"),
    GOLD("Złoty"),
    GREEN("Zielony"),
    GREY("Szary"),
    PURPLE("Fioletowy"),
    RED("Czerwony"),
    SILVER("Srebrny"),
    WHITE("Biały"),
    YELLOW("Żółty"),
    ORANGE("Pomarańczowy"),
    OTHER("Inny");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void Messages(String text) {
        this.color = text;
    }
}
