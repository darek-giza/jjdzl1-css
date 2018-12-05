package com.infoshare.academy.model.cars;

public class Car {

    private Integer id;
    private String make;
    private String model;
    private Integer year;
    private String fuelSource;
    private Integer power;
    private Integer mileage;

    //Constructor
    public Car(Integer id, String make, String model, Integer year, String fuelSource, Integer power, Integer mileage) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelSource = fuelSource;
        this.power = power;
        this.mileage = mileage;
    }

    //Getters
    public Integer getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getFuelSource() {
        return fuelSource;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getMileage() {
        return mileage;
    }

    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setFuelSource(String fuelSource) {
        this.fuelSource = fuelSource;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    //Methods
    public void carDescription() {
        String description = String.format("Samochód nr %s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %s, przebieg: %s", id, make, model, year, fuelSource, power, mileage);
        System.out.println(description);
    }
}
