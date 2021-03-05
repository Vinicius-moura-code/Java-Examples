package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class PlanoDeHiram {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        //Código
        double convertA = a * 0.350;
        double convertB = b * 0.600;
        double convertC = c * 2;

        double totalDeLitrosCompreados = convertA + convertB + convertC;
        System.out.printf("Total de litros comprados: %.1f", totalDeLitrosCompreados);

        tec.close();
    }
}
