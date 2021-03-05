package Algorithms.sequenciais;

import java.util.Scanner;

public class AlmocoBarato {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double p =tec.nextDouble();
        //Código
        double v = p * 12.0;
        System.out.printf("%.2f", v);
        tec.close();
    }
}
