package views.atividadeModAcesso;

import models.atividadeModAcesso.Casa;
import models.atividadeModAcesso.Pessoa;
import models.atividadeModAcesso.Porta;

import java.util.Scanner;

public class Menu {

    public Menu() {
        Scanner tec = new Scanner(System.in);
        boolean find = false;


        System.out.println("\033[0;1m" + "--- Tópico 4 ---" + System.lineSeparator());


        do {
            System.out.println(" - Selecione uma função" + System.lineSeparator());
            System.out.print("1 - Pessoa\n2 - Porta\n3 - Casa\n");
            int option = tec.nextInt();

            switch (option) {
                case 1:
                    editPessoa();
                    find = true;
                    break;
                case 2:
                    editPorta();
                    find = true;
                    break;
                case 3:
                    editCasa();
                    find = true;
                    break;
                default:
                    System.out.println("Opção Invalida");
                    find = false;
            }
        } while (!find);


    }

    public void editPessoa() {
        Pessoa jose = new Pessoa("Jose", 8);

        int i = 1;
        System.out.println(jose.getNome() + " de " + jose.getIdade() + " anos.");
        do {
            System.out.println(jose.getNome() + " de " + jose.getIdade() + " anos.");
            jose.fazAniversario();
            jose.setIdade(jose.getIdade() + 1);
            i++;
        } while (i < 10);

    }

    public void editPorta() {
        Porta porta = new Porta();
        porta.abre();
        porta.fecha();
        porta.pinta("azul");
        porta.pinta("verde");
        porta.pinta("Amarela");

        porta.setDimX(0.72);
        porta.setDimY(2.1);
        porta.setDimZ(0.03);

        System.out.println("A porta "+ porta.getCor() + " de " + porta.getDimX() + "X" + porta.getDimY() + "X" + porta.getDimZ() + " esta " + (porta.estaAberta() ? "aberta" : "Fechada"));

    }

    public void editCasa() {

        Casa casa = new Casa();

        casa.pintaCasa("azul");
        casa.pintaCasa("amarela");
        casa.pintaCasa("verde");



        casa.getPorta1().abre();
        casa.getPorta1().fecha();


        casa.getPorta2().abre();
        casa.getPorta2().fecha();

        casa.getPorta3().abre();
        casa.getPorta3().fecha();
        System.out.println("Temos " +casa.quantasPortasAbertas()+ " portas abertas.");
    }

}
