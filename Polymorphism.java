package com.codewithsanjay;
class Students {
    String name;
    //int age;
    int pr;
    boolean x;


    public void getInfo(String name)
    {
        System.out.println("Name of Student : "+this.name );
    }

//    public void getInfo(int age)
//    {
//        System.out.println("Age of Student : "+ this.age );
//    }

//    public void getInfo(String name, int age)
//    {
//        System.out.println("Name of Student : " +this.name );
////        System.out.println("Name of Student : " +this.age );
//    }

    public void getInfo(int pr, boolean x)
    {
        System.out.println("precent of Student : " +this.pr );
        System.out.println("pass of Student : " +this.x );
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Students st=new Students();
        st.name= "Sanjay";
//        st.age= 25;
        st.pr =67;
        st.x= true;


        st.getInfo(st.pr, st.x);

    }
}
