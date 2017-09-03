package MoneySorting;

import java.math.BigDecimal;

public class Money {
    private BigDecimal value;
    private Currency currency;

    public Money(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getOriginalValue() {
        return value;
    }

    public BigDecimal getValue() {
        switch (this.currency) {
            case EUR:
                this.value = this.value.multiply(BigDecimal.valueOf(4.2));
                break;
            case USD:
                this.value = this.value.multiply(BigDecimal.valueOf(3.5));
                break;
        }

        return value;
    }

    @Override
    public String toString() {
        return value + " " + currency;
    }
}
