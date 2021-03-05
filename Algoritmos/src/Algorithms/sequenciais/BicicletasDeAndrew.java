package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class BicicletasDeAndrew {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int e = tec.nextInt(); // n empregados
        int v = tec.nextInt(); // bikes vendida
        double s = tec.nextDouble(); // salario minimo
        double b = tec.nextDouble(); //preço Bike
        //Código

        double salario = ((v * b * 0.15) / e) + (2*s);
        double lucro = (b * 0.5 * v) - (salario * e);

        System.out.printf("Salario = R$%.2f\n", salario);
        System.out.printf("Lucro = R$%.2f", lucro);

        tec.close();
    }
}
