package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class GorjetaDeGunther {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double v = tec.nextDouble();
        //Código
        double gorgeta = (v * 10) / 100;

        System.out.printf("$%.2f", (v + gorgeta));
        tec.close();
    }
}
