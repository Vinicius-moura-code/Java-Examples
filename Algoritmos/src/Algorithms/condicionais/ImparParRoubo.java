package Algorithms.condicionais;

import java.util.Scanner;

public class ImparParRoubo {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int p = tec.nextInt();
        int j1 = tec.nextInt();
        int j2 = tec.nextInt();
        int r = tec.nextInt();
        int a = tec.nextInt();
        //Código
        if (r == 1 && a == 0) System.out.println("Jogador 1 ganha!");
        else if (r == 0 && a == 1) System.out.println("Jogador 1 ganha!");
        else if (r == 1 && a == 1) System.out.println("Jogador 2 ganha!");
        else if (p == 0 && (j1 + j2) % 2 != 0) System.out.println("Jogador 1 ganha!");
        else if (p == 1 && (j1 + j2) % 2 == 0) System.out.println("Jogador 1 ganha!");
        else System.out.println("Jogador 2 ganha!");
        tec.close();
    }
}
