package model.user;

import model.Event;
import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;

@RunWith(SpringRunner.class)
public class EventTest {

    public User cataloguerExample = new User("Nicolas", "Pintos", "nico.pintos05@gmail.com", new Date());
    public User guest1 = new User("Pedro","Lopez", "plopez@unq", new Date());
    public User guest2 = new User("Pablo","Garcia", "pgarcia@unq", new Date());
    public User guest3 = new User("Sandra","Juarez", "sjuarez@unq", new Date());
    public ArrayList<User> guests = new ArrayList<User>();

    public Event event = new Event(cataloguerExample, guests);

    @Test
    public void constructorEvent() {


    }
}
