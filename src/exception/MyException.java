package exception;

import com.example.demo.MyDemo;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
    public MyException() {
        super();
    }
}

/*
Create a custom exception class called MyException.

We are going create a MyDemo class , which will contain a method called int myBalance() and
one attribute called balance.

myBalance method will return the balance, if balance is lower than 1000, it will throw MyException, with message low balance.

form ImplMain we have to call this myBalance and handle the appropriate exception.
 */


        // System.out.println("my balance is = " + demo.myBalance());


