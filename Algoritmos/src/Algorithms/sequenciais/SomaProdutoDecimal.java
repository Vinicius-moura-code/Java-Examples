package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class SomaProdutoDecimal {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        double x = tec.nextDouble();
        double y = tec.nextDouble();
        System.out.printf("SOMA = %.2f %n", x + y);
        System.out.printf("PRODUTO = %.2f", x * y);
        tec.close();

    }
}
