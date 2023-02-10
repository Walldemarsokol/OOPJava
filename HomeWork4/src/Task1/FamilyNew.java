package Task1;

public class FamilyNew <T>{
    T ob;

    FamilyNew(T o){
        ob = o;
    }

    public T getOb() {
        return ob;
    }

    void showStatus(){
        System.out.println("Личность " + ob + " являетя члоеном семьи из древа");
    }
}
