package Algorithms.condicionais;

import java.util.Scanner;

public class QualTriangulo {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int A = tec.nextInt();
        int B = tec.nextInt();
        int C = tec.nextInt();
        //Código
        if (!isValidTriangle(A, B, C)) {
            System.out.println("Invalido");
        } else {
            if (A == B && A == C && B == C)
                System.out.println("Valido-Equilatero");
            else if (A == B || A == C || B == C)
                System.out.println("Valido-Isoceles");
            else
                System.out.println("Valido-Escaleno");

            if (isRectangleTriangle(A, B, C))
                System.out.println("Retangulo: S");
            else
                System.out.println("Retangulo: N");
        }
    }

    private static boolean isValidTriangle(int A, int B, int C) {
        double maior;
        double soma;
        boolean triangulo;

        if (A > B && A > C) maior = A;
        else if (B > C) maior = B;
        else maior = C;

        if (maior == A) soma = B + C;
        else if (maior == B) soma = A + C;
        else soma = B + A;

        if (soma > maior) triangulo = true;
        else triangulo = false;

        return triangulo;
    }

    private static boolean isRectangleTriangle(int A, int B, int C) {
        int aA = A * A;
        int bB = B * B;
        int cC = C * C;
        return aA + bB == cC || aA + cC == bB || cC + bB == aA;
    }
}
