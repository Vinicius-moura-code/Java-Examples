package Algorithms.diversos;

import java.util.Locale;
import java.util.Scanner;

public class Rascunho {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        float N1 = tec.nextFloat()*2;
        float N2 = tec.nextFloat()*3;
        float N3 = tec.nextFloat()*4;
        float N4 = tec.nextFloat()*1;
        //Código
        double media = (N2 + N1 + N4 + N3)/10;
        System.out.printf("media %.1f", media);

        tec.close();
    }
}
