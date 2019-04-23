package model;
import java.util.Date;

public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private Date birthday;

    public String getPassword() { return password;  }

    public void setPassword(String password) { this.password = password; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public User(String name1, String surname1, String email1, String pass, Date birthday1){
            this.name = name1;
            this.surname = surname1;
            this.email = email1;
            this.password = pass;
            this.birthday = birthday1;
        }

}
