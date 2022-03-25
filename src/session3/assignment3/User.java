package session3.assignment3;

import java.security.PublicKey;
import java.util.Scanner;

public class User {
    public String name;
    public int age;
    public String email;
    public  String phone;
    public double price;

    //Contructor co tham so
    public User(String n, int a, String e, String p, double pr) {
        this.name = n;
        this.age = a;
        this.email = e;
        this.phone = p;
        this.price = pr;
    }

    //Contructor khong tham so
    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}
