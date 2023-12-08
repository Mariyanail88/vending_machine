package payment_methods;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public abstract class Card {

    private BigDecimal limit;
    private BigDecimal balance;
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Card(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return this.limit;
    }

    public String getBalance() {
        return decimalFormat.format(this.balance);
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

}