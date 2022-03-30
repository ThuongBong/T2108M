package session5.lab2;

public class NuocNgoai extends KhachHang {
    String QuocTich;
    int[]arr = new int[10];
    public void Nhap(){
        super.Nhap();
        System.out.println("\tNhập Quốc Tịch: ");
        QuocTich = sc.nextLine();
        arr[count] = ThanhTien();
        count++;
    }
    public int ThanhTien(){
        return SoLuong * DonGia();
    }
    public void TongSL(){
        System.out.println("Tổng Số Lượng Khách Hàng Nước Ngoài là: " + count);
    }
    public int TBTT(){
        int kq = 0;
        for (int i = 0; i < count; i++){
            kq += arr[i];
        }
        return kq/count;
    }
    public void IN(){
        super.IN();
        System.out.println("\tQuốc Tịch: " + QuocTich);
        System.out.println("\tThành Tiền: " + ThanhTien() + "đ\n");
    }

}
