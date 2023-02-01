package TaskSum;

public  class Program{
    public static void main(String[] args) {
        Sum sum = (a,b) ->a+b;
        System.out.println(sum.test(5,6));
    }
}