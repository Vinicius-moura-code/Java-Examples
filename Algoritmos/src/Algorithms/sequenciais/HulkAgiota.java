package Algorithms.sequenciais;

import java.util.Scanner;

public class HulkAgiota {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis
        double x = tec.nextDouble();
        //Código
        double lucro = (x + (x * 15)/100);
        System.out.printf("R$%.2f \n",x);
        System.out.printf("R$%.2f", lucro);
        tec.close();
    }
}
