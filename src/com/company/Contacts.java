package com.company;

public class Contacts {
    private String telephonNumber;
    private String email;

    public Contacts(String telephonNumber, String email) {
        this.telephonNumber = telephonNumber;
        this.email = email;
    }

    public String getTelephonNumber() {
        return telephonNumber;
    }

    public String getEmail() {
        return email;
    }



    @Override
    public String toString() {
        return telephonNumber + " " + email;
    }
}
