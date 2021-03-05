package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class CaminhaoDeBino {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double x = tec.nextDouble();
        //Código
        double fab = (x * 28)/ 100;
        x = x + fab;
        double imposto = (x * 45)/100;
        double result = x + imposto;

        System.out.printf("Preco total = R$ %.2f", result);
        tec.close();
    }
}
