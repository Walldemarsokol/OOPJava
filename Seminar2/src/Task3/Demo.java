package Task3;

public class Demo {
    public static void main(String[] args) {
        MyIfIm my = new MyIfIm();
        System.out.println("Идентефикатор пользователя " + my.getUserId());
        System.out.println("Идентефикатор админа " + my.getAdminId());
        int id = MyIf.getUniversalId();//вызов статического метода
        System.out.println("Идентификатор универсальный " + id);
        System.out.println("+++++ " + MyIf.getUniversalId());// вызов метода без создания объекта
    }
}
