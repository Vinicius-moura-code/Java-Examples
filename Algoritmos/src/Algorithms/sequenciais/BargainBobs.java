package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class BargainBobs {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double s = tec.nextDouble();
        double v = tec.nextDouble();
        //Código
        double comissao = (v * 4) / 100;

        System.out.printf("Comissao = R$%.2f\n", comissao);
        System.out.printf("Salario Final = R$%.2f", s + comissao);
        tec.close();
    }
}
