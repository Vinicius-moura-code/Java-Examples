package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class JogoDoCálculoII {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis - Entrada
        int a = (tec.nextInt());
        int b = tec.nextInt();
        int c = tec.nextInt();
        //Código

        double dc = c * 1.0;
        double db = b * 1.0;
        double div = (dc / db);

        System.out.println("Soma = " + (a + c));
        System.out.println("Subtracao = " + (b - c));
        System.out.println("Produto = " + (a * b));
        System.out.println(div);
        //System.out.printf("Divisao = %.1f \n", (c / b));
        tec.close();
    }
}
