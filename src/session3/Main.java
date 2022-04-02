package session3;

import session2.SinhVien;
import session3.demo.Vietnamese;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arl = new ArrayList();
        arl.add(1);
        arl.add("Hello");
        arl.add(new SinhVien());

        //quy dinh ro rang kieu du lieu cua phan tu
        ArrayList<Integer> arrNum = new ArrayList<Integer>();
        arrNum.add(5);
        arrNum.add(2);
//        arrNum.add(3.14); chi duoc nhap kieu du lieu so nguyen
//        arrNum.add("Hello"); cac kieu du lieu khac phai duoc nhap dung dinh dang
        ArrayList<String> arrS = new ArrayList<>();
        System.out.println("arrNum[0]= "+arrNum.get(0));//arrNum[0]
        arrNum.remove(2); //xoa so 2 khoi mang

        ArrayList<SinhVien> arrSV = new ArrayList<>();
        arrSV.add(new SinhVien());

        Vietnamese v1 = new Vietnamese();

    }
}
