package com.company;

final public class Java2  extends AndroidDeveloperStudents{
    private String[] daysOfLearning;



   public Java2(int age, int height, String name, Employment employment, Contacts contacts, String[] daysOfLearning) {
       super(age, height, name, employment, contacts);
       this.daysOfLearning = daysOfLearning;

   }

   public String getDaysOfLearning() {
       String s = "";
       for (int i = 0; i < daysOfLearning.length; i++) {
           s += daysOfLearning[i] + " ";

       }
       return s;

   }

   public void under18(int age) {
       System.out.println("Student is " + age + " years old");

   }




}
