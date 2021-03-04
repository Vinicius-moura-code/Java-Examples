package Algorithms.diversos;

import java.util.Scanner;
public class AdalbertoFeliciano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HAO");
		Scanner tec = new Scanner(System.in);

		int matriz[][]= new int[3][3]; 

		matriz[0][0] = tec.nextInt();
		matriz[0][1] = tec.nextInt();
		matriz[0][2] = tec.nextInt();

		matriz[1][0] = tec.nextInt();
		matriz[1][1] = tec.nextInt();
		matriz[1][2] = tec.nextInt();

		matriz[2][0] = tec.nextInt();
		matriz[2][1] = tec.nextInt();
		matriz[2][2] = tec.nextInt();

		int calc = (matriz [0][0] + matriz [1][1] + matriz [2][2]);
		System.out.println( "\n-> O resultado da soma da diagonal secundaria � : " +calc+"\n");
		
		System.out.println(matriz [0][0] + "  " + matriz [0][1] + "  " + matriz [0][2]);
		System.out.println(matriz [1][0] + "  " + matriz [1][1] + "  " + matriz [1][2]);
		System.out.println(matriz [2][0] + "  " + matriz [2][1] + "  " + matriz [2][2]);
		
		tec.close();

	}

}
