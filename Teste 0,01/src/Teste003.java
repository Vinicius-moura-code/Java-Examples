import java.util.Scanner;
import java.util.ArrayList;
public class Teste003 {

	public static void main(String[] args) {
       Scanner t=new Scanner(System.in);
       for(int x=1;x<=5;x++) {
    	   System.out.println("Digite o "+ x + "� nome:");
    	   String nome=t.next();
    	   System.out.println("Digite a idade do(a) "+ nome);
    	   int idade=t.nextInt();
    	   
       }
       t.close();
       
	
	}


}
