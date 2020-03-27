import java.util.Scanner;
public class SomaProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double a,b;
		System.out.println("Digite um valor para a:");
		a = tec.nextDouble();
		System.out.println("Digite um valor para b:");
		b = tec.nextDouble();
		double c = a+b;
		double d = a*b;
		System.out.println("A soma entre os valores é " + c + " e o produto é " +d );

		tec.close();
	}

}
