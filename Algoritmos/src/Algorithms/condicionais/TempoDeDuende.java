package Algorithms.condicionais;

import java.util.Scanner;

public class TempoDeDuende {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int n = tec.nextInt();
        int a = tec.nextInt();
        int b = tec.nextInt();
        //Código
        int sum = a + b;
        if (sum <= n) {
            System.out.println("Farei hoje!");
        } else {
            System.out.println("Deixa para amanha!");
        }

        tec.close();
    }
}
