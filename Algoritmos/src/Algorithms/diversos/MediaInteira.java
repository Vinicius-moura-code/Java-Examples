package Algorithms.diversos;
import java.util.Scanner;
public class MediaInteira {

	public static void main(String[] args) {
		Scanner Tec = new Scanner(System.in);
		int Ing,Pe,Pv,Mat,His,Qui,Media;
		System.out.println("Digite um valor para ingles");
		Ing = Tec.nextInt();
		System.out.println("Digite um valor para Pratica em eventos");
		Pe = Tec.nextInt();
		System.out.println("Digite um valor para Programa��o visual");
		Pv = Tec.nextInt();
		System.out.println("Digite um valor para Matematica");
		Mat = Tec.nextInt();
		System.out.println("Digite um valor para Hist�ria");
		His = Tec.nextInt();
		System.out.println("Digite um valor para Qu�mica");
		Qui = Tec.nextInt();
		Media = (Ing+Pe+Pv+Mat+His+Qui)/6;
		System.out.println("O valor da m�dia �:" + Media);
		
		Tec.close();

	}

}
