package Algorithms.condicionais;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        if ((A < B + C) && (B < A + C) && (C < B + A)) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }

}
