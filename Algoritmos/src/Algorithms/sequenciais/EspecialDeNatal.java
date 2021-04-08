package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class EspecialDeNatal {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int x = tec.nextInt();
        //Código
        double tot = x/100;
        double pop = (x * 0.1) * 1.0;
        double geral = (x * 0.5) * 5.0;
        double arq = (x * 0.3)* 10.0;
        double cadeiras = (x * 0.1) * 20.0;
        double result =  pop + geral + arq + cadeiras;

        System.out.printf("Renda total: R$ %.2f",result);
        tec.close();
    }
}
