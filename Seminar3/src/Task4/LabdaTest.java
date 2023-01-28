package Task4;

import java.util.function.Predicate;
public class LabdaTest {
    public static void main(String[] args) {
        Predicate<Integer> obj = x -> x>0;
        System.out.println(obj.test(5));
        System.out.println(obj.test(-2));
    }
}
