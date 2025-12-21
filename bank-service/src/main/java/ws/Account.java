package ws;

import java.util.Date;

public class Account {
    private int code;
    private double balance;
    private Date createAt;

    public Account() {

    }

    public Account(int code, double balance, Date creationDate) {
        this.code = code;
        this.balance = balance;
        this.createAt = creationDate;
    }

    public int getCode() {
        return code;
    }

    public double getBalance() {
        return balance;
    }

    public Date getCreationDate() {
        return createAt;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreationDate(Date creationDate) {
        this.createAt = creationDate;
    }
}
