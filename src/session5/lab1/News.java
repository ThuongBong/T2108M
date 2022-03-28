package session5.lab1;

import java.util.Scanner;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    public float getAverageRate() {
        return AverageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }



    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public void Display() {
        System.out.println("ID " + getID());
        System.out.println("Title " + getTitle());
        System.out.println("Publish Date " + getPublishDate());
        System.out.println("Author " + getAuthor());
        System.out.println("Content " + getContent());
        System.out.println("AverageRate: " + getAverageRate());
    }

    int []RateList = new int[3];

    public void  Calculate(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i= 0 ; i < 3; i++){
            System.out.println("Nhập số thứ " +i);
            RateList[i] = sc.nextInt();
            sum += RateList[i];
        }
        AverageRate = (sum)/3;
        System.out.println("\nTrung binh cong: "+ AverageRate);
        return;
    }
}
