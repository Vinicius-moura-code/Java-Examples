package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class FeyreRhysandCavalaria {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int c = tec.nextInt();
        //Código
        System.out.println(c*4);
        tec.close();
    }
}
