package Algorithms.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);

        //Variaveis//Input
        float N1 = tec.nextFloat()*2;
        float N2 = tec.nextFloat()*3;
        float N3 = tec.nextFloat()*4;
        float N4 = tec.nextFloat()*1;
        double mediaFinal;
        //Código
        float media = (N2 + N1 + N4 + N3)/10;

        System.out.printf("Media: %.1f%n" , media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            float exame = tec.nextFloat();
            System.out.printf("Nota do exame: %.1f%n" , exame);
            mediaFinal = ((exame + media) / 2.0);
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n" , mediaFinal);
        }
        tec.close();
    }
}
