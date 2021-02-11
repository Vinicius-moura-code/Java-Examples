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
				System.out.println("\nOpção Inválida !!! \n");
			}
		}
	}

	private String menu() {
		System.out.println("Selecione a opção:");
		System.out.println("S - Novo cadastro");
		System.out.println("N - Sair");
		return l.nextLine();
	}

	private void cadastrar() {
		boolean cadastrando = true;

		while (cadastrando) {
			System.out.println("Cadastro de Usuário");
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
				System.out.println("\nOpção inválida seu noob, vou ignorar o cadastro só pra você ter que digitar denovo !!! \n");
			}

			String continua = textInput("Continuar cadastrando (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
				// se for s sai do if e volta para o inicio do while
			} else {
				System.out.println("\nOpção inválida seu noob, eu vou sair só porque você não colabora !!! \n");
				cadastrando = false;
			}
		}
	}



	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
}
