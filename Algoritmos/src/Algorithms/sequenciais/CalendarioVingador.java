package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class CalendarioVingador {    public static void main(String[]args){
    Locale.setDefault(new Locale("en", "usa"));
    Scanner tec = new Scanner(System.in);
    //Variaveis//Input
    int day = tec.nextInt();
    int month = tec.nextInt();
    int year = tec.nextInt();
    //Código
    System.out.printf("%d/%02d/%d\n", day, month, year);
    tec.close();
}
}
