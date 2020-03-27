import java.io.*;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static String[] valor;

	private static void conta(Integer n) throws IOException{
		int i,j,k;
		int cont=0;
		int maximo = 0;        
		valor = new String[n];
		String aux;
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));

		for (i=0; i<n; i++){ 
			aux = null;
			if ( (aux = str.readLine() ) != null){                
				valor[i] = aux;
			} else {
				valor[i] = "";
			}                
		}        

		Arrays.sort(valor);
		if(n>0)
			maximo = valor[0].length();
		for (i=0; i<n-1; i++){            
			for(k=0; k<maximo; k++){
				if ( valor[i].charAt(k) != '\n' && valor[i].charAt(k) == valor[i+1].charAt(k)) {
					cont++;
				} else break;
			}            
		}
		log.write(cont + "\n");
		log.flush();         
	}

	public static void main(String[] args) throws IOException {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N;
			String str = null;
			while ((str = sc.readLine()) != null) {
				N = Integer.parseInt(str.trim());
				conta(N);
			}
		}
		catch(Exception ex){

		}
	}      
}
