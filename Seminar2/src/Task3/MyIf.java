package Task3;

public interface MyIf {
    int getUserId();
    default int getAdminId(){
        return 1;
    }
    static int getUniversalId(){
        return 100500;//статический метод.Он вызывается без создания объекта
    }
}
