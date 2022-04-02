package session3.demo;

public class Hanoi extends Vietnamese {
    public void eat(){
        System.out.println("Tel: "+this.telephone);
    }

    public void study(){
        System.out.println("LB Study");
        super.study();
    }
}
