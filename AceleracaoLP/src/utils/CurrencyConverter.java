package utils;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {

    public CurrencyConverter() {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);

        System.out.print("What is the dollar price? ");

        final double dollarPrice = tec.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double result = converter(dollarPrice, tec.nextDouble());
        System.out.println("Amount to be paid in reais = " + new DecimalFormat("0.00").format(result));
        tec.close();
    }

    public static double converter(double price, double quant) {
        return price * quant;
    }

    public double usualConvert(double x, double y) {
        return converter(x, y);
    }


}
