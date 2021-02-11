import java.util.Scanner;
public class FirstRep {

	public static void main(String[] args) {

		int x, valor, quadrado;
		Scanner teclado = new Scanner(System.in);
		for (x = 1; x <= 5; x++){
		System.out.println("Digite um valor: ");
		valor = teclado.nextInt();
		quadrado = valor * valor;
		System.out.println("O quadrado do valor " + valor + " é " + quadrado);

		}
		teclado.close();

	}
}
