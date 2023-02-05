package Task4;

public interface Contain<T>{
    boolean contains(T o);
}

class Gen4<T> implements Contain<T>{

    T[] arr; // любой класс реализующий интерфейс так же должн быть обобщенным

    Gen4(T[] o){
        arr = o;
    }
    @Override
    public boolean contains(T o) { //реализация интерфейса для проверки вхождения элемента в массив
        for (T x:arr) {
            if(x.equals(o)){
                return true;
            }
        }
        return false;
    }
}

class Gen5{
    public static void main(String[] args) {
        Integer[] x = {1,2,3}; //не можем использовать примитив при обобщении

        Gen4<Integer> ob = new Gen4<>(x);

        if(ob.contains(2)){
            System.out.println("2 is contains in ob");
        }else{
            System.out.println("2 is not contains in ob");
        }

        System.out.println();

        if(ob.contains(5)){
            System.out.println("5 is contains in ob");
        }else{
            System.out.println("5 is not contains in ob");
        }
    }
}
