package Algorithms.sequenciais;

import java.util.Scanner;

public class Estabulos {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double l  = tec.nextDouble();
        //Código
        System.out.printf("%.2f\n", (l * 4));
        System.out.printf("%.2f", (l * l));
        tec.close();
    }
}
