package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class SucessorEAntecessor {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis
        int x = tec.nextInt();
        //Código
        int suc = x + 1;
        int antSuc = x - 1;
        System.out.println(suc);
        System.out.println(antSuc);
        tec.close();
    }
}
