package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Voltorbs {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double x = tec.nextDouble();
        //Código
        double pi = 3.1415926;

        double result = pi * Math.pow(x,2);
        System.out.printf("Area = %.2f", result);
        tec.close();
    }
}
