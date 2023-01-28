package Task3;

public class GenericsTest {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("2 является делителем 10");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("3 не является делителем 10");
        }
        System.out.println("  ");

        SomeTest<Double> isFactor2 = (n, d) -> (n % d) == 0;

        if (isFactor2.test(10.0, 2.0)) {
            System.out.println("2 является делителем 10");
        }
        if (!isFactor2.test(10.4, 3.6)) {
            System.out.println("3 не является делителем 10");
        }
        System.out.println("  ");

        SomeTest<String> isIn = (a,b) -> a.indexOf(b)!= -1;
        String str = "Обобщенный функциональный интерфейс";
        System.out.println("Тестируемая строка " + str);
        if(isIn.test(str,"Слово")){
            System.out.println("Слово найдено!");
        }else {
            System.out.println("Не найдено!");
        }
    }
}
