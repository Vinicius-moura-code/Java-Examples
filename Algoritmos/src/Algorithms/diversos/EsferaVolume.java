package Algorithms.diversos;
import java.util.Scanner;
public class EsferaVolume {

	
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	double pi = 3.14159;
	double R,VOLUME;
    R = tec.nextDouble();
	VOLUME = 4*pi*Math.pow(R,3)/3;
	System.out.printf("VOLUME = %.3f " ,VOLUME);
	
	tec.close();
	
	

	}

}
