package model.user;

import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class UserTest {

	public User userExample = new User("Nicolas", "Pintos", "nico.pintos05@gmail.com", new Date());

	@Test
	public void hasName() {
		assertEquals("Nicolas", userExample.getName());
	}

	@Test
	public void hasSurname(){
		assertEquals("Pintos", userExample.getSurname());
	}

	@Test
	public void hasEmail(){
		assertEquals("nico.pintos05@gmail.com", userExample.getEmail());
	}

	@Test
	public void validDate(){
		/* VER!!!!! */
	}
}
