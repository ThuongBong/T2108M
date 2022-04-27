package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TicketsFormController {
    public TextField sMaVe;
    public TextField sMaLichChieu;
    public TextField sMaGhe;

    public Tickets editData;
    public void setEditData(Tickets editData){
        this.editData = editData;
        this.sMaVe.setText(editData.getMaVe().toString());
        this.sMaLichChieu.setText(editData.getMaLichChieu().toString());
        this.sMaGhe.setText(editData.getMaGhe());

        this.sMaVe.setDisable(true);
    }
    public void backTickets() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tickets.fxml"));
        Main.rootStage.setScene(new Scene(root, 1000, 650));
    }

    public void submit(ActionEvent actionEvent) {
        String MaVe = this.sMaVe.getText();
        String MaLichChieu = this.sMaLichChieu.getText();
        String MaGhe = this.sMaGhe.getText();

        try {
            TickestRepository tr = new TickestRepository();
            if (this.editData == null) {
                Tickets t = new Tickets(Integer.parseInt(MaVe), Integer.parseInt(MaLichChieu), MaGhe);
                tr.create(t);
            } else {
                Tickets t = new Tickets(Integer.parseInt(MaVe), Integer.parseInt(MaLichChieu), MaGhe);
                tr.update(t);
            }
            this.backTickets();

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
