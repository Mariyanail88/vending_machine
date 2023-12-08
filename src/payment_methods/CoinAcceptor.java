package payment_methods;

import interfaces.MoneyCollector;

public class CoinAcceptor implements MoneyCollector {
    private int amount;

    public CoinAcceptor(int amount) {
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
