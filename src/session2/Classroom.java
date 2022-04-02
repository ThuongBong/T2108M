package session2;

import java.util.Scanner;

public class Classroom {
    String name;
    String room;
    String schoolName;

    public Classroom() {
        Scanner sc = new Scanner(System.in);
        this.schoolName = sc.nextLine();
        this.name = sc.nextLine();
        this.schoolName = sc.nextLine();
    }

    public void khaiGiang() {
        System.out.println("Khai Giang..");
    }

    public void thiHetMon() {
        System.out.println("Thi Het Mon..");
    }

    public void ketThuc() {
        System.out.println("Ket Thuc!");
    }
}
