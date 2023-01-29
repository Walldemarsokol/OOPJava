package Task2HomeWork3;


public class Man implements ManHasToCallCat {


    public void FeedingDog(){
        System.out.println("Man feeding the dog");
        System.out.println("________________");
    }

    @Override
    public void CallingCat(){
        System.out.println("go to eat...");
        System.out.println("_________");
    }

    public void Feeding() {
        System.out.println("Man feeding the cat");
        System.out.println("___________");
    }

    @Override
    public void manStatus(int a,int b) {
        StatusPets<Integer> status  = (x,y) -> x > y;
        if(status.status(a,b)){
            System.out.println("Man cant be feed pet.");
        }else{
            System.out.println("Man can be feed pet.");
        }
    }

}