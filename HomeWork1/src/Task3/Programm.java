package Task3;

public class Programm {
    public static void main(String[] args) {
        Contact event = new Contact("Барсик","Иван","'зовет'");
        event.humanVoice();
        event.catGo();
        event.catNotGo();
    }
}

class Human{
    public String name;

    public Human(String name){
        this.name = name;
    }
    public void humanVoice(){
        System.out.println( name + " говорит 'кис-кис'.");
    }
}

class Cat extends Human{
    public String catName;

    public Cat(String name,String catName){
        super(name);
        this.catName = catName;
    }

}

class Contact extends Cat{
    public String event;

    public Contact(String catName,String name,String event){
        super(name,catName);
        this.event = event;
    }

    void catGo(){
        System.out.println(name + " произвел действие " + event + " на кошку " + catName + " и она идет к нему." );
    }
    void catNotGo(){
        System.out.println(name + " произвел действие " + event + " на кошку " + catName + " но она не идет к нему." );
    }
}