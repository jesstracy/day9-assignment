package com.tiy.practice;

/**
 * Created by jessicatracy on 8/18/16.
 */
public class CheckingAccount extends BankAccount {

    public CheckingAccount() {
        super();
        setName("Checking");
    }

    public CheckingAccount(double balance) {
        super();
        setName("Checking");
        this.setBalance(balance);
    }
}
