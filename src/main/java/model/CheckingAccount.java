package model;

public class CheckingAccount {


    private User owner;
    private int accountAmount;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User accountOwner) {
        this.owner = accountOwner;
    }

    public int getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(int accountAmount) {
        this.accountAmount = accountAmount;
    }

    public CheckingAccount(User accountOwner, int accountAmount) {
        this.owner = accountOwner;
        this.accountAmount = accountAmount;
    }

    public void addBalance(int amount) {
        this.accountAmount = this.accountAmount + amount;
    }

    //TODO: Manejar con excepciones
    public void subtractBalance(int amount) {

        int mount = this.accountAmount;

        if (((mount - amount)) >= 0) {
            this.accountAmount = this.accountAmount - amount;
        } else
            System.out.println("You do not have a balance in your account");
    }

    public int checkBalance(){
        return this.getAccountAmount();
    }

    //public boolean applyForALoan();

    //public void transferMoney();
}
