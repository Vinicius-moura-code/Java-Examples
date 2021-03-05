package Algorithms.sequenciais;

import java.util.Scanner;

public class PadariaDeBeaconHills {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int p = tec.nextInt();
        int b = tec.nextInt();
        //Código
        double vendas = (double)((p * 0.12) + (b * 1.5));
        double toPoupanca = (vendas * 10) / 100;
        System.out.printf("%.2f\n", vendas);
        System.out.printf("%.2f", toPoupanca);
        tec.close();
    }
}
