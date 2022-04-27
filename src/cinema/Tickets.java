package cinema;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Tickets {
    public Integer MaVe;
    public Integer MaLichChieu;
    public String MaGhe;
    public Button edit;
    public Button delete;

    public Tickets() {
    }
    public Tickets(Integer maVe, Integer maLichChieu, String maGhe) {
        MaVe = maVe;
        MaLichChieu = maLichChieu;
        MaGhe = maGhe;
        this.edit = new Button("Edit");
        this.edit.setOnAction(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ticketsform.fxml"));
                Parent root = loader.load();
                TicketsFormController t = loader.getController();
                t.setEditData(this);
                Main.rootStage.setScene(new Scene(root,1000,650));
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
        this.delete = new Button("Delete");
        this.delete.setOnAction(event -> {
            try {
                TickestRepository tr = new TickestRepository();
                tr.delete(this);
                FXMLLoader loader = new FXMLLoader(getClass().getResource("tickets.fxml"));
                Parent root = loader.load();
                Main.rootStage.setScene(new Scene(root,1000,650));
            }catch (Exception e){

            }
        });
    }

    public Integer getMaVe() {
        return MaVe;
    }

    public void setMaVe(Integer maVe) {
        MaVe = maVe;
    }

    public Integer getMaLichChieu() {
        return MaLichChieu;
    }

    public void setMaLichChieu(Integer maLichChieu) {
        MaLichChieu = maLichChieu;
    }

    public String getMaGhe() {
        return MaGhe;
    }

    public void setMaGhe(String maGhe) {
        MaGhe = maGhe;
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
}
