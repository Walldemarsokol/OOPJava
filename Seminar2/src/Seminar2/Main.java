package Seminar2;

public class Main {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        Test2 ob2 = new Test2();
        Programm ob3;
        for(int i=0;i<5;i++){
            ob3 = ob;//практически такое же действие Test1 ob = new Test1();
            System.out.println("Следующее значение " + ob3.getNext());
            ob3 = ob2;
            System.out.println("-----------------------");
            System.out.println("Следующее значение " + ob3.getNext());
        }
        System.out.println("Сброс");
        ob.reset();
        for(int i=0;i<5;i++){
            System.out.println("Следующее значение " + ob.getNext());
        }
        System.out.println("Начальное значение равно 100");
        ob.setStart(100);

        for(int i=0;i<5;i++){
            System.out.println("Следующее значение " + ob.getNext());
        }
    }
}
