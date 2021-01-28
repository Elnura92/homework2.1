package com.company;

public class GeekTechStudents {
    private String name;
    private Contacts contacts;
    private Employment employment;

    public GeekTechStudents(String name, Contacts contacts, Employment employment) {
        this.name = name;
        this.contacts = contacts;
        this.employment = employment;
    }


    public String getName() {
        return name;
    }


    public Employment getEmployment() {
        return employment;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public String getInfo() {
        return "Student name: " + name + "\nStudent contacts: " + contacts + "\nWhat does student do: " + employment;
    }
}

