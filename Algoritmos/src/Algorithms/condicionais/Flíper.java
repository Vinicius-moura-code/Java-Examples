package Algorithms.condicionais;

import java.util.Scanner;

public class Flíper {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int P = tec.nextInt();
        int R = tec.nextInt();
        //Código
        if (P == 0) {
            System.out.println("C");
        } else if (P == 1 && R == 0) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

        tec.close();
    }
}
