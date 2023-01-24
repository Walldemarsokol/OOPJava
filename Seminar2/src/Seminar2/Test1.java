package Seminar2;

public class Test1 implements Programm,Programm2 {
    int start;
    int val;
    int prev;

    @Override
    public int getNext() {
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
    int getPreview(){
        return prev;
    }

    @Override
    public void reset1() {
        start = 1;
        val = 1;
    }
}
