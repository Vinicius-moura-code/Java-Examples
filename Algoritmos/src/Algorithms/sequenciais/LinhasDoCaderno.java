package Algorithms.sequenciais;

import java.util.Scanner;

public class LinhasDoCaderno {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int x = tec.nextInt();
        int y = tec.nextInt();

        System.out.println(x * y + " linhas");

        tec.close();
    }
}
