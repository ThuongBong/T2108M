package fraction;

import java.util.Scanner;

public class Fraction {
    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    int tuso;
  int mauso;

  //Ham nhap phan so
    public void nhap(){
        int ts, ms;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao tu so: ");
            ts = sc.nextInt();
            System.out.println("Nhap vao mau so: ");
            ms = sc.nextInt();
            if(ms==0){
                System.out.println("Vui long nhap lai mau so");
            }
        }while (ms==0);
        tuso = ts;
        mauso = ms;

    }
    //Ham hien thi phan so
    public void hienThi(){
         if (mauso == 1){
            System.out.println(tuso);
        }else {
            System.out.println(tuso + "/" + mauso);
        }
    }
    //Ham rut gon phan so
    public void rutGon(){
        //Tim UCLN
        int a = tuso;
        int b = mauso;
        int uc = a % b;
        while (uc != 0){
            a = b;
            b = uc;
            uc = a % b;
        }
        //rut gon
        tuso /= b;
        mauso /= b;
        if (mauso == 1){
            System.out.println(tuso);
        }else {
            System.out.println(tuso + "/" + mauso);
        }
    }
    //Ham nghich dao
    public  void nghichDao(){
        if (mauso == 1){
            System.out.println(tuso);
        }else {
            System.out.println(tuso + "/" + mauso);
        }
    }
    //Ham cong 2 phan so
    public Fraction cong(Fraction ps1, Fraction ps2) {
        Fraction ps3 = new Fraction();
        if (mauso != mauso){
            ps3.tuso = ps1.tuso + ps2.tuso;
        }else {
            ps3.tuso = ps1.tuso * ps2.mauso + ps1.mauso * ps2.tuso;
            ps3.mauso = ps1.mauso * ps2.mauso;
        }
        return ps3;
    }
    //Ham tru 2 phan so
    public Fraction tru(Fraction ps1, Fraction ps2){
        Fraction ps3 = new Fraction();
        if (mauso != mauso){
            ps3.tuso = ps1.tuso - ps2.tuso;
        }else {
            ps3.tuso = ps1.tuso * ps2.mauso - ps1.mauso * ps2.tuso;
            ps3.mauso = ps1.mauso * ps2.mauso;
        }
        return ps3;
    }
    //Ham nhan 2 phan so
    public Fraction nhan(Fraction ps1, Fraction ps2){
        Fraction ps3 = new Fraction();
        ps3.tuso = ps1.tuso * ps2.tuso;
        ps3.mauso = ps1.mauso * ps2.mauso;
        return ps3;
    }
    //Ham chia 2 phan so
    public Fraction chia(Fraction ps1, Fraction ps2){
        Fraction ps3 = new Fraction();
        ps3.tuso = ps1.tuso * ps2.mauso;
        ps3.mauso = ps1.mauso * ps2.tuso;
        return ps3;
    }
}
