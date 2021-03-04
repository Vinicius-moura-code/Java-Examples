package Algorithms.sequenciais;

import java.util.Scanner;

public class Coronavirus {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double c = tec.nextDouble();
        //Código
        double F = (9 * c + 160) /5;
        System.out.printf("%.2f", F);

        tec.close();
    }
}
