package Task5;

import Task2.Gen2;

public class Gen5 {
    private int sum;

    <T extends Number> Gen5(T arg){
        sum=0;
        for (int i = 0;i<=arg.intValue();i ++){
            sum+=i;
        }
    }

    int getSum(){
        return sum;
    }
}

class en5Demo{
    public static void main(String[] args) {
        Gen5 ob = new Gen5(4.0);
        System.out.println("Сумма целых чисел от 0 до 4 равна " + ob.getSum());
    }
}
