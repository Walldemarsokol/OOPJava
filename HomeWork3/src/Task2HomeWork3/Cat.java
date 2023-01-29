package Task2HomeWork3;

public class Cat extends Pets implements HaveToMakeSound {
    String name;
    public Cat(String name){
        this.name = name;
    }
    @Override
    public void MakeSound(){
        System.out.println("meow");
        System.out.println("___________");
    }

    public void eat() {
        System.out.println("cat eating...");
        System.out.println("___________");
    }

    @Override
    public void statusPet() {
        System.out.println(name + "is hungry. Its sad.");
    }

    public  void statusPet(String arg){
        System.out.println(arg + " cant eat,because man don`t have can with food. " + arg + " hungry!");
    }
}