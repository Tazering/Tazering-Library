package com.tazering.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private Lock accessAccountLock;
    private Condition accessAccountCondition;

    public BankAccount() {
        balance = 0;
        accessAccountLock = new ReentrantLock();
        accessAccountCondition = accessAccountLock.newCondition();
    }

    public void deposit(double amount) {
        accessAccountLock.lock();
        try {
            System.out.println("Depositing +" + amount);
            double newBalance = balance + amount;
            System.out.println("After Deposit, new balance is " + newBalance);
            balance = newBalance;
            accessAccountLock.unlock();
            accessAccountCondition.signalAll();
        } finally {
            accessAccountLock.unlock();
        }

    }

    public void withdraw(double amount) throws InterruptedException {
        accessAccountLock.lock();


        try {

            while(balance < amount) {
                accessAccountCondition.await();
            }
            System.out.println("Withdrawing -" + amount);
            double newBalance =  balance - amount;
            System.out.println("After Withdraw, new balance is " + newBalance);
            balance = newBalance;
            accessAccountLock.unlock();
        } finally {
            accessAccountLock.unlock();
        }

    }

    public double getBalance() {
        return balance;
    }
}
