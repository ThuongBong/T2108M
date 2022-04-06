package session9.lab1;

import javafx.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static ObservableList<PhoneNumber> phoneList = FXCollections.observableArrayList();

    public static Stage rootStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("phonelist.fxml"));
        primaryStage.setTitle("T2108M");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
    public static void main(String[] args) {
        phoneList.add(new PhoneNumber("Thuong", "0123456, 0254786"));
        phoneList.add(new PhoneNumber("Thuy", "034568"));
        launch(args);
    }
}
