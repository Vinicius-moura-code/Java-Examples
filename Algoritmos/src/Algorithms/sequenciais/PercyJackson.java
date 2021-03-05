package Algorithms.sequenciais;

import java.util.Scanner;

public class PercyJackson {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double r = tec.nextDouble();

        //Código
        double pi = 3.14;
        double perimetro = (2 * r) * pi ;
        double area =  (Math.pow(r,2)) * pi;

        System.out.printf("%.2f\n", perimetro);
        System.out.printf("%.2f", area);
        tec.close();
    }
}
