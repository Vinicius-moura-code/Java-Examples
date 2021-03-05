package Algorithms.sequenciais;

import java.util.Scanner;

public class HackeandoACoroa {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int e = tec.nextInt(); //eleitores
        int b = tec.nextInt();//votos brancos
        int n = tec.nextInt();//votos nulos
        int v = tec.nextInt();//votos validos
        //Código
        double porcentE = e / 100.0;
        double porcentBranco = b / porcentE;
        double porcentNulos = n / porcentE;
        double porcentValidos = v / porcentE;

        System.out.println();
        System.out.printf("%.1f (percentual de votos brancos)\n", porcentBranco);
        System.out.printf("%.1f (percentual de votos nulos)\n", porcentNulos);
        System.out.printf("%.1f (percentual de votos validos)\n", porcentValidos);

        tec.close();
    }
}
