import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class AbstraiCarac {

	
	public static String[] subst(String[] array) {
		Scanner tec = new Scanner(System.in);
		Arrays.sort(array);
		String[] lista = new String[array.length];
		
		// parte central do algoritmo
		int j = 0;
		for (int i = 0; i < array.length; i++) {
		      if ((i > 0) && (array[i] == array[i - 1])) continue;
		      if ((i < array.length - 1) && (array[i] == array[i + 1])) continue;
		      lista[j++] = array[i];		      		      
		}
		
		// se tinha elementos repetidos
		if (j != array.length){
			String[] newLista = new String[j];
			System.arraycopy(lista, 0, newLista, 0, j);
			return newLista;
		}

		return lista;
	}
	public static void main(String[] args) {
        String[] array = { "Antonio","Bocaberta","Antonio"};
        
        array = new HashSet<String>(Arrays.asList(array)).toArray(new String[0]);
        
        for (String str : array)
            System.out.println(str + " ");
    }
}