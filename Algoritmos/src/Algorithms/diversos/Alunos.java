package Algorithms.diversos;

import java.util.Scanner;
public class Alunos {

	public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int x;
        for(x = 1; x <= 30; x++) {
        	System.out.println("Digite o " + x + " nome:");
        	// o x vai somando de um em um
        	String nomes = t.next();
        	System.out.println("Digite a " + x + " do " + x + " aluno");
        	double y = t.nextDouble();
        }
        t.close();
        
	}

}
