package Algorithms.sequenciais;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double m = tec.nextDouble();
        double s = tec.nextDouble();
        //Código
        double salarioMinimo = s / m;
        System.out.printf("%.2f salário(s) mínimo(s)", salarioMinimo);
        tec.close();
    }
}
