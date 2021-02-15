package Algorithms;
import java.util.Scanner;
public class Media {


	public static void main(String[] args) {
		Scanner Tec=new Scanner(System.in);
		double Ing,Fis,Pe,Pg,Pv,Soc,Fil,Mat,His,Qui,Ef,Media;
		System.out.println("Digite um valor para Ingles");
		Ing = Tec.nextDouble();
		System.out.println("Digite um valor para F�sica");
		Fis = Tec.nextDouble();
		System.out.println("Digite um valor para Pratica em eventos");
		Pe = Tec.nextDouble();
		System.out.println("Digite um valor para Programa��o visual");
		Pv = Tec.nextDouble();
		System.out.println("Digite um valor para planejamento e gest�o");
		Pg = Tec.nextDouble();
		System.out.println("Digite um valor para Sociologia");
		Soc = Tec.nextDouble();
		System.out.println("Digite um valor para Filosofia");
		Fil = Tec.nextDouble();
		System.out.println("Digite um valor para Matematica");
		Mat = Tec.nextDouble();
		System.out.println("Digite um valor para Hist�ria");
		His = Tec.nextDouble();
		System.out.println("Digite um valor para Qu�mica");
		Qui = Tec.nextDouble();
		System.out.println("Digite um valor para Ed.Fis�ca");
		Ef = Tec.nextDouble();
		Media = (Ing+Fis+Pe+Pg+Pv+Soc+Fil+Mat+His+Qui+Ef)/11;
		System.out.println("O valor da m�dia �:" + Media);
		
		Tec.close();

	}

}
