package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        AndroidDeveloperStudents android = new AndroidDeveloperStudents(16, 170, "Adilet", Employment.STUDENT, new Contacts("0501 242437", "adilets2gmail.com"));

        Java2 java2 = new Java2(25, 175, "Sergei", Employment.UNEMPLOYED, new Contacts("0999 454590", "sergeiivanov@gmail.com"), new String[] {"Tuesday", "Friday"});
        Java2 java3 = new Java2(15, 185, "Aidana", Employment.WORKING, new Contacts("0705 787974", "aidanaoto@gmail.com"), new String[] {"Wednesday", "Saturday"});

        System.out.println(android.getName());
        System.out.println(android.getAge());
        System.out.println(android.getHeight());
        System.out.println(android.getEmployment());
        System.out.println(android.getContacts());

        //вызов перегруженного метода
        System.out.println();
        android.under18(android.getAge(), android.getName());
        android.under18(android.getName(), android.getAge());
        android.under18(android.getAge());

        System.out.println();
        System.out.println("--------------------------");


        System.out.println(java2.getName());
        System.out.println(java2.getAge());
        System.out.println(java2.getHeight());
        System.out.println(java2.getEmployment());
        System.out.println(java2.getContacts().getTelephonNumber());
        System.out.println(java2.getContacts().getEmail());
        System.out.println(java2.getDaysOfLearning());

        //вызов перегруженного метода
        System.out.println();
        java2.under18(java2.getAge(), java2.getName());
        java2.under18(java2.getName(), java2.getAge());
        java2.under18(java2.getAge());





        System.out.println();
        System.out.println("-----------");

        System.out.println(java3.getName());
        System.out.println(java3.getAge());
        System.out.println(java3.getHeight());
        System.out.println(java3.getEmployment());
        System.out.println(java3.getContacts());
        System.out.println(java3.getDaysOfLearning());

        //вызов перегруженного метода
        System.out.println();
        java3.under18(java3.getAge(), java3.getName());
        java3.under18(java3.getName(), java3.getAge());
        java3.under18(java3.getAge());







    }
}
