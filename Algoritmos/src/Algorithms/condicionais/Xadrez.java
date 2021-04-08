package Algorithms.condicionais;


import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int L = tec.nextInt();
        int C = tec.nextInt();
        //Código
        if (L % 2 == C % 2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        tec.close();
    }
}
