package Task5;

import java.util.function.BinaryOperator;

public class LambdaApp {
    public static void main(String[] args) {
        BinaryOperator<Integer> test = (x,y) -> x*y;
        System.out.println(test.apply(2,3));
        System.out.println(test.apply(4,1));

    }
}
