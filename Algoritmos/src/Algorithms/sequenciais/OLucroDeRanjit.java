package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class OLucroDeRanjit {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double i = tec.nextDouble(); //km inicial
        double f = tec.nextDouble();//km final
        double l = tec.nextDouble();//litros
        double v = tec.nextDouble();//valor Total
        //Código
        double combustivel = 2.50;
        double consumo = (f - i)/l;
        double gasto = l * combustivel;
        double lucro = v - gasto;

        System.out.printf("Media de consumo: %.2f Km/l\n", consumo);
        System.out.printf("Lucro: $%.2f", lucro);

        tec.close();
    }
}
