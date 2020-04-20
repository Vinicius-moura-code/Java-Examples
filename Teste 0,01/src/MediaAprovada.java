import java.util.Scanner;
public class MediaAprovada {

	public static void main(String[] args) {
		Scanner Tec = new Scanner(System.in);
		double Ing,Pe,Pv,Mat,His,Qui,Media;
		System.out.println("Digite um valor para Ingles");
		Ing = Tec.nextDouble();
		System.out.println("Digite um valor para Pratica em eventos");
		Pe = Tec.nextDouble();
		System.out.println("Digite um valor para Programação visual");
		Pv = Tec.nextDouble();
		System.out.println("Digite um valor para Matematica");
		Mat = Tec.nextDouble();
		System.out.println("Digite um valor para História");
		His = Tec.nextDouble();
		System.out.println("Digite um valor para Química");
		Qui = Tec.nextDouble();
		Media = (Ing+Pe+Pv+Mat+His+Qui)/6;
		System.out.println("O valor da média é: " + Media);
		//Soma as médias das notas. 
		Tec.close();


	}

}
