package com.company;

public class GeekTechStudents {
    private int age;
    private int height;
    private String name;
    private Employment employment;
    private Contacts contacts;

    public GeekTechStudents(int age, int height,String name, Employment employment, Contacts contacts) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.employment = employment;
        this.contacts = contacts;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
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
}
