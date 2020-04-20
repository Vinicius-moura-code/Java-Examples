<<<<<<< HEAD
import java.util.Scanner;

public class ResolucaoOrozco {

	public static void main(String[] args) {
		int[][] estabelecimento = new int[30][5];
		int reserva = 0;
		Scanner t = new Scanner(System.in);
		int cadeirasDisponiveis = 0;
		String continua="S";

		for(int mesa=0; mesa<30; mesa++){
			for(int cadeira=0; cadeira<5; cadeira++){
				estabelecimento[mesa][cadeira] = 0;
			}
		}

		do{
			cadeirasDisponiveis = 0;
			System.out.println("Quantas reservas voce deseja?");
			reserva = t.nextInt();

			for(int mesa=0; mesa<30; mesa++){
				for(int cadeira=0; cadeira<5; cadeira++){
					if(estabelecimento[mesa][cadeira] == 0){
						cadeirasDisponiveis++;
					}
				}
			}

			if(cadeirasDisponiveis >= reserva){
				for(int mesa=0; mesa<30; mesa++){
					if(reserva>0){
						for(int cadeira=0; cadeira<5; cadeira++){
							if(reserva > 0){
								if(estabelecimento[mesa][cadeira] == 0){
									estabelecimento[mesa][cadeira] = 1;
									reserva--;
									cadeirasDisponiveis--;
								}
							}else{
								break;
							}
						}
					}
					else{
						break;
					}
				}
				System.out.println("Reservas realizadas com sucesso");

			}else{
				System.out.println("Não há lugares disponiveis para esta reserva");
			}
			if(cadeirasDisponiveis == 0){
				continua = "n";	
			}else{
				System.out.println("Deseja realizar mais reservas?(S/n)");
				do{
					continua = "S";
					t.nextLine();
					continua = t.nextLine();
				}while((!continua.equalsIgnoreCase("S")) && (!continua.equalsIgnoreCase("n")));
			}
		}while(continua.equalsIgnoreCase("S"));

		System.out.println("Obrigado! Volte sempre!");
		t.close();
	}

=======
import java.util.Scanner;

public class ResolucaoOrozco {

	public static void main(String[] args) {
		int[][] estabelecimento = new int[30][5];
		int reserva = 0;
		Scanner t = new Scanner(System.in);
		int cadeirasDisponiveis = 0;
		String continua="S";

		for(int mesa=0; mesa<30; mesa++){
			for(int cadeira=0; cadeira<5; cadeira++){
				estabelecimento[mesa][cadeira] = 0;
			}
		}

		do{
			cadeirasDisponiveis = 0;
			System.out.println("Quantas reservas voce deseja?");
			reserva = t.nextInt();

			for(int mesa=0; mesa<30; mesa++){
				for(int cadeira=0; cadeira<5; cadeira++){
					if(estabelecimento[mesa][cadeira] == 0){
						cadeirasDisponiveis++;
					}
				}
			}

			if(cadeirasDisponiveis >= reserva){
				for(int mesa=0; mesa<30; mesa++){
					if(reserva>0){
						for(int cadeira=0; cadeira<5; cadeira++){
							if(reserva > 0){
								if(estabelecimento[mesa][cadeira] == 0){
									estabelecimento[mesa][cadeira] = 1;
									reserva--;
									cadeirasDisponiveis--;
								}
							}else{
								break;
							}
						}
					}
					else{
						break;
					}
				}
				System.out.println("Reservas realizadas com sucesso");

			}else{
				System.out.println("Não há lugares disponiveis para esta reserva");
			}
			if(cadeirasDisponiveis == 0){
				continua = "n";	
			}else{
				System.out.println("Deseja realizar mais reservas?(S/n)");
				do{
					continua = "S";
					t.nextLine();
					continua = t.nextLine();
				}while((!continua.equalsIgnoreCase("S")) && (!continua.equalsIgnoreCase("n")));
			}
		}while(continua.equalsIgnoreCase("S"));

		System.out.println("Obrigado! Volte sempre!");
		t.close();
	}

>>>>>>> master
}