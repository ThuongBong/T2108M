package session5.lab1;

public class Main {
    public static void main(String[] args) {
        News n = new News();
        n.setID(10);
        n.setTitle("Diem sinh Vien");
        n.setPublishDate("14/07/2001");
        n.setAuthor("Thương");
        n.setContent("Vui ve khong quao");
        n.Calculate();
        n.getAverageRate();
        n.Display();
    }
}
