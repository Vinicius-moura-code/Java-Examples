import java.util.Scanner;
public class Uri {

	public static void main(String[] args) {
		Scanner Tec = new Scanner(System.in);
		
		double area, raio;
		double pi = 3.14159;
		raio = Tec.nextDouble();
		area = pi * Math.pow(raio,2);
		System.out.println(String.format("A=%.4f",area));
		
		Tec.close();

		
       

	}

}

