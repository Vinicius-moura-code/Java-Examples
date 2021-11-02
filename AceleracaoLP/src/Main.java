import utils.CurrencyConverter;
import views.locacaoAutomoveis.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String notImp = "!!!!!!!! Atividade ainda não implementada !!!!!!!!" + System.lineSeparator();
        boolean find = false;

        System.out.println("\033[0;1m" + "---  Atividades de aceleração - LP1 ---" + System.lineSeparator());


        do {
            System.out.println(" - Selecione uma função" + System.lineSeparator());
            System.out.print("1 - Locação de veículos\n2 - Tópico 4\n3 - Controle de estoque\n4 - Converter Dollar para real\n5 - Atividade sobre List" + System.lineSeparator());
            int option = tec.nextInt();

            switch (option) {
                case 1:
                    new Menu();
                    find = true;
                    break;
                case 2:
                    new views.atividadeModAcesso.Menu();
                    find = true;
                    break;
                case 3:
                    new views.controleDeEstoque.Menu();
                    find = true;
                    break;
                case 4:
                    new CurrencyConverter();
                    find = true;
                    break;
                case 5:
                    new views.atividadeList.Menu();
                    find = true;
                    break;
                default:
                    System.out.println("Opção Invalida");
                    find = false;
            }
        } while (!find);
    }
}
