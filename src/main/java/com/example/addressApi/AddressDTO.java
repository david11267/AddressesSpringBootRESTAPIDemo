package com.example.addressApi;

import java.util.UUID;

public class AddressDTO {
    private String country;
    private String city;
    private String muniplacity;
    private String street;
    private String imageUrl;
    private String description;
    private UUID id;

    public UUID getId() {
        return id;
    }

    // Getters and setters
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
