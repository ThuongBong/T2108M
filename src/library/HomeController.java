package library;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class HomeController {
    public void bookModule(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("booklist.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

    public void studentModule(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("studentlist.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));

    }

    public void rentModule(ActionEvent actionEvent) {
    }
}
