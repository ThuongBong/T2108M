package session9.lab1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class PhoneListController implements Initializable {
    public TableView<PhoneNumber> tbView;
    public TableColumn<PhoneNumber, String> cName;
    public TableColumn<PhoneNumber, String> cPhone;
    public TableColumn<PhoneNumber, Button> cEdit;
    public TableColumn<PhoneNumber, Button> cDelete;

    public TextField txtSearch;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cName.setCellValueFactory(new PropertyValueFactory<PhoneNumber, String>("name"));
        cPhone.setCellValueFactory(new PropertyValueFactory<PhoneNumber, String>("phone"));
        cEdit.setCellValueFactory(new PropertyValueFactory<PhoneNumber, Button>("edit"));
        cDelete.setCellValueFactory(new PropertyValueFactory<PhoneNumber, Button>("delete"));
        tbView.setItems(Main.phoneList);
    }

    public void formScreen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("phonebook.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

    public void search() {
        String s = txtSearch.getText();
        List<PhoneNumber> kq = Main.phoneList.stream()
                .filter(p -> p.getName().contains(s))
                .collect(Collectors.toList());
        ObservableList result = FXCollections.observableArrayList();
        result.addAll(kq);
        tbView.setItems(result);
    }
}
