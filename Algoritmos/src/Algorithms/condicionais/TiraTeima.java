package Algorithms.condicionais;

import java.util.Scanner;

public class TiraTeima {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int x  = tec.nextInt();
        int y  = tec.nextInt();
        //Código

        if(x >= 0 && x <= 432 && y >= 0 && y <= 468 ){
            System.out.println("dentro");
        }else {
            System.out.println("fora");
        }

        tec.close();
    }
}
