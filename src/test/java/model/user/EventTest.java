package model.user;

import model.Event;
import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class EventTest {

    public User cataloguerExample = new User("Nicolas", "Pintos", "nico.pintos05@gmail.com", "hola", new Date());
    public User guest1 = new User("Pedro","Lopez", "plopez@unq", "si", new Date());
    public User guest2 = new User("Pablo","Garcia", "pgarcia@unq", "euuuuu", new Date());
    public User guest3 = new User("Sandra","Juarez", "sjuarez@unq", "12345", new Date());
    public List<User> guests = new ArrayList<User>();

    @Test
    public void constructorEvent() {
        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);
        Event event = new Event(cataloguerExample, (ArrayList<User>) guests);
        assertEquals("Nicolas", event.getCataloguer().getName());
        assertEquals(guest1, guests.get(0));
    }
}
