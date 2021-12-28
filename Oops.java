package com.codewithsanjay;

class Student {

    String name;

    int age;



   public void getInfo() {

        System.out.println("The name of this Student is " + this.name);

        System.out.println("The age of this Student is " + this.age);

    }

    public void age() {
    }

    public void name() {
    }
}

public class Oops {

    public static void main(String args[]) {

        Student s1 = new Student();

        s1.name = "Sanjay";

        s1.age = 28;

        s1.getInfo();

        Student s2 = new Student();

        s2.name = "Surekha";

        s2.age = 26;

        s2.getInfo();

    }

}

