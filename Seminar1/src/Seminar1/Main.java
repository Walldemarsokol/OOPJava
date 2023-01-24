package Seminar1;
class TwoShape {    private double height;
    private double width;
    TwoShape(double h, double w) {
        this.height = h;        this.width = w;
    }
    TwoShape(double x) {        this.height = this.width = x;
    }
    TwoShape() {
        this.height = 0;        this.width = 0;
    }
    public double getHeight() {
        return height;    }
    public double getWidth() {
        return width;    }
    public void setHeight(double height) {
        this.height = height;    }
    public void setWidth(double width) {
        this.width = width;    }
    public void showInfo() {
        System.out.println("Height: " + height);        System.out.println("Width: " + width);
    }}
class Triangle extends TwoShape {
    private String style;
    Triangle(String s, double h, double w) {        super(h, w); // Вызвать конструктор супер-класс
        setStyle(s);    }
    Triangle(String s) {
        super(); // Вызвать конструктор супер-класса по умолчанию        setStyle(s);
    }
    Triangle(String s, double x) {        super(x); // Вызвать конструктор супер-класса с одним аргументом
        setStyle(s);    }
    public String getStyle() {
        return style;    }
    public void setStyle(String style) {
        this.style = style;    }
    double area() {
        return getHeight() * getWidth() / 2;    }
    void showStyle() {
        System.out.println("Triangle " + style);    }
}

class Shapes {    public static void main(String[] args) {
        Triangle t1 = new Triangle("Закрашенный");        Triangle t2 = new Triangle("Пустой", 5.0, 1.0);
        Triangle t3 = new Triangle("Пустой", 5.0);//
//        t1.setStyle("Закрашенный");//        t1.setHeight(4.0);
//        t1.setWidth(2.0);//
//        t2.setStyle("Пустой");//        t2.setHeight(5.0);
//        t2.setWidth(1.0);
        System.out.println("Инфо t1");        t1.showStyle();
        t1.showInfo();        System.out.println("Area t1 - " + t1.area());
        System.out.println();
        System.out.println("Инфо t2");
        t2.showStyle();        t2.showInfo();
        System.out.println("Area t2 - " + t2.area());
        System.out.println();
        System.out.println("Инфо t3");        t3.showStyle();
        t3.showInfo();        System.out.println("Area t2 - " + t3.area());
    }
}


package Seminar1;
class A {    int i;
}
class B extends A {    int i; // Эта переменная i скрывает переменную i из класса А
    B(int a, int b) {
        super.i = a; // Переменная i из класса А                     // Здесь super.i ссылается на переменную i из класса А
        i = b;    }
    void show() {
        System.out.println("i в суперклассе = " + super.i);        System.out.println("i в подклассе = " + this.i);
    }}
class Test {
    public static void main(String[] args) {        B ob = new B(1, 4);
        ob.show();
    }}


    
package Seminar1;
public class Animals {    private String name;
    void speak() {
        System.out.println("Не могу говорить");    }
    String getName() {
        return this.name;    }
}
class Cat extends Animals {    @Override
    void speak() {        System.out.println("Мяу");
    }}
class Tests {
    public static void main(String[] args) {        Cat cat = new Cat();
        Animals cat2 = new Animals();
        cat.speak();        cat2.speak();
    }}