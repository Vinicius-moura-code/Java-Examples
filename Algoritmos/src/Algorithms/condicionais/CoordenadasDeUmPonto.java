package Algorithms.condicionais;

import java.util.Locale;

import java.util.Scanner;

public class CoordenadasDeUmPonto {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double x = tec.nextDouble();
        double y = tec.nextDouble();
        //Código
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo X");
        } else if (x != 0 && y == 0) {
            System.out.println("Eixo Y");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }

        tec.close();
    }
}
