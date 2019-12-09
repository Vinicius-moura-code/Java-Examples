import java.util.Scanner;
public class Teste003 {

	public static void main(String[] args) {
       Scanner t=new Scanner(System.in);
       int x;
       for(x=1;x<=5;x++) {
    	   System.out.println("Digite o "+ x + "º nome:");
    	   String nome=t.next();
    	   System.out.println("Digite a idade do/a "+ nome);
    	   int idade=t.nextInt();
       }
       t.close();
       
	
	}


}
