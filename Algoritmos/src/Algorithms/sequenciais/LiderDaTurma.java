package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class LiderDaTurma {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int x = tec.nextInt();
        int joao = tec.nextInt();
        int fernanda = tec.nextInt();
        //Código
        double porcentJoao = ((double) joao / x ) * 100.0;
        double porcentFErnanda = ((double) fernanda / x ) * 100.0;
        double nulos = (((double) (x-joao-fernanda)/x) * 100.0);

        System.out.printf("João: %.2f%%\n", porcentJoao);
        System.out.printf("João: %.2f%%\n", porcentFErnanda);
        System.out.printf("João: %.2f%%\n", nulos);

        tec.close();
    }
}
