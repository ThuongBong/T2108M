package session3.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Room extends User {
    public String room;
    public String position;
    public double roomPrice;
    public String listOfPeople;

    public List<User> users;

    //cContructor khong tham so
    public Room (){
        users = new ArrayList<>();
    }

    //Contructor co tham so
    public Room(String r, String pst, double rp, String lop) {
        this.room = r;
        this.position = pst;
        this.roomPrice = rp;
        this.listOfPeople = lop;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getListOfPeople() {
        return listOfPeople;
    }

    public void setListOfPeople(String listOfPeople) {
        this.listOfPeople = listOfPeople;
    }

    public void add(User user){
        if(price < roomPrice) {
            System.out.println("Not enough money to rent a room");
        } else {
            this.users.add(user);
        }
    }

    public void delete(){
    }
    public void show() {
        this.users.forEach(p -> System.out.println(p.toString()));
    }


}
