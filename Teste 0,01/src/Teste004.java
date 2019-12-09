import java.util.Scanner;
public class Teste004 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int x;
		for(x=0;x<=10; x++) {
			System.out.println("Digite o valor ");
			int y=teclado.nextInt();
			if(y%2==0) {
				System.out.println(y+" é par ");
				
			} if(y%2!=0) {
				System.out.println(y+" é impar ");
			}
			
		}	
		teclado.close();
		       
	}

}
