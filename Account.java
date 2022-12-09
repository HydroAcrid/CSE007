/*
Kevin Dotel
10/13/21
CSE 7: Activity 2
This is the TVShow program
*/
import java.util.*;
public class Account {
    private long accountId;
    private double balance;
    private double dateCreated;
    private double cash;

    public Account () {
        accountId = 0;
        balance = 0;

    }

    public void setAccountId() {
        this.accountId = accountId;
    }

    public double getAccountId(long accountId) {
        return accountId;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public double getBalance(double balance) {
        return balance;
    }

    public void dateCreated() {
        this.dateCreated = dateCreated;
    }

    public double dateCreated(double dateCreated) {
        return dateCreated;
    }

    public double getDeposit(double cash) {
        return cash;
    }

    public double getWithdraw(double cash, double balance) {
        double withdraw = balance - cash;
        return withdraw;
    }

    public void displayBalance() {
        
    }

    public void displayAccountInfo() {

    }




    
}
