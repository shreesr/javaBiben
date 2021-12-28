class Bread{
    String nameofBread;
    String color;
    int token;

    public void printinfo(){
        System.out.println("Name of the Bread is :"+this.nameofBread);
        System.out.println("Color of the Bread is : "+this.color);
        System.out.println("Token you have is : "+this.token);

    }
    Bread(){
        System.out.println("Constroctor is called");
 }
//    Bread (String nameofBread, String color,int token){
//        this.nameofBread=nameofBread;
//        this.color=color;
//        this.token=token;
//    }
    Bread(Bread b2){
        this.nameofBread=b2.nameofBread;
        this.color=b2.color;
        this.token=b2.token;
    }
}

public class Breads {
    public static void main(String[] args) {
        Bread b1=new Bread();
        b1.nameofBread="Labrador";
        b1.color="Black";
        b1.token=61;

        b1.printinfo();
        Bread b2=new Bread(b1);
        b2.printinfo();
    }
}
