class WildAnimal{
    String name;
    int count;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int count){
        System.out.println(count);
    }
    public void printInfo(String name,int count){
        System.out.println(name + " " + count);

    }
}

public class WildAnimals {
    public static void main(String[] args) {
       WildAnimal wa=new WildAnimal();
       wa.name="Tiger";
       wa.count=27;

       wa.printInfo(wa.name);

       wa.printInfo(wa.name,wa.count);
    }
}
