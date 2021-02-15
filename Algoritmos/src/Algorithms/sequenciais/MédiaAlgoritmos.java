package Algorithms.sequenciais;


import java.util.Scanner;

public class MédiaAlgoritmos {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);

        //Variaveis
        double x = tec.nextDouble();
        double y = tec.nextDouble();
        double z = tec.nextDouble();
        //Código
        System.out.printf("%.1f",(x + y + z)/3);
        tec.close();
    }
}
