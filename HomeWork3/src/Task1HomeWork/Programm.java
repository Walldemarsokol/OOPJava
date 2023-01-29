package Task1HomeWork;

import java.util.ArrayList;

public class Programm {

    public static void main(String[] args) {
        var ivan = new Child("Ivan");
        var maria = new Parent("Maria");
        var oleg = new Parent("Oleg");
        ivan.displayStatusChild(maria.member, oleg.member);
        ivan.displayStatusParent(maria.member, oleg.member);
        maria.displayStatusChild(ivan.member, oleg.member);

        ArrayList familyTree = new ArrayList<>();
        familyTree.add("Ivan");
        familyTree.add("Oleg");
        familyTree.add("Maria");

        ivan.familyTest("Google",familyTree);
        maria.familyTest("Oleg",familyTree);
        oleg.familyTest("Maria",familyTree);

    }

}

