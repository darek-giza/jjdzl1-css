package com.infoshare.academy.user;

public class User {


    //poles
    private String login;
    private String email;
    private String password;
    private Long phoneNumber;
    private String firstName;
    private String lastname;
    private Integer id;
    private String adress;
    private Integer houseNumber;
    private Integer parcelNumber;
    private String postCode;
    private String city;
    private boolean adult;

    //constructor


    public User(String login, String email, String password, Long phoneNumber, String firstName, String lastname,
                Integer id, String adress, Integer houseNumber, Integer parcelNumber, String postCode, String city,
                boolean adult) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastname = lastname;
        this.id = id;
        this.adress = adress;
        this.houseNumber = houseNumber;
        this.parcelNumber = parcelNumber;
        this.postCode = postCode;
        this.city = city;
        this.adult = adult;
    }

    //getters

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

    public String getLastname() {
        return lastname;
    }

    public Integer getId() {
        return id;
    }

    public String getAdress() {
        return adress;
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

    //setters


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

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", adress='" + adress + '\'' +
                ", houseNumber=" + houseNumber +
                ", parcelNumber=" + parcelNumber +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                ", adult=" + adult +
                '}';
    }
}
