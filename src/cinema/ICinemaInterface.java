package cinema;

import java.util.ArrayList;

public interface ICinemaInterface {
    ArrayList<Tickets> list();
    void create (Tickets tickets);
    void update (Tickets tickets);
    void delete (Tickets tickets);
}
