package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int dias = tec.nextInt();
        int mes = tec.nextInt();
        int ano = tec.nextInt();
        //Código
        System.out.println(( dias + (mes*30) + (ano * 365)));
        tec.close();
    }
}
