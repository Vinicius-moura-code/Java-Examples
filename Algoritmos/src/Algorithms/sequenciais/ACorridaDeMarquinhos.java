package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class ACorridaDeMarquinhos {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double p = tec.nextDouble();//comprimento da pista
        double c = tec.nextDouble();//consulmo km/l
        int v = tec.nextInt();//voltas
        int r = tec.nextInt() + 1;//reabastecimento
        //Código
        double compri = p / 1000;
        double distPorVolta = 1.0 * v / r;
        double percorrida = distPorVolta * compri;
        double combustivelMinimo = percorrida / c;

        System.out.printf("%.1f litros", combustivelMinimo);
        tec.close();
    }
}
