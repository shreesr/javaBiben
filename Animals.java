interface Animal{
    void run();
}
interface Bird1{
    void fly();
}

class Camel implements Animal{
    public void run(){
        System.out.println("Camel Run in Desert.");
    }
}
class Kingfisher implements Bird1{
    public void fly(){
        System.out.println("Kingfisher Fly in the Sky.");
    }
}
public class Animals {
    public static void main(String[] args) {
        Camel c=new Camel();
        c.run();

        Kingfisher k=new Kingfisher();
        k.fly();
    }
}
