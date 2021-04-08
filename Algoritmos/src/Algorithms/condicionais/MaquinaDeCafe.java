package Algorithms.condicionais;

import java.util.Scanner;

public class MaquinaDeCafe {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int A1 = tec.nextInt();
        int A2 = tec.nextInt();
        int A3 = tec.nextInt();
        int minutos = 0;
        //Código

        if ((A2 >= A3 && A2 >= A1))
            minutos = (A3 + A1) * 2;
        else if (A3 >= A1 && (A1 + A2) <= A3)
            minutos = (A1 * 4) + (A2 * 2);
        else if (A1 >= A3 && (A3 + A2) <= A1)
            minutos = (A3 * 4) + (A2 * 2);
        else
            minutos = (A3 + A1) * 2;
        System.out.println(minutos);

        tec.close();
    }
}
