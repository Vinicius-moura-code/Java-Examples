package Algorithms.sequenciais;

import java.util.Scanner;

public class JogoDoCálculoI {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Variaveis
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        //Código
        System.out.println("Soma = " + (a + b));
        System.out.println("Subtracao = " + (b - c));
        System.out.println("Produto = " + (a * b * c));
        tec.close();
    }
}
