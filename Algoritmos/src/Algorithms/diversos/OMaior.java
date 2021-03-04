package Algorithms.diversos;
import java.util.Scanner;
public class OMaior {
	
	public static void main(String[] args) {
		Scanner Tec = new Scanner(System.in);
		
		int a1 = Tec.nextInt(); 
		int a2 = Tec.nextInt();
		double a3 = Tec.nextDouble();
        int b1 = Tec.nextInt();
        int b2 = Tec.nextInt();
        double b3 = Tec.nextDouble();
        double t = (a2*b2)+(a3*b3);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",t);		
		
	}
}