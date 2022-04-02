package session2;

import java.util.Scanner;

public class SinhVien { //Khai báo lớp
    String name;
    int age;
    Classroom myclass;

    public SinhVien() {
        //Constructor là hàm khởi tạo, tên phải giống hệt tên lớp
        //Không có dữ liệu trả về
        //Tự động chạy khi tạo đối tượng mới
        this.inputName();


    }

    void study() {
        System.out.println("Sinh vien" + myclass.name + "co lop hoc" + myclass.room);
        //this là đối tượng ngầm định bên trong class.
        // Thời điểm này, đối tượng nào đang chạy this sẽ đại diện cho nó
    }

    void inputName() {
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
    }

}
