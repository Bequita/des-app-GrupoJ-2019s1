package model;
import java.util.ArrayList;

public class Event {

    private User cataloguer;
    private ArrayList<User> guestUserList;

    public User getCataloguer() {
        return cataloguer;
    }

    public void setCataloguer(User cataloguer) {
        this.cataloguer = cataloguer;
    }

    public ArrayList getGuestUserList() {
        return guestUserList;
    }

    public void setGuestUserList(ArrayList<User> guestUserList) {
        this.guestUserList = guestUserList;
    }

    public Event(User cataloguer, ArrayList<User> guestUserList) {
        this.cataloguer = cataloguer;
        this.guestUserList = guestUserList;
    }
}
