package Task1HomeWork;


import java.util.ArrayList;

public abstract class Family {
    public String member;
    public Family(String member){
        this.member = member;
    }

    public void familyTest(String arg,ArrayList list){
        StatusControl<String> isIn = (a,b) -> b.indexOf(a)!= -1;

        if(isIn.test(arg, String.valueOf(list))){
            System.out.println("Да," + arg+ " состоит в семейном древе!");
            System.out.println();
        }else {
            System.out.println("Искомый человек " + arg + " в семейном древе не найден!");
            System.out.println();
        }
    }


}
