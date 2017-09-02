package MoneySorting;

public class Money {
    private double value;
    private Currency currency;

    public Money(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getOriginalValue() {
        return value;
    }

    public double getValue() {
        switch (this.currency) {
            case EUR:
                this.value *= 4.2;
                break;
            case USD:
                this.value *= 3.5;
                break;
        }

        return value;
    }

    @Override
    public String toString() {
        return value + " " + currency;
    }
}
