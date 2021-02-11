import java.util.Scanner;
public class Emprestimo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Qual valor foi emprestado ?");
		double emprestimo = tec.nextDouble();
		double deve = (emprestimo*15)/100;
		double t = emprestimo+deve;
		System.out.println("O valor a ser recebido é: " + t);
		
		tec.close();

	}

}
