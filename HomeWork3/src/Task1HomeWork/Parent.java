package Task1HomeWork;


public class Parent extends Family implements Status {
    public Parent(String member){
        super(member);
    }

    @Override
    public void displayStatusChild(String parent1,String parent2) {
        System.out.println("Член семьи " + member + " не является ребенком родителей " + parent2 + " и "
                + parent1);
        System.out.println();
    }

    @Override
    public void displayStatusParent(String value2, String value3) {
        System.out.println("Член семьи " + member + " является родителем для " + value2 + " и "
                + value3);
        System.out.println();
    }
}
