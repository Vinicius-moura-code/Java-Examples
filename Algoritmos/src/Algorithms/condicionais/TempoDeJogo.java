package Algorithms.condicionais;

import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int entrada = tec.nextInt();
        int saida = tec.nextInt();
        //Código

        int tempo = 24 - (24 + entrada - saida) % 24;
        if (entrada == saida) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", tempo);
        }

        tec.close();
    }
}
