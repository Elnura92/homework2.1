package com.company;

public class AndroidDeveloperStudents extends GeekTechStudents {
    public AndroidDeveloperStudents(int age, int height, String name, Employment employment, Contacts contacts) {
        super(age, height, name, employment, contacts);
    }

    public void under18(int age, String name) {
        if (name != "GeekTech" && age < 18) {
            System.out.println("Student is under 18");
        } else if (name != "GeekTech" && age >= 18) {
            System.out.println("Student is over 18");
        }
    }

    final public  void under18(String name, int age) {
        if (name != "GeekTech" && age < 18) {
            System.out.println("Student is under 18");
        } else if (name != "GeekTech" && age >= 18) {
            System.out.println("Student is over 18");
        }

    }

    int under18 = 0;

    public void  under18(int age) {
        if (age >= 18) {
            System.out.println("Student is under 18");
        } else if (age < 18 ) {
            System.out.println("Student is over 18");
        }
    }


}