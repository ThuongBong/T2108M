package session7;

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
            result.setText(result.getText()+p.toString());
            name.setText("");
            price.setText("");
            amount.setText("");
            unit.setText("");
            errMg.setVisible(false);

        } catch (Exception e) {
            errMg.setText(e.getMessage());
            errMg.setVisible(true);
        }
    }
}
