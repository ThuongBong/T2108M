package session9.lab1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PhoneControoler {
    public TextField phone;
    public TextField name;
    public Text errMg;

    public PhoneNumber phoneNumber;
    public void setData(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;

        name.setText(phoneNumber.getName());
        phone.setText(phoneNumber.getPhone());
    }

    public void submit(){
        try {
            PhoneNumber p = new PhoneNumber(name.getText(), phone.getText());
            if (this.phoneNumber == null){
                Main.phoneList.add(p);
            }
            else {
                int i = Main.phoneList.indexOf(this.phoneNumber);
                Main.phoneList.set(i, p);
            }
//            Main.phoneList.add(p);
            Parent root = FXMLLoader.load(getClass().getResource("phonelist.fxml"));
            Main.rootStage.setScene(new Scene(root, 800, 600));
            errMg.setVisible(false);
        } catch (Exception e) {
            errMg.setText(e.getMessage());
            errMg.setVisible(true);
        }
    }
    public void view() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("phonelist.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }
}
