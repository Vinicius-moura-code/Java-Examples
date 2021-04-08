package Algorithms.condicionais;

import java.util.Scanner;

public class BasqueteDeRobos {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int d = tec.nextInt();
        //Código
        if (d <= 800) {
            System.out.println(1);
        } else if (d > 800 && d <= 1400) {
            System.out.println(2);
        } else if (d > 1400 && d <= 2000) {
            System.out.println(3);
        }

        tec.close();
    }
}
