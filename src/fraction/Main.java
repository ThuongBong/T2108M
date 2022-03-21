package fraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        Fraction ps3 = new Fraction();
        Scanner sc = new Scanner(System.in);
        //Nhap 2 phan so
        System.out.println("\t\tNhap vao phan so 1: \n");
        ps1.nhap();
        System.out.println("\t\tNhap vao phan so 2: \n");
        ps2.nhap();

        //Hien thi 2 phan so
        System.out.println("Phan so 1: ");
        ps1.hienThi();
        System.out.println("Phan so 2: ");
        ps2.hienThi();

        //Rut gon 2 phan so
        System.out.println("Phan so 1 rut gon: ");
        ps1.rutGon();
        System.out.println("Phan so 2 rut gon: ");
        ps2.rutGon();

        //Dao nghich phan so
        System.out.println("Nghich dao phan so 1: ");
        ps1.nghichDao();
        System.out.println("Nghich dao phan so 2: ");
        ps2.nghichDao();

        //Ham cong 2 phan so
        ps3 = ps3.cong(ps1,ps2);
        System.out.println("Tong 2 phan so: ");
        ps3.rutGon();

        //Ham tru 2 phan so
        ps3 = ps3.tru(ps1,ps2);
        System.out.println("Hieu 2 phan so: ");
        ps3.rutGon();

        //Ham nhan 2 phan so
        ps3 = ps3.nhan(ps1,ps2);
        System.out.println("Tich 2 phan so: ");
        ps3.rutGon();

        //Ham chia 2 phan so
        ps3 = ps3.chia(ps1,ps2);
        System.out.println("Thuong 2 phan so: ");
        ps3.rutGon();
    }
}
