package Algorithms.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class DigitoVerificador {
    public static void main(String[]args){
        Locale.setDefault(new Locale("en", "usa"));
        Scanner tec = new Scanner(System.in);
        //Variaveis//Input
        int number = tec.nextInt();
        //Código
        int firstDigit = number / 100;
        int secondDigit = (number % 100) / 10;
        int thirdDigit=(number % 100) % 10;

        int inverse = (thirdDigit *100 ) + (secondDigit *10) + firstDigit;

        int sum = number + inverse;

        int sumFirstDigit = sum / 100;
        int sumSecondDigit= (sum % 100) / 10;
        int sumThirdDigit=(sum % 100) % 10;

        int multiply = (sumFirstDigit * 1) + (sumSecondDigit * 2) + (sumThirdDigit * 3);

        int lastDigit = multiply % 10;

        System.out.println(lastDigit);

        tec.close();
    }
}
