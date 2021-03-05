package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class ReajusteDeSalario {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double s = tec.nextDouble();
        double r = tec.nextDouble();
        //Código
        double ajuste = (s * r) / 100;
        double salarioFinal = s + ajuste;
        System.out.printf("R$%.2f", salarioFinal);

        tec.close();
    }
}
