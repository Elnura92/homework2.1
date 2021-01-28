package com.company;
import java.util.Arrays;

final public class Java2  extends AndroidDeveloperStudents{
    private String[] daysOfLearning;

    public Java2(String name, Contacts contacts, Employment employment, int age, int height, String[] daysOfLearning) {
        super(name, contacts, employment, age, height);
        this.daysOfLearning = daysOfLearning;
    }





   public String getDaysOfLearning() {
      return Arrays.toString(daysOfLearning);
   }

   public void under18(int age) {
       System.out.println("Student is " + age + " years old");

   }

   public String getInfo() {
       return super.getInfo() + "\nDays of programming classes: " + Arrays.toString(daysOfLearning);
   }




}
