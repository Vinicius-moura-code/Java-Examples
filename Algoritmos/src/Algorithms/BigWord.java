package Algorithms;
import java.util.Scanner;
public class BigWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Write : ");
		String text;
		int maior = 0;
		text = tec.nextLine();
		String bloco[]=text.split(" ");
		
		for(int x = 0 ;x< bloco.length;x++) {
			if (bloco[x].length() > bloco[maior].length() ) {
				maior=x;
			}
		}
		System.out.println(bloco[maior]);
		
		tec.close();

	}

}
