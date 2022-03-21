package fraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        Fraction ps3 = new Fraction();
        Fraction psThuong;
        Scanner sc = new Scanner(System.in);
        //Nhap 2 phan so
        System.out.println("Nhap vao phan so 1: ");
        ps1.nhap();
        System.out.println("Nhap vao phan so 2: ");
        ps2.nhap();

        //Hien thi 2 phan so
        System.out.println("Phan so 1 vua nhap la: ");
        ps1.hienThi();
        System.out.println("Phan so 2 vua nhap la: ");
        ps2.hienThi();

        //Rut gon 2 phan so
        System.out.println("Phan so 1 vua rut gon la: ");
        ps1.rutGon();
        System.out.println("Phan so 2 vua rut gon la: ");
        ps2.rutGon();

        //Dao nghich phan so
        System.out.println("Nghich dao phan so 1: ");
        ps1.nghichDao();
        System.out.println("Nghich dao phan so 2: ");
        ps2.nghichDao();

        //Ham cong 2 phan so
        ps3 = ps3.cong(ps1,ps2);
        System.out.println("Tong 2 phan so la: ");
        ps3.hienThi();

        //Ham tru 2 phan so
        ps3 = ps3.tru(ps1,ps2);
        System.out.println("Hieu 2 phan so la: ");
        ps3.hienThi();

        //Ham nhan 2 phan so
        ps3 = ps3.nhan(ps1,ps2);
        System.out.println("Tich 2 phan so la: ");
        ps3.hienThi();

        //Ham chia 2 phan so
        ps3 = ps3.chia(ps1,ps2);
        System.out.println("Thuong 2 phan so la: ");
        ps3.hienThi();
    }
}
