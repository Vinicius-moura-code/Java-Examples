package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class AdiçãoESubtraçãoDecimal {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis
        double v1 = tec.nextDouble();
        double v2 = tec.nextDouble();
        double v3 = tec.nextDouble();
        double v4 = tec.nextDouble();
        double v5 = tec.nextDouble();
        double v6 = tec.nextDouble();
        //Código
        double sum = (v1 + v2 + v3 + v4 + v5 + v6) * 1.0;
        double sub = (v1 - v2 - v3 - v4 - v5 - v6) * 1.0;

        System.out.printf("%.1f\n", sum);
        System.out.printf("%.1f", sub);
        tec.close();
    }
}
