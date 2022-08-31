package com.example.demo;

import exception.MyException;

public class MyDemo {
    private int balance;

    public MyDemo(int balance) {
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int myBalance() throws MyException {
        if (balance < 100) {
            throw new MyException("inSufficient balancr");
        }

        System.out.println("h");
        return balance;
    }

}
