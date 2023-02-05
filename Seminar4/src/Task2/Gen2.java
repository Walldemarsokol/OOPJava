package Task2;

public class Gen2<T,V> {
    T ob1;
    V ob2;

    Gen2(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes(){
        System.out.println("Type T is " +ob1.getClass().getName());
        System.out.println("Type V is " +ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }
}

class SimpGen2{
    public static void main(String[] args) {
        Gen2<Integer,String> ob2;
        ob2 = new Gen2<Integer,String>(88,"Hello");

        ob2.showTypes();

        int v = ob2.getOb1();
        System.out.println("Value " + v);
        String str = ob2.getOb2();
        System.out.println("Value " + str);
    }
}
