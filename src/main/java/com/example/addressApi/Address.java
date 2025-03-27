package com.example.addressApi;

import javax.swing.*;
import java.util.UUID;

public class Address {
    private  String country;
    private  String city;
    private  String muniplacity;
    private  String street;
    private  String imageUrl;
    private  String description;
    private final UUID id;

    public Address(String country, String city, String muniplacity, String street, String imageUrl, String description) {
        this.id = UUID.randomUUID();
        this.country = country;
        this.city = city;
        this.muniplacity = muniplacity;
        this.street = street;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMuniplacity() {
        return muniplacity;
    }

    public void setMuniplacity(String muniplacity) {
        this.muniplacity = muniplacity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public UUID getId() {
        return id;
    }
}
