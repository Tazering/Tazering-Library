package com.tazering.Interfaces;

public interface Payments {
    boolean hasSufficientFunds(double amount);

    int transferFunds(String accountNumber, double amount);

}
