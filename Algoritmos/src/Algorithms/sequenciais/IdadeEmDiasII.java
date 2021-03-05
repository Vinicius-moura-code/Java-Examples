package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class IdadeEmDiasII {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int i = tec.nextInt();
        //Código
        int ano = i / 365;
        int mes = (i % 365)/30;
        int dias = (i % 365)%30;

        System.out.println( ano + " year(s), " + mes + " month(s) and " + dias+ " day(s)");
        tec.close();
    }
}
