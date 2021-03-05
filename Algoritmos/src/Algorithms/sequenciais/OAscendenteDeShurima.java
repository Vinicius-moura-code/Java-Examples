package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class OAscendenteDeShurima {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int x = tec.nextInt();
        //Código
        double dias = x * 365.25;
        double horas = dias * 24;
        double minutes = horas * 60;
        double seconds =  minutes * 60;
        System.out.printf("%.2f", seconds);
        tec.close();
    }
}
