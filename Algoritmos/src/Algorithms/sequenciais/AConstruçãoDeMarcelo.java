package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class AConstruçãoDeMarcelo {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int x1 = tec.nextInt();
        int y1 = tec.nextInt();
        int x2 = tec.nextInt();
        int y2 = tec.nextInt();
        //Código
        double result = (double) (Math.sqrt((Math.pow((x2-x1),2))-(Math.pow((y2-y1),2))));
        System.out.printf("%.2f", result);
        tec.close();
    }
}
