package com.infoshare.academy.user;

public class User {

    private Integer id;
    private String login;
    private String email;
    private String password;
    private Long phoneNumber;
    private String firstName;
    private String lastName;
    private String address;
    private Integer houseNumber;
    private Integer parcelNumber;
    private String postCode;
    private String city;
    private boolean adult;

    //Constructor
    public User(Integer id, String login, String email, String password) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public User(String login, String email, String password, Long phoneNumber, String firstName, String lastName,
                Integer id, String address, Integer houseNumber, Integer parcelNumber, String postCode, String city,
                boolean adult) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
        this.houseNumber = houseNumber;
        this.parcelNumber = parcelNumber;
        this.postCode = postCode;
        this.city = city;
        this.adult = adult;
    }

    //Getters
    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public Integer getParcelNumber() {
        return parcelNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    public boolean isAdult() {
        return adult;
    }

    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setParcelNumber(Integer parcelNumber) {
        this.parcelNumber = parcelNumber;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    //Methods
    public boolean userAuth() {
        if (getLogin().equals(login) && getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", houseNumber=" + houseNumber +
                ", parcelNumber=" + parcelNumber +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                ", adult=" + adult +
                '}';
    }
}