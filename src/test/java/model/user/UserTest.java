package model.user;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserTest {

	@Test
	public void hasName() {
		assertEquals("matayas", "matayas");
	}
}
