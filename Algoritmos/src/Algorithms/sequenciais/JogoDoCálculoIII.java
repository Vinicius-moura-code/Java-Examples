package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class JogoDoCálculoIII {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);


        //Variaveis
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        int d = tec.nextInt();
        //Código

        int sum = a + b + c + d;
        int sub = a - b;
        int prod = a * b * c;
        double med = sum / 4.0;
        double formu = (a + b) / (c - d);
        System.out.println("Soma = " + sum);
        System.out.println("Subtracao = " + sub);
        System.out.println("Produto = " + prod);
        System.out.printf("Media = %.2f\n", med);
        System.out.printf("Formula = %.2f", formu);
        tec.close();
    }
}
