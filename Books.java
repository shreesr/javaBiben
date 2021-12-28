class Book{
    String name;
    int rank;
    String color;

    public void read(){
        System.out.println("You can resd the book here");
    }

    public void watch(){
        System.out.println("You can watch the book color from Here");
    }
}
public class Books {
    public static void main(String[] args) {
        Book b=new Book();
        b.name="Java";
        b.color="blue";
        b.rank=61;

        b.read();
        b.watch();
    }
}
