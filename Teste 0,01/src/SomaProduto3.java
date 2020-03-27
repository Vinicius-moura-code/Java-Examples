import java.util.Scanner;
public class SomaProduto3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite um valor para x");
		int x = tec.nextInt();
		System.out.println("Digite um valor para y");
		int y = tec.nextInt();
		System.out.println("Digite um valor para z");
		int z = tec.nextInt();
		int soma = x+y+z;
		int produto = x*y*z;
		System.out.println("A soma dos valores é " + soma + " e o produto é " + produto);
		
		tec.close();
		

	}

}
