package Algorithms.condicionais;

import java.util.Scanner;

public class FusoHorario {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int s = tec.nextInt();
        int t = tec.nextInt();
        int y = tec.nextInt();
        //Código
        int soma = s + t + y;
        if (soma >= 24) {
            soma -= 24;
        } else if (soma < 0) {
            soma += 24;
        }
        System.out.println(soma);

        tec.close();
    }
}
