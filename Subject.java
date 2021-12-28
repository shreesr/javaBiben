import java.util.Scanner;

public class Subject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a choice : ");
      int  corse =scan.nextInt();
        System.out.println("Yiu Entered String is : ");

        switch (corse){
            case 1 :
                System.out.println("You Entered 1." +
                        "it is for Java." +
                        "it has 2 Types." +
                        "1.Core Java." +
                        "2.Advance Java");
                break;
            case 2 :
                System.out.println("You Entered 2." +
                        "it is for HTML." +
                        "It is used for Design.");
                break;
            default:
                System.out.println("You have chose wrong.");

        }
    }
}
