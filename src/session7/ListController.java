package session7;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable {
//    public Text listView;
    public TableView<Product> tbView;
    public TableColumn <Product, String> cName;
    public TableColumn <Product, Double> cPrice;
    public TableColumn <Product, Integer> cAmount;
    public TableColumn <Product, String> cUnit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cName.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        cPrice.setCellValueFactory(new PropertyValueFactory<Product, Double>("price"));
        cAmount.setCellValueFactory(new PropertyValueFactory<Product, Integer>("amount"));
        cUnit.setCellValueFactory(new PropertyValueFactory<Product, String>("unit"));
        tbView.setItems(Main.productList);

    }

    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("asm-ss7.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));

    }
}
