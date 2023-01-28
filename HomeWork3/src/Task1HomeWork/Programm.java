package Task1HomeWork;

public class Programm {

    public static void main(String[] args) {
        var ivan = new Child("Ivan");
        var maria = new Parent("Maria");
        var oleg = new Parent("Oleg");
        ivan.displayStatusChild(maria.member, oleg.member);
        ivan.displayStatusParent(maria.member, oleg.member);
        maria.displayStatusChild(ivan.member, oleg.member);

    }

}

