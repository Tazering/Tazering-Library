package com.tazering.Interfaces;

import java.util.ArrayList;

public class VendingMachine {

    ArrayList<Payments> sales;

    public VendingMachine() {
        sales = new ArrayList<Payments>();
    }

    public void main(String[] args) {
        VendingMachine testMachine = new VendingMachine();
        Visa v = new Visa();

        // create an object type that supports payments to add to the list of sales
        System.out.println(v instanceof Payments);

        testMachine.getSales().add(v);

    }

    public ArrayList<Payments> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Payments> sales) {
        this.sales = sales;
    }
}
