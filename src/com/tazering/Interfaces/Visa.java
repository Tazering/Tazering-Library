package com.tazering.Interfaces;

public class Visa extends CreditCard implements Payments{
    int limit = 12500;

    @Override
    public int transferFunds(String accountNumber, double amount) {
        return 1;
    }

    @Override
    public boolean hasSufficientFunds(double amount) {
        return true;
    }
}
