package Algorithms.sequenciais;

import java.util.Scanner;

public class OportunidadesDeEmprego {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double x = tec.nextDouble();
        double y = tec.nextDouble();
        //Código
        double energia = x / 700;
        double pagar = (energia * y);
        double descEnergia = pagar * 0.1;
        double comDesc = pagar - descEnergia;

        System.out.printf("Preço do quilowatts:R$%.2f\n", energia);
        System.out.printf("Valor a ser pago:R$%.2f\n", pagar);
        System.out.printf("Valor a ser pago com um desconto de 10 : R$%.2f", comDesc);
        tec.close();
    }

}
