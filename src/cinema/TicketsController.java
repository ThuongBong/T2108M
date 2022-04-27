package cinema;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TicketsController implements Initializable {
    public TableView<Tickets> sTickets;
    public TableColumn<Tickets,Integer> sMaVe;
    public TableColumn<Tickets, Integer> sMaLichChieu;
    public TableColumn<Tickets, Integer> sMaGhe;
    public TableColumn<Tickets, Button> sEdit;
    public TableColumn<Tickets, Button> sDelete;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sMaVe.setCellValueFactory(new PropertyValueFactory<>("MaVe"));
        sMaLichChieu.setCellValueFactory(new PropertyValueFactory<>("MaLichChieu"));
        sMaGhe.setCellValueFactory(new PropertyValueFactory<>("MaGhe"));
        sEdit.setCellValueFactory(new PropertyValueFactory<>("edit"));
        sDelete.setCellValueFactory(new PropertyValueFactory<>("delete"));

        try {
            TickestRepository tr = new TickestRepository();
            ArrayList<Tickets> at = tr.list();
            ObservableList<Tickets> list = FXCollections.observableArrayList();
            list.addAll(at);
            sTickets.setItems(list);

        }catch (Exception e){

        }
    }


    public void AddTickets(ActionEvent actionEvent) throws IOException, IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ticketsform.fxml"));
       cinema.Main.rootStage.setScene(new Scene(root, 1100, 650));
    }

    public void Back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("homeMenu.fxml"));
        Main.rootStage.setScene(new Scene(root, 1000, 650));
    }
}
