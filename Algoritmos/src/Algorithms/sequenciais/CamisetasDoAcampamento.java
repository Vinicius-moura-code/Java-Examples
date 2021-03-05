package Algorithms.sequenciais;

import java.util.Scanner;

public class CamisetasDoAcampamento {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int p = tec.nextInt();
        int m = tec.nextInt();
        int g = tec.nextInt();
        //Código
        int priceP = p * 10;
        int priceM = m * 12;
        int priceG = g * 15;
        System.out.println( priceP + priceM + priceG);
        tec.close();
    }
}
