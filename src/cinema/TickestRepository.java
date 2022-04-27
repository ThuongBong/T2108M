package cinema;

import Database.Connector;
import java.util.ArrayList;
import java.sql.*;

public class TickestRepository implements ICinemaInterface{
    @Override
    public ArrayList<Tickets> list() {
        try {
            // truy van sql
            String txt_sql = "select * from tbve";
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(txt_sql);
            ResultSet rs = stt.executeQuery();
            ArrayList<Tickets> list = new ArrayList<>();
            while (rs.next()) {
                Tickets t = new Tickets(
                        rs.getInt("MaVe"),
                        rs.getInt("MaLichChieu"),
                        rs.getString("MaGhe")
                );
                list.add(t);
            }
            return list;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void create(Tickets tickets) {
        String sql_txt = "insert into tbve (MaVe, MaLichChieu ,MaGhe) values(?,?,?)";
        try {
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(sql_txt);
            stt.setInt(1,tickets.getMaVe());
            stt.setInt(2,tickets.getMaLichChieu());
            stt.setString(3,tickets.getMaGhe());
            stt.execute();
        }catch (Exception e){

        }
    }

    @Override
    public void update(Tickets tickets) {
                String sql_txt = "update tbve set MaLichChieu = ?,MaGhe = ? where MaVe = ?";
                try {
                    Connector conn = Connector.getInstance();
                    PreparedStatement stt = conn.getStatement(sql_txt);
            stt.setInt(1,tickets.getMaLichChieu());
            stt.setString(2,tickets.getMaGhe());
            stt.setInt(3, tickets.getMaVe());
            stt.execute();
        }catch (Exception e){

        }
    }

    @Override
    public void delete(Tickets tickets) {
        String sql_txt = "delete from tbve where MaVe=?";
        try {
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(sql_txt);
            stt.setInt(1,tickets.getMaVe());
            stt.execute();
        }catch (Exception e){

        }
    }
}
