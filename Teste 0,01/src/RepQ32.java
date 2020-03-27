import java.util.Scanner;
public class RepQ32 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int c = tec.nextInt();

		for(int i = 1;i<=10;i++) {
			int tabuada []= new int[i];
			int mult = (tabuada.length * c);

			System.out.println(tabuada.length + " X " + c +" = "+ mult);


		}

		tec.close();

	}

}
