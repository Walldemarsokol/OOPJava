package Task1HomeWork;


import java.util.ArrayList;

public class Child extends Family implements Status {

    public Child(String member){
        super(member);
    }


    @Override
    public void displayStatusChild(String  value2,String value3) {
        System.out.println("Член семьи " + member + " является ребенком родителей " + value2 + " и "
                + value3);
        System.out.println();
    }

    @Override
    public void displayStatusParent(String value2, String value3) {
        System.out.println("Член семьи " + member + " не является родителем для " + value2 + " и "
                + value3);
        System.out.println();
    }
}
