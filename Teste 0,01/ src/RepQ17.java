import java.util.Scanner;
public class RepQ17 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Digite dois valores");
		int x =  tec.nextInt();
		int v = tec.nextInt();
		int soma =0;
		while(x>v) {
			System.out.println("Valor invalido!! \nO valor inicial tem que ser maior que o final");
			System.out.println("\n");
			System.out.println("Digite um valor valido :");
			x =  tec.nextInt();
			v = tec.nextInt();
		}
		if(x<v) {
			for(;x<=v;x++) {
				if(x % 2  == 0) {
					System.out.println(x + " é par");
				}else {
					System.out.println(x + " é impar");
				}
				soma += x;
			}

			if(soma % 2 == 0) {
				System.out.println("O resultado "+ soma + " é par");
			}else {
				System.out.println("O resultado "+ soma + " é impar");
			}


		}
		System.out.println("\nAplicação execultada com êxito");
		tec.close();	
	}

}
