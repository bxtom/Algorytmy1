import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.math.BigDecimal;
import java.util.Random;

public class JavaMoneyTest {

    public static void main(String[] args) {
//        CurrencyUnit euro = Monetary.getCurrency("EUR");
//        CurrencyUnit usDollar = Monetary.getCurrency("USD");
//        MonetaryAmount fiveEuro = Money.of(5, euro);

        BigDecimal[] amounts = new BigDecimal[1000];
        BigDecimal[] amountsOfVat = new BigDecimal[1000];

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            //amounts[i] = random.nextDouble();
        }
    }
}
