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
		System.out.println("A soma dos valores é: "+ b);
		System.out.println("O resultado de x-y é: " + c );
		System.out.println("A multiplicação de x,y,z é: "+ d);
		System.out.println("(x+y)/(z-a) = " +e );	
		System.out.println("A media dos valores é: "	+ media);
		
		tec.close();
//Elabore um algoritmo que lê 4 valores inteiros e mostra: a soma dos valores; a subtração do 1o valor e o 2o valor; a multiplicação dos 3 primeiros valores digitados; a média dos valores; o resultado da	fórmula (1o valor + 2o valor) / (3o valor - 4ovalor).
	}

}
