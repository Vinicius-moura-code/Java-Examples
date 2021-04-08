package Algorithms.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double d = tec.nextDouble();

        if (d >= 0 && d <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (d >= 25 && d <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (d >= 50 && d <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (d >= 75 && d <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        tec.close();
    }
}
