package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class ContaAtrasada {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        //Código
        double salario = 1200.0;

        double agua = 150 + (150 * 2)/100;
        double luz = 200 + (200 * 2)/100;

        double gasto = agua + luz;
        System.out.printf("$ %.2f", (salario - gasto));
        tec.close();
    }
}
