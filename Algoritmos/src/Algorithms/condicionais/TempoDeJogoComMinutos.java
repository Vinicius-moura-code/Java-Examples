package Algorithms.condicionais;

import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        //Código
        int horaInicio = tec.nextInt();
        int minutoInicio = tec.nextInt();
        int entrada = horaInicio * 60 + minutoInicio;

        int horaSaida = tec.nextInt();
        int minutoSaida = tec.nextInt();
        int saida = horaSaida * 60 + minutoSaida;

        int diferencaMinutos = (24 * 60 - entrada) + saida;

        int horas = diferencaMinutos / 60;
        int minutos = diferencaMinutos % 60;

        if (horas >= 24 && minutos >= 1) {
            horas = horas % 24;
        }
        System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n", horas, minutos);


        tec.close();
    }

}
