package model;

import java.util.Date;

public class CheckingAccount {

    private String name;
    private String surname;
    private String email;
    private Date birthdate;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    //TODO
    //public void addBalance();

    //public void subtractBalance();

    //public int checkBalance();

    //public boolean applyForALoan();

    //public void transferMoney();
}
