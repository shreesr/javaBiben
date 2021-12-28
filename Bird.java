abstract class Birds{
    abstract void fly();
}

class Pegon extends Birds {
    public void fly() {
        System.out.println("Fly in the Sky.");
    }
}
    class Egle extends Birds{
        public void fly(){
            System.out.println("Fly bIn the deep sky.");
        }
    }


public class Bird {
    public static void main(String[] args) {
      Pegon b=new Pegon();
      b.fly();

      Egle e=new Egle();
      e.fly();
    }
}
