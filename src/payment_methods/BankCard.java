package payment_methods;

import abstract_classes.Card;

import java.math.BigDecimal;

public class BankCard extends Card {

    public BankCard(BigDecimal balance) {
        super(balance);
        super.setLimit(BigDecimal.valueOf(1000));
    }

    @Override
    public boolean pay(BigDecimal amount) {
        System.out.println("оплата банковской картой");
        // compareTo Returns: -1, 0, or 1 as this BigDecimal is numerically less than, equal to, or greater than val
        boolean succes = true;
        BigDecimal curBalance = super.getBalance();

        if (amount.compareTo(curBalance) <= 0) {
            System.out.println("С вашей банковской карты списано " + super.getBalanceInDecimalFormat(amount));
            super.setBalance(curBalance.subtract(amount));

        } else if (amount.compareTo(curBalance.add(super.getLimit())) <= 0) {
            System.out.println("средств банковской карты, с лимита списано " + (curBalance.subtract(amount)).abs());
            super.setBalance(BigDecimal.valueOf(0));
            super.setLimit(super.getLimit().subtract((curBalance.subtract(amount)).abs()));
        } else {
            System.out.println("не хватает средств  банковской карты и лимита чтобы оплатить");
            succes = false;
        }
        return succes;
    }

}
