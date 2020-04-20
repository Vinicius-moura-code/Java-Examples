import java.util.Scanner;
public class Test {

	public static void main(String[] args) {

		Scanner tec =  new  Scanner (System.in);
		int N = tec.nextInt();
		tec.close();
		for (int i =  1; i<=(4*N); i++){
			if (i %4 != 0){
				System.out.printf("% d",i);
			}else{
				System.out.println(" PUM ");
			}
		}
	}
}