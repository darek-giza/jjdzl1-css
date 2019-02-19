package com.infoshare.academy.user;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "street_address")
    private String streetAddress;
    @Column(name = "post_code")
    private String postCode;
    @Column(name = "city")
    private String city;

    public Address() {
    }

    public Address(String streetAddress, String postCode, String city) {
        this.streetAddress = streetAddress;
        this.postCode = postCode;
        this.city = city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setPostCode(String postalCode) {
        this.postCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}