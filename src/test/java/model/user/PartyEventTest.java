package model.user;

import model.PartyEvent;
import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class PartyEventTest {

    public Date date = new Date();
    public User cataloguerExample = new User("Nicolas", "Pintos", "nico.pintos05@gmail.com", "123", date);
    public User guest1 = new User("Pedro","Lopez", "plopez@unq", "54", date);
    public User guest2 = new User("Pablo","Garcia", "pgarcia@unq", "chau", date);
    public User guest3 = new User("Sandra","Juarez", "sjuarez@unq", "sandra", date);
    public List<User> guests = new ArrayList<User>();

    @Test
    public void constructorPartyEvent(){
        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);
        PartyEvent party1 = new PartyEvent(cataloguerExample, (ArrayList<User>) guests, date);

        assertEquals(party1.getDeadline(), date);
        assertEquals(cataloguerExample, party1.getCataloguer());
    }

}
