package session7;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static ObservableList<Product> productList = FXCollections.observableArrayList();

    public static Stage rootStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        primaryStage.setTitle("T2108M");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        productList.add(new Product("lược", 2000.0, "chiếc", 2));
        productList.add(new Product("kéo", 3000.0, "chiếc", 3));
        launch(args);
    }
}