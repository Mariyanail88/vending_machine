package model;

import interfaces.MoneyCollector;

public class BankCardAcceptor implements MoneyCollector {
    private int amount;

    public BankCardAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
