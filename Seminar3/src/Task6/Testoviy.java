package Task6;

public class Testoviy {
    public static void main(String[] args) {
        UnaryOperator<Integer> odject = x -> x*x;
        System.out.println(odject.apply(5));
    }
}
