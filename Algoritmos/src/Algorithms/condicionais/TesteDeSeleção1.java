package Algorithms.condicionais;

import java.util.Scanner;

public class TesteDeSeleção1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int A = tec.nextInt();
        int B = tec.nextInt();
        int C = tec.nextInt();
        int D = tec.nextInt();
        //Código

        if (B > C
                && D > A
                && (C + D) > (A + B)
                && C > 0
                && D > 0
                && A % 2 == 0
        ) {
            System.out.println("Valores aceitos");

        } else {
            System.out.println("Valores nao aceitos");
        }
        tec.close();
    }
}
