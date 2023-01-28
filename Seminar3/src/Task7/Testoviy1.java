package Task7;

public class Testoviy1 {
    public static void main(String[] args) {
        Function<Integer,String> ob = x-> String.valueOf(x) + "$";
        System.out.println(ob.apply(4));
    }
}
