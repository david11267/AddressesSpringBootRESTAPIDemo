package com.example.addressApi;

import javax.swing.*;
import java.util.UUID;

public class Address {
    private final String country;
    private final String city;
    private final String muniplacity;
    private final String street;
    private final String imageUrl;
    private final UUID id;

    public Address(String country, String city, String muniplacity, String street, String imageUrl) {
        this.id = UUID.randomUUID();
        this.country = country;
        this.city = city;
        this.muniplacity = muniplacity;
        this.street = street;
        this.imageUrl = imageUrl;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getMuniplacity() {
        return muniplacity;
    }

    public String getStreet() {
        return street;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public UUID getId() {
        return id;
    }
}
