package Task8;

public class TestoviyClass {
    public static void main(String[] args) {
        Consumer<Integer> print = x -> System.out.printf("%d долларов \n",x);
        print.accept(600);
    }
}
