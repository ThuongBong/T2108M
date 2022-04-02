package session3.demo;

public class Vietnamese extends Asian {
    public String telephone;
    public  Vietnamese() {

    }

    public Vietnamese(String telephone){
        this.telephone = telephone;
    }

    public void drink(){
        System.out.println("Drink vodka");
    }

    public void drink(int money){
        System.out.println("Drink Chivas");
    }

    public void drink(double balance){
        System.out.println("Drink Drum");
    }

    public void study(){
        System.out.println("VN Study");
        System.out.println("VN Study");
        System.out.println("VN Study");
        System.out.println("VN Study");
        System.out.println("VN Study");
    }
}
