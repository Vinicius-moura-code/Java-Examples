package Algorithms.condicionais;

import java.util.Scanner;

public class EscolhaDificil {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int Ca = tec.nextInt();
        int Ba = tec.nextInt();
        int Pa = tec.nextInt();
        int Cr = tec.nextInt();
        int Br = tec.nextInt();
        int Pr = tec.nextInt();
        int semComida = 0;
        //Código

        if (Cr > Ca) semComida += Cr - Ca;
        if (Br > Ba) semComida += Br - Ba;
        if (Pr > Pa) semComida += Pr - Pa;
        System.out.println(semComida);
    }
}
