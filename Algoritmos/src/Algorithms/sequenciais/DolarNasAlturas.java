package Algorithms.sequenciais;

import java.util.Scanner;

public class DolarNasAlturas {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double c = tec.nextDouble();
        double d = tec.nextDouble();
        //Código
        double converter = c * d;
        System.out.printf("%.2f", converter);
        tec.close();
    }
}
