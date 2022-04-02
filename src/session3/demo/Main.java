package session3.demo;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Khổng Thị Thương";
        h.run();

        Asian a = new Asian();
        a.name = "Thích có tiền";
        a.run();
        a.say();

        Vietnamese v = new Vietnamese();
        v.name = "Việt Nam";
        v.run();
        v.say();
        v.telephone ="0123";
        v.drink();
        v.drink(15);
        v.drink(3.14);

        Hanoi hn = new Hanoi();
        hn.study();

        Vietnamese v1 = new Vietnamese("0987");
    }
}
