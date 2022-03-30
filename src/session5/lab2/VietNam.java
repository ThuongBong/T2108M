package session5.lab2;

import java.util.Scanner;

public class VietNam extends KhachHang {
    String DTKH;
    int[]DinhMuc = {50, 100, 200};
    public void Nhap(){
        super.Nhap();
        System.out.println("\tNhập Đối Tượng Khách Hàng: ");
        DTKH = sc.nextLine();
        count++;
    }
    public int ThanhTien(){
        if (SoLuong < 50){
            return SoLuong * 1000;
        }
        else if (SoLuong < 100){
            return DinhMuc[0] * 1000 + (SoLuong-DinhMuc[0]) * 1200;
        }
        else if (SoLuong < 200){
            return DinhMuc[1] * 1200 + (SoLuong-DinhMuc[1]) * 1500;
        }
        else {
            return DinhMuc[2] * 1500 + (SoLuong-DinhMuc[2]) * 2000;
        }
    }
    public void TongSL(){
        System.out.println("Tổng Số Lượng Khách Hàng Việt Nam là: " + count);
    }
    public void IN(){
        super.IN();
        System.out.println("\tĐối Tượng Khách Hàng: " + DTKH);
        System.out.println("\tThành Tiền: " + ThanhTien() + "đ\n");
    }
}
