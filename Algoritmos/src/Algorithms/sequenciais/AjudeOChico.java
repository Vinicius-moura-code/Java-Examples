package Algorithms.sequenciais;
import java.util.Scanner;

public class AjudeOChico {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        double b = tec.nextDouble();
        double h = tec.nextDouble();
        //Código
        double perimetro = ((2*b)+(2*h));
        double  area = b * h;
        double toDiagonal = (Math.pow(b, 2)) + (Math.pow(h, 2));

        System.out.printf("%.1f\n", perimetro);
        System.out.printf("%.0f\n", area);
        System.out.printf("%.2f", Math.sqrt(toDiagonal));

        System.out.println();
        tec.close();
    }
}
