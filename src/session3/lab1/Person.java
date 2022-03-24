package session3.lab1;

import java.util.Scanner;

public class Person {
    public String name;
    public  String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String birthday;
    public String address;

    public Person(){
       // System.out.println("Contructor khong tham so");
    }

    public Person(String n, String g, String b, String a){
        name = n;
        gender = g;
        birthday = b;
        address = a;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        birthday = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();

    }

    public void inThongTin(){
        System.out.println("Ten: "+this.name);
        System.out.println("Gioi tinh: "+this.gender);
        System.out.println("Ngay sinh: "+this.birthday);
        System.out.println("Dia chi: "+this.address);

    }
}
