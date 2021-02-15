package Algorithms;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
	Scanner Tec = new Scanner(System.in);
	
	   int NUMBER = Tec.nextInt();
	   int h =  Tec.nextInt();
	   double c = Tec.nextDouble();
	   double SALARY = (h*c);
       System.out.printf("NUMBER = %d\n",NUMBER);
       System.out.printf("SALARY = U$ %.2f\n",SALARY);
       
       
       Tec.close();
	     

	}

}
