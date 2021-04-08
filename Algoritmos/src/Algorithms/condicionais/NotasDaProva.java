package Algorithms.condicionais;

import java.util.Scanner;

public class NotasDaProva {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int nota = tec.nextInt();
        //Código

        if (nota <= 100 && nota >= 0) {
            if (nota == 0)
                System.out.println("E");


            if (nota > 0 && nota <= 35)
                System.out.println("D");

            if (nota > 35 && nota <= 60)
                System.out.println("C");

            if (nota > 60 && nota <= 85)
                System.out.println("B");

            if (nota > 85)
                System.out.println("A");
        }

        tec.close();
    }
}
