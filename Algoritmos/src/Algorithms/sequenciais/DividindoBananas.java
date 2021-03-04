package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class DividindoBananas {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis
        int x = tec.nextInt();
        //Código
        System.out.println(x / 2);
        System.out.println(x / 3);
        tec.close();
    }
}
