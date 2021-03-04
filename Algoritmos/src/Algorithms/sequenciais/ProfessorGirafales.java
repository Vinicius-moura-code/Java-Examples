package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class ProfessorGirafales {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int p = tec.nextInt();
        int a = tec.nextInt();
        //Código
        System.out.println(p);
        System.out.println(a);
        int profResponse = p % a;
        System.out.println(p/a);
        System.out.println(profResponse);
        tec.close();
    }
}
