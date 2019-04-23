package model;

import java.util.ArrayList;
import java.util.Date;

public class PartyEvent extends Event {

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    private Date deadline;

    public PartyEvent(User cataloguer, ArrayList guestUserList, Date deadline1) {
        super(cataloguer, guestUserList);
        this.deadline = deadline1;
    }

    //public void sendInvitation(Date deadline, ArrayList guestUserList){  }

    //public void CalculateMerchandiseToBuy(){  }
}
