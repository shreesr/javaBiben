package bank;

class Account{
    public String name;
    protected String email;
    private String password;
    protected int id;

    // getter and setter
    public String getter(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password= pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc1 =new Account();
        acc1.name="Sanjay Patil";
        acc1.email = "sanjayparil@gmail.com";
        acc1.id = 1;
        acc1.setPassword("abcd");

        System.out.println("Account id : "+acc1.id);
        System.out.println("Account Holder Name : "+acc1.name);
        System.out.println("Account Holder Email : "+acc1.email);
        System.out.println("Account Holder Password : "+acc1.getter());

    }
}
