package Algorithms.diversos;
public class Fibonacci {

	public static void main(String[] args) {

		int x = 0;
		int v = 1;
		int cal;
		for (int i = 0; i<30; i++){
			System.out.println(v);
			cal = v;
			v = v+x;
			x = cal;

		}

	}

}
