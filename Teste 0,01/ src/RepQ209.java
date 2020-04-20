import java.util.Scanner;
import java.util.ArrayList;
public class RepQ209 {

	private Scanner tec;
	private boolean continuar;

	public static void main(String[] args) {
		new RepQ209();
	}

	private RepQ209(){
		tec = new Scanner(System.in);
		continuar = true;
		while (continuar) {
			String opcao = menu();

			if (opcao.equalsIgnoreCase("s")) {
				cadastrar();
			} else if (opcao.equalsIgnoreCase("n")) {
				continuar = false;
			} 
		}
	}

	private String menu() {
		System.out.println("Selecione a opção:");
		System.out.println("S - Novo cadastro");
		System.out.println("N - Sair");
		return tec.nextLine();
	}
	private void cadastrar(){
		boolean cadastrando = true;

		while (cadastrando) {
			System.out.println("Cadastro de Usuário");
			System.out.println("Insira seus dados \n");

			System.out.println("Nome: ");
			String n = tec.next(); //nome
			System.out.println("Idade: ");
			int i = tec.nextInt();//idade
			System.out.println("Peso: ");
			double p = tec.nextDouble();//peso
			System.out.println("Altura: ");
			double a = tec.nextDouble();//altura
			System.out.println("Quantos quilos deseja emagrecer");
			double kg = tec.nextDouble();//quantos quilos deseja emagrecer;
			String continua = textInput("\nAdicionar cadastro (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
				// se for s sai do if e volta para o inicio do while
			} else {
				cadastrando = false;
			}
			DataSpa usuario;

			usuario = new DataSpa();

			usuario.setNome(n);
			usuario.setIdade(i);
			usuario.setPeso(p);
			usuario.setAltura(a);
			usuario.setQuilo(kg);

			ArrayList<DataSpa> usuarios = new ArrayList<DataSpa>();

			usuarios.add(usuario);

			System.out.println(usuario.getNome()+"\n"+usuario.getIdade()+"\n"+usuario.getPeso()+"\n"+usuario.getAltura()+"\n"+usuario.getQuilo());
		}

	}

	private String textInput(String label) {
		System.out.println(label);
		return tec.nextLine();
	}

}

