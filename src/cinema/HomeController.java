package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class HomeController {
    public void DsVe(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tickets.fxml"));
        Main.rootStage.setScene(new Scene(root, 1000, 650));
    }
}
