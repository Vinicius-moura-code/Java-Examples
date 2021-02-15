package Algorithms;
import java.util.Scanner;
public class Teste005 {

	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
	for(int y = 1; y <= 5;y++) {
		System.out.println("Digite o " + y + "� nome:");
		String nome = tec.next();
		System.out.println("Digite a " + y + "� nota:");
		int nota = tec.nextInt();
		if(nota>=6) {
			System.out.println(nome + " Aprovado ");
			
		}else {
			System.out.println("Reprovado");
		}
		
	
	   }
			tec.close();

	}

}
 