package Task2HomeWork3;

public class Programm {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        Dog dog = new Dog("Spot");
        Man man = new Man();
        Pets pets = new Pets() {
            @Override
            public void eat() {
                super.eat();
            }
        };
        dog.MakeSound();
        man.FeedingDog();
        dog.eat();

        man.CallingCat();
        cat.MakeSound();

        man.Feeding();
        cat.eat();

        pets.eat();


        man.manStatus(3,2);
        cat.statusPet();
        dog.statusPet();


    }
}