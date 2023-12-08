package abstract_classes;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public abstract class PaymentMethods {
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private BigDecimal balance;

    protected PaymentMethods(BigDecimal balance) {
        setBalance(balance);
    }

    public abstract boolean pay(BigDecimal amount);

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getBalanceInDecimalFormat(BigDecimal price) {
        return decimalFormat.format(price);
    }

}
