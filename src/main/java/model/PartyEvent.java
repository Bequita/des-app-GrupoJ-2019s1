package model;

import java.util.ArrayList;
import java.util.Date;

public class PartyEvent extends Event {

    private Date deadline;

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public PartyEvent(User cataloguer, ArrayList<User> guestUserList, Date deadline1) {
        super(cataloguer, guestUserList);
        deadline = deadline1;
    }

    //public void sendInvitation(Date deadline, ArrayList guestUserList){  }

    //public void CalculateMerchandiseToBuy(){  }
}
