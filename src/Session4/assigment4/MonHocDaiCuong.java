package Session4.assigment4;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;

public class MonHocDaiCuong extends MonHoc{
    ArrayList<DanhSachLopHoc> ClasList = new ArrayList<>();
    @Override
    public void themLopHoc(String name, int soluonghocsinh) {
    for (DanhSachLopHoc d : ClasList){
        if (d.name == name){
            return;
        }
    }
    ClasList.add(new DanhSachLopHoc(name,soluonghocsinh));
    }

    @Override
    public void xoaLopHoc(String name) {
        for (DanhSachLopHoc d : ClasList) {
            if (d.name == name) {
                ClasList.remove(d);
                return;
            }
        }
    }

    @Override
    public void sapXep() {
        String []array = new String[10];
        int []arr = new int[10];
        int i = 0, count = 0;
        for (DanhSachLopHoc d : ClasList) {
            arr[i] = d.soluonghocsinh;
        }
        for (i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++){
                if (arr[j] > arr[i]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        for (i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public void inDanhSach() {
        this.ClasList.forEach(p -> System.out.println(p.name + "\n" +  p.soluonghocsinh));

    }
}
