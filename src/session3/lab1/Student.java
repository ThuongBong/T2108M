package session3.lab1;

import java.util.Scanner;

public class Student extends Person{
    public String maSV;

    public void setDiemThi(Float diemThi) {
        this.diemThi = diemThi;
    }

    public Float diemThi;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String email;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.println("Nhap diem thi: ");
        diemThi = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhap email: ");
        email = sc.nextLine();
    }

    public void inThongTin(){
        super.inThongTin();
        System.out.println("Ma sinh vien: "+this.maSV);
        System.out.println("Diem thi: "+this.diemThi);
        System.out.println("Email: "+this.email);
    }

    public void kiemTraHocBong(){
        if (diemThi >= 8){
            System.out.println("Duoc hoc bong");
        } else {
            System.out.println("Khong duoc hoc bong");
        }
    }
}
