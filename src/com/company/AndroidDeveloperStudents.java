package com.company;

public class AndroidDeveloperStudents extends GeekTechStudents {
    private int age;
    private int height;

   public AndroidDeveloperStudents(String name, Contacts contacts, Employment employment, int age, int height) {
       super(name, contacts, employment);
       this.age = age;
       this.height = height;
   }

   public int getAge() {
       return age;
   }

   public int getHeight() {
       return height;
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

    public String getInfo() {
        return super.getInfo() + "\nStudent age: " + age + "\nStudent height: " + height;

    }


}