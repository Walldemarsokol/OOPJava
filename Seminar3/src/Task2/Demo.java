package Task2;

public class Demo {
    public static void main(String[] args) {
        Inter f = (n) -> {
            int result = 1;
            n = n<0?-n:n;
            for(int i = 2;i<=n/i;i++){
                if((n%i)==0){
                    result = i;
                    break;
                }
            }
            return result;
        };
        System.out.println("Наименьшим делителель 12 является " + f.func(12));
        System.out.println("Наименьшим делителель 12 является " + f.func(11));
    }
}
