package javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DemoController {
    public TextField fullName;
    public TextField email;
    public TextField age;
    public Text result;
    public Text errMg;

    public void submit(){
        try {
            Person p = new Person(fullName.getText(), email.getText(), Integer.parseInt(age.getText()));
            Main.personList.add(p);
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            Main.rootStage.setScene(new Scene(root, 800, 600));
            errMg.setVisible(false);
        }catch (Exception e) {
            errMg.setText(e.getMessage());
            errMg.setVisible(true);
        }
    }
}
