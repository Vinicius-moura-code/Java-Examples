package Algorithms.sequenciais;

import java.util.Scanner;

public class QuadraPoliesportiva {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double b = tec.nextDouble();
        double h = tec.nextDouble();
        //Código
        System.out.printf("%.2f", (b * h));
        tec.close();
    }
}
