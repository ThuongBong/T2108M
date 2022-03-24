package session3.lab1;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        GiaoVien gv = new GiaoVien();
       System.out.println("\t\tVui long nhap thong tin sinh vien: \n");
        st.nhapThongTin();
        System.out.println("\t\tVui long nhap thong tin giao vien: \n");
        gv.nhapThongTin();

        System.out.println("\t\tThong tin cua sinh vien: \n");
        st.inThongTin();
        st.kiemTraHocBong();
        System.out.println("\n\t\tThong tin cua giao vien: \n");
        gv.inThongTin();

    }
}
