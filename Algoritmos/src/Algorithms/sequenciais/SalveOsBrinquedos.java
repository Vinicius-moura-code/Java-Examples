package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class SalveOsBrinquedos {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double v = tec.nextDouble();
        //Código

        tec.close();
        double valor = (double)(v);
        double valorDesconto = (valor * 9) / 100;
        double valorTotal = valor - valorDesconto;
        System.out.printf("Valor original do produto: R$ %.2f\n", valor);
        System.out.printf("Valor final do produto: R$ %.2f\n", valorTotal);
        System.out.printf("Valor do desconto: R$ %.2f", valorDesconto);
    }
}
