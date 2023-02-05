package Task1;

public class Gen<T> {
    T ob;//объявить объект типа Т
    Gen(T o){// передать конструктору объект типа Т
        ob=o;
    }

    T getOb(){ //вернуть объект ob из метода
        return ob;
    }

    void showT() { // отобразить тип Т
        System.out.println("Type T is " +ob.getClass().getName());
    }
}

class GenDemo{
    public static void main(String[] args) {
        Gen<Integer> iob; //создаем сылку на объект типа Gen<Integer>
        iob = new Gen<Integer>(88);//создание экземпляра типа Integer

        iob.showT();//отобразить тип данный iob

        int v = iob.getOb();//присвоили примитиву значение объекта iob
        System.out.println("Value " + v);

        System.out.println();

        Gen<String> str = new Gen<String>("hello");
        str.showT();    //отобразили тип данных iob
        String str1 = str.getOb();// присвоили значение объекта iob

        System.out.println("Value "+ str1);
    }


}
