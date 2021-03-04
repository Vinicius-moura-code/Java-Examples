package Algorithms.sequenciais;

import java.util.Scanner;

public class DividindoDoces {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis
        int x = tec.nextInt();
        int y = tec.nextInt();
        int z = tec.nextInt();
        //Código
        int total = x + y + z;
        double recebem = total / 3.0;
        System.out.printf("%.1f", recebem);
        tec.close();
    }
}
