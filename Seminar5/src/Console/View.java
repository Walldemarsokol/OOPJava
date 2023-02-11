package Console;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    public double getValue(String data){
        System.out.println(data);
        return scanner.nextDouble();
    }

    public void show(double value,String data){
        System.out.printf("%s %s",data,value);
    }

}
