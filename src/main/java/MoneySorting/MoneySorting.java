package MoneySorting;

import java.math.BigDecimal;
import java.util.Arrays;

public class MoneySorting {
    public static void main(String[] args) {
        Money[] moneyArray = new Money[5];
        BigDecimal test = new BigDecimal(5);
        moneyArray[0] = new Money(BigDecimal.valueOf(5), Currency.EUR);
        moneyArray[1] = new Money(BigDecimal.valueOf(4), Currency.PLN);
        moneyArray[2] = new Money(BigDecimal.valueOf(6), Currency.USD);
        moneyArray[3] = new Money(BigDecimal.valueOf(9), Currency.PLN);
        moneyArray[4] = new Money(BigDecimal.valueOf(11), Currency.EUR);

        System.out.println(Arrays.toString(moneyArray));

    }
}
