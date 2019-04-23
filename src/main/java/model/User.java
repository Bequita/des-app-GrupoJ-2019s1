package model;
import java.util.Date;

public class User {

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

    public User(String name1, String surname1, String email1, Date birthdate1){
            this.name = name1;
            this.surname = surname1;
            this.email = email1;
            this.birthdate = birthdate1;
        }

}
