package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class ProvaDeResistencia {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int n = tec.nextInt();
        //Código
        System.out.println((n * 60) + " minutos" );
        tec.close();
    }
}
