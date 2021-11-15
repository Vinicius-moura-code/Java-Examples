package views.bancoPoli;

import models.BancoPoli.Funcionario;
import models.BancoPoli.Terceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Menu {

    public Menu() {
        Scanner tec = new Scanner(System.in);


        List<Funcionario> funcionario = new ArrayList();

        System.out.print("Entre com o número de funcionário: ");
        int numFunc = tec.nextInt();


        for (int i = 1; i <= numFunc; i++) {


            System.out.print("Funcionario #" + i+ System.lineSeparator());

            System.out.print("Terceirizado ( s / n )?" + System.lineSeparator());

            String func = tec.nextLine();
            func = tec.nextLine();
            String nome;
            int horas;
            double valor;
            double extra;
            if (func.equals("s") || func.equals("S")) {
                System.out.print("Nome: ");
                nome = tec.nextLine();

                System.out.print("Horas trabalhadas: ");
                horas = tec.nextInt();

                System.out.print("Valor por hora: ");
                valor = tec.nextDouble();
                System.out.print("Despesa adicional: ");
                extra = tec.nextDouble();
                funcionario.add(
                        new Terceirizado(
                                nome,
                                horas,
                                valor,
                                extra
                        )
                );
            } else {
                System.out.print("Nome: ");
                nome = tec.nextLine();

                System.out.print("Horas trabalhadas: ");
                horas = tec.nextInt();

                System.out.print("Valor por hora: ");
                valor = tec.nextDouble();
                funcionario.add(
                        new Funcionario(
                                nome,
                                horas,
                                valor
                        )
                );
            }
        }
        System.out.println();
        System.out.println("PAGAMENTOS: ");
        for (var item : funcionario
        ) {
            System.out.println(item);
        }
        tec.close();
    }


}
