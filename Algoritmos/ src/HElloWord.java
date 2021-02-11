import java.util.Scanner;
public class HElloWord {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite seu nome: ");

		String nome=tec.nextLine();

		if(nome.equalsIgnoreCase("Thais")) {
			System.out.println("Seja bem vinda Thais");	
		}else {
			if(nome.equalsIgnoreCase("Thiago")){
				System.out.println("Seja bem vindo Thiago" );
			}else {
				System.out.println("Boa noite " + nome);
			}
		}


		tec.close();

	}

}
