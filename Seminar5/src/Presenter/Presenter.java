package Presenter;

import Console.View;
import Model.SumCalc;

public class Presenter {
    View view;
    SumCalc model;
    public  Presenter(SumCalc m, View v){
        this.model = m;
        this.view = v;
    }

    public void buttonClick(){
        double x = view.getValue("Введите число х: ");
        double y = view.getValue("Введите число у: ");
        model.setX(x);
        model.setY(y);
        double res = model.result();
        view.show(res,"Sum = ");
    }
}

class Test1{
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumCalc(),new View());
        p.buttonClick();
    }
}