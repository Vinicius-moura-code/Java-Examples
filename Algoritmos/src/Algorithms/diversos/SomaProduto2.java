package Algorithms.diversos;
import java.util.Scanner;
public class SomaProduto2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite um valor para x:");
		int x = tec.nextInt();
		System.out.println("Digite um valor para y:");
		int y = tec.nextInt();
		System.out.println("Digite um valor para z:");
		int z = tec.nextInt();
		System.out.println("Digite um valor para a:");
		int a = tec.nextInt();
		int b = x+y+z+a;
		int c = x-y;
		int d = x*y*z;
		int media = (x+y+z+a)/4;
		int e = (x+y)/(z-a);
		System.out.println("A soma dos valores �: "+ b);
		System.out.println("O resultado de x-y �: " + c );
		System.out.println("A multiplica��o de x,y,z �: "+ d);
		System.out.println("(x+y)/(z-a) = " +e );	
		System.out.println("A media dos valores �: "	+ media);
		
		tec.close();
//Elabore um algoritmo que l� 4 valores inteiros e mostra: a soma dos valores; a subtra��o do 1o valor e o 2o valor; a multiplica��o dos 3 primeiros valores digitados; a m�dia dos valores; o resultado da	f�rmula (1o valor + 2o valor) / (3o valor - 4ovalor).
	}

}
