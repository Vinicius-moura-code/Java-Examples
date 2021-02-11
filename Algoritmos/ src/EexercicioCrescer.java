import java.util.Scanner;
public class EexercicioCrescer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);

		int x = tec.nextInt();
		int soma = 0;

		for(int i = 1; i<=x;i++) {
			System.out.println(i);
			soma +=i;		

			if(i %3==0 ) {
				soma ++;		
			}else {
				if(i %5==0) {
					soma ++;
				}
			}

		}

		tec.close();
	}

}
