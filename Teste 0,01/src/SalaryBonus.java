import java.util.Scanner;
public class SalaryBonus {

	public static void main(String[] args) {
		Scanner Tec = new Scanner(System.in);
		
		String nome = Tec.nextLine();
		double salary = Tec.nextDouble();
		double vendas = Tec.nextDouble();
		double t = (salary+(vendas*0.15));
		System.out.printf("TOTAL = R$%.2f\n",t);

	}

}
