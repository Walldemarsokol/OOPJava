package Task2HomeWork3;


public class Dog extends Pets implements HaveToMakeSound{
    String name;
    public Dog(String name){
        this.name = name;
    }
    public void MakeSound(){
        System.out.println("Bark");
        System.out.println("____________");
    }
    public void eat(){

        System.out.println("Dog eating...");
        System.out.println("_____________");
    }

    @Override
    public void statusPet() {
        System.out.println(name + "is hungry. Its sad.");
    }


}