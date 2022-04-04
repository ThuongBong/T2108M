package session7;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField name;
    public TextField price;
    public TextField unit;
    public TextField amount;
    public Text result;
    public Text errMg;

    public void submit(){

        try {
            Product p = new Product(name.getText(), Double.parseDouble(price.getText()),
                    unit.getText(), Integer.parseInt(amount.getText()));
            Main.productList.add(p);
//            renderList();
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            Main.rootStage.setScene(new Scene(root, 800, 600));
            errMg.setVisible(false);

        } catch (Exception e) {
            errMg.setText(e.getMessage());
            errMg.setVisible(true);
        }
    }
    private void renderList(){
        String txt = "Danh sach san pham\n";
        for (Product p : Main.productList) {
            txt += p.toString();
        }
        result.setText(txt);

        name.setText("");
        price.setText("");
        amount.setText("");
        unit.setText("");
    }
}
