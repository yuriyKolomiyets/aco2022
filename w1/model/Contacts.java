package aco.w1.model;

import java.io.Serializable;

public class Contacts implements Serializable {

    private String phone;
    private String street;
    private int appartment;

    public Contacts() {
    }

    public Contacts(String phone, String street, int appartment) {
        this.phone = phone;
        this.street = street;
        this.appartment = appartment;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAppartment() {
        return appartment;
    }

    public void setAppartment(int appartment) {
        this.appartment = appartment;
    }

    public String printInfo() {
        return street + appartment + phone;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "phone='" + phone + '\'' +
                ", street='" + street + '\'' +
                ", appartment=" + appartment +
                '}';
    }
}
