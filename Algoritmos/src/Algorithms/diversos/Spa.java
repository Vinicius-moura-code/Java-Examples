package Algorithms.diversos;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Spa {

	private Scanner l;
	private boolean executar;
	private List<Dados> dados;

	public static void main(String[] args) {
		new Spa();
	}

	private Spa() {
		l = new Scanner(System.in);
		executar = true;
		dados = new ArrayList<Dados>();

		System.out.println("Bem vindo ao Spa");

		while (executar) {
			String opcao = menu();

			if (opcao.equalsIgnoreCase("s")) {
				cadastrar();
			} else if (opcao.equalsIgnoreCase("n")) {
				executar = false;
			} else {
				System.out.println("\nOp��o Inv�lida !!! \n");
			}
		}
	}

	private String menu() {
		System.out.println("Selecione a op��o:");
		System.out.println("S - Novo cadastro");
		System.out.println("N - Sair");
		return l.nextLine();
	}

	private void cadastrar() {
		boolean cadastrando = true;

		while (cadastrando) {
			System.out.println("Cadastro de Usu�rio");
			Dados d = new Dados();
			d.setNome(textInput("Nome:"));
			d.setLogin(textInput("Idade: "));
			d.setCargo(textInput("Cargo: "));

			String cadastrar = textInput("Adicionar cadastro (S/N) ?");
			if (cadastrar.equalsIgnoreCase("s")) {
				System.out.println("Cadastro adicionado !!!");
				dados.add(d);
			} else if (cadastrar.equalsIgnoreCase("n")){
				System.out.println("Cadastro ignorado !!!");
			} else {
				System.out.println("\nOp��o inv�lida seu noob, vou ignorar o cadastro s� pra voc� ter que digitar denovo !!! \n");
			}

			String continua = textInput("Continuar cadastrando (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
				// se for s sai do if e volta para o inicio do while
			} else {
				System.out.println("\nOp��o inv�lida seu noob, eu vou sair s� porque voc� n�o colabora !!! \n");
				cadastrando = false;
			}
		}
	}



	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
}
