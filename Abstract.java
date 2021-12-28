package com.codewithsanjay;

abstract class Animal{
    abstract void walk();

    static class Horse extends Animal{
        public void walk() {
            System.out.println("Walk on 4 legs");
        }
    }
    static class Chicken extends Animal{
        public void walk(){
            System.out.println("Walk on 2 Legs");
        }
    }
}
public class Abstract {
    public static void main(String[] args) {
        Animal.Horse horse=new Animal.Horse();
        horse.walk();
        Animal.Chicken chicken = new Animal.Chicken();
        chicken.walk();
    }
}
