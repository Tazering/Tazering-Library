package com.tazering.Interfaces;

public class CreditCard implements Payments {


    @Override
    public boolean hasSufficientFunds(double amount) {
        return false;
    }

    @Override
    public int transferFunds(String accountNumber, double amount) {
        return 0;
    }
}
