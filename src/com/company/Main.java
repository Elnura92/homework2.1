package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        AndroidDeveloperStudents android = new AndroidDeveloperStudents("Nursultan", new Contacts("0501242437", "nursultand@gmail.com"), Employment.STUDENT, 21, 165);

        Java2 java2 = new Java2("Aidana", new Contacts("0999 454590", "aidanaoto@gmail.com"), Employment.UNEMPLOYED, 17, 175, new String[]{"Tuesday", "Friday"});
        Java2 java3 = new Java2("Bekbol", new Contacts("0555 990101", "bekbol@gmail.com"), Employment.WORKING, 23, 170, new String[]{"Wednesday", "Saturday"});

        System.out.println(android.getInfo());

        //вызов перегруженного метода
        System.out.println();
        android.under18(android.getAge(), android.getName());
        android.under18(android.getName(), android.getAge());
        android.under18(android.getAge());

        System.out.println();
        System.out.println("--------------------------");


        System.out.println(java2.getInfo());
        //вызов перегруженного метода
        System.out.println();
        java2.under18(java2.getAge(), java2.getName());
        java2.under18(java2.getName(), java2.getAge());
        java2.under18(java2.getAge());





        System.out.println();
        System.out.println("-----------");

        System.out.println(java3.getInfo());
        //вызов перегруженного метода
        System.out.println();
        java3.under18(java3.getAge(), java3.getName());
        java3.under18(java3.getName(), java3.getAge());
        java3.under18(java3.getAge());







    }
}
