package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class AvancoDaTecnologia {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int totalDvds = tec.nextInt();
        double valorAluguel = tec.nextDouble();

        //Código
        double valorMulta = (valorAluguel * 10 ) / 100;
        double multa = (((double) (totalDvds) / 3) *10) /100 * valorMulta * 12;
        double faturamento = ((double) (totalDvds) / 3) * valorAluguel * 12;
        faturamento = faturamento + multa;
        double estragados = ((double) (totalDvds) * 2) /100;
        double reposicao = ((totalDvds - estragados) *10) / 100;
        int totalDeDvdsFimDoAno = (int) (totalDvds - estragados + reposicao);
        System.out.printf("%.2f\n%.2f\n%d", faturamento,  multa, totalDeDvdsFimDoAno);


        tec.close();
    }
}
