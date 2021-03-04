package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class DocesDeYuu {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis
        int x = tec.nextInt();
        int y = tec.nextInt();
        //Código
        System.out.println("Doces: " + (x + y));
        tec.close();
    }
}
