package com.codewithsanjay;
class Student2 {

    String name;

    int age;



    Student2(String name, int age) {

        this.name = name;

        this.age = age;

    }

    public Student2() {

    }


    public void getInfo() {
        System.out.println("This is the Student Information");
        System.out.println("This is the Student Name: "+this.name);
        System.out.println("This is the Student Age: "+this.age);
    }
}
public class Constructor{
    public static void main(String[] args) {
        Student2 s1= new Student2();

        s1.name = "Sanjay";
        s1.age = 25;

        s1.getInfo();

    }
}