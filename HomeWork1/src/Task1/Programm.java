package Task1;

public class Programm {

    public static void main(String[] args) {
        Child oleg = new Child("Oleg");
        Parent olga = new Parent("Olga");
        Parent ivan = new Parent("Ivan");

        oleg.parentsStatus(olga.child);
        oleg.parentsStatus(ivan.child);
        ivan.childStatus(oleg.child);
        olga.childStatus(oleg.child);

    }

}


class Child {

    String child;

    public Child(String child) {
        this.child = child;
    }

    public void parentsStatus(String parent) {

        System.out.println("Персона " + parent + " является родителем ребенка " + child);
    }

}

class Parent extends Child {

    public Parent(String parent) {
        super(parent);
    }


    public void childStatus(String parent) {
        System.out.println("Персона " + parent + " является ребенком родителя " + child);
    }

}