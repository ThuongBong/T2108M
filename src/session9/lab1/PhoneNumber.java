package session9.lab1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class PhoneNumber {
    public String name;
    public String phone;
    public Button edit;
    public Button delete;

    public PhoneNumber() {
    }

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.edit = new Button("Edit");
        this.edit.setOnAction(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("phonebook.fxml"));
                Parent root = loader.load();
                PhoneControoler pc = loader.getController();
                pc.setData(this);
                Main.rootStage.setScene(new Scene(root, 800, 600));
            } catch (Exception e) {

            }
        });
        this.delete = new Button("Delete");
        this.delete.setOnAction(event -> {
            Main.phoneList.remove(this);
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        String s = "\n--------------------------";
        s += "\n" + getName();
        s += "\n" + getPhone();
        return s;
    }
}
