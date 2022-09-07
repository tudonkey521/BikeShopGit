package com.example.BikeShop.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "Bike")
@Entity
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "email")
    @NotNull
    private String email;
    @Column(name = "phone_number")
    @NotNull
    private String phoneNumber;
    @Column(name = "model")
    @NotNull
    private String model;
    @Column(name = "serial_number")
    @NotNull
    private String serialNumber;
    @Column(name = "purchase_price")
    @NotNull
    private String purchasePrice;
    @Column(name = "purchase_date")
    @NotNull
    private Date purchaseDate;
    @Column(name = "contact")
    @NotNull
    private boolean contact;

    public Bike() {
    }

    public Bike(long id, String name, String email, String phoneNumber, String model, String serialNumber, String purchasePrice, Date purchaseDate, boolean contact) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.serialNumber = serialNumber;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.contact = contact;
    }

    public Bike(String name, String email, String phoneNumber, String model, String serialNumber, String purchasePrice, Date purchaseDate, boolean contact) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public boolean getContact() {
        return contact;
    }

    public void setContact(boolean contact) {
        this.contact = contact;
    }
}
