package Algorithms.condicionais;

import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int min1, min2 = 0, min3 = 0;
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        //Código
        min1 = Math.min(a, Math.min(b, c));
        if (min1 == a) {
            min2 = Math.min(b, c);
            min3 = Math.max(b, c);
        }
        if (min1 == b) {
            min2 = Math.min(a, c);
            min3 = Math.max(a, c);
        }
        if (min1 == c) {
            min2 = Math.min(a, b);
            min3 = Math.max(a, b);
        }
        System.out.print(min1 + "\n" + min2 + "\n" + min3 + "\n\n");
        System.out.print(a + "\n" + b + "\n" + c + "\n");


        tec.close();
    }
}
