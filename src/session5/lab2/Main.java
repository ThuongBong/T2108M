package session5.lab2;

public class Main {
    public static void main(String[] args) {
        VietNam vn = new VietNam();
        NuocNgoai nn = new NuocNgoai();

        // Khách hàng việt nam
        vn.Nhap();
        vn.IN();

        //khách hàng nước ngoài
        nn.Nhap();nn.Nhap();
        nn.IN();

        //
        vn.TongSL();
        nn.TongSL();

        //
        System.out.println("Thành Tiền Trung Bình Của Người Nước Ngoài = " + nn.TBTT());
    }
}
