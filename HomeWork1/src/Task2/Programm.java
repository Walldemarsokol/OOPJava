package Task2;

public class Programm {

    public static void main(String[] args) {
        WallСabinet wallСabinet = new WallСabinet("чашка", "Иван", "шкаф");
        wallСabinet.putOnTWC();
    }
}

class Husband {
    public String name;

    public Husband(String name) {
        this.name = name;
    }

}

class Staff extends Husband {
    public String staff;

    public Staff(String staff, String name) {
        super(name);
        this.staff = staff;
    }

}

class WallСabinet extends Staff {

    String wallCabinet;

    public WallСabinet(String staff, String name, String wallCabinet) {
        super(staff, name);
        this.wallCabinet = wallCabinet;
    }

    public void putOnTWC() {
        System.out.println(name + " открывает " + wallCabinet + " и кладет туда вещь " + staff);
    }

}