package Algorithms.diversos;
import java.util.Scanner;
public class Teste002 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String nome; 
		int idade, senha;
		System.out.println("Digite sua idade:");
		idade=teclado.nextInt();
		if(idade>=18) {
			System.out.println("Digite seu nome:");
			nome=teclado.nextLine();teclado.nextLine();
			System.out.println("Digite sua senha:");
			senha=teclado.nextInt();
			System.out.println("Cadastrado com sucesso!");	
		}else
			System.out.println("Voc� n�o pode se cadastrar por ter menos de 18 anos. ");

		teclado.close();
		

	}

}
