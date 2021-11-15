package views.banco;

import models.banco.Cliente;
import models.banco.Conta;
import models.banco.ContaCorrente;
import models.banco.ContaPoupanca;

import java.time.LocalDate;

public class Menu {
    public Menu(){

        Cliente cli1 = new Cliente("987.654.321-00", "Fulano", "de Tal");
        Conta c1 = new ContaPoupanca(332, cli1, 2000, LocalDate.of(2021,8,10));

        Cliente cli2 = new Cliente("105.861.830-00", "Beutrano", "de Silva");
        Conta c2 = new ContaCorrente(333, cli2, 2000, 3000);

        System.out.println("Teste: SACAR");
        c1.sacar(235);
        c2.sacar(732);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Teste: TRASFERIR");
        c1.transfere(65, c2);
        c2.transfere(157, c1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Teste: DEPOSITAR");
        c1.depositar(5);
        c2.depositar(30);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Teste: RENDIMENTO");
        double valor = ((ContaPoupanca) c1).calculaTaxaDeRendimento(0.5);
        System.out.println("Rendimento: "+valor);
    }

}
