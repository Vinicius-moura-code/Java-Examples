package Algorithms.sequenciais;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int n = tec.nextInt();
        //Código
        double quadrado = (double) Math.sqrt(n);
        System.out.printf("%.2f", quadrado);
        tec.close();
    }

}
