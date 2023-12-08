package payment_methods;

import interfaces.MoneyCollector;

import java.math.BigDecimal;

public class BankCardAcceptor implements MoneyCollector {
    private int amount;
    private BankCard card;

    public BankCardAcceptor(int amount) {
        this.amount = amount;
        card = new BankCard(BigDecimal.valueOf(500));
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
