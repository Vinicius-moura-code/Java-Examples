package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class SomaProduto {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis
        int x = tec.nextInt();
        int y = tec.nextInt();
        int z = tec.nextInt();
        //Código
        System.out.println("Soma = " + (x + y + z));
        System.out.println("Produto = " + x * y * z);
        tec.close();
    }
}
