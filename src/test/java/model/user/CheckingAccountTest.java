package model.user;

import model.CheckingAccount;
import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class CheckingAccountTest {

    User userExample = new User("Nicolas", "Pintos", "nico.pintos05@gmail.com", "saraza",new Date());
    CheckingAccount countTest = new CheckingAccount(userExample, 0);

    @Test
    public void constructorChecking() {

        assertEquals(0, countTest.getAccountAmount());
        assertEquals("Nicolas", userExample.getName());
    }

    @Test
    public void addBalanceTest(){
        countTest.setAccountAmount(2000);
        countTest.addBalance(1000);
        assertEquals(3000, countTest.getAccountAmount());
    }

    @Test
    public void subtractBalanceTest(){
        countTest.subtractBalance(10);
        assertEquals(0, countTest.getAccountAmount());
    }

    @Test
    public void checkBalance(){
        assertEquals(0, countTest.getAccountAmount());
    }

}