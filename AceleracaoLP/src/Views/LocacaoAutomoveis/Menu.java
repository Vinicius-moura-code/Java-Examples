package Views.LocacaoAutomoveis;

import Models.LocacaoAutomoveis.Cliente;
import Models.LocacaoAutomoveis.Locacao;
import Models.LocacaoAutomoveis.Veiculo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {


    public Menu(){
        System.out.println("\033[0;1m" + "--- Locação de Veículos ---" + System.lineSeparator());


        LocalDateTime retirada = LocalDateTime.now().minusDays(2);

        Cliente locatorio = new Cliente().geraClientes().get(1);
        Veiculo carroAlugado = new Veiculo().geraCar().get(1);

        Locacao alugar = new Locacao(locatorio, carroAlugado, retirada);
        alugar.registraEntrega(LocalDateTime.now());

        System.out.println("Locatório: " + locatorio.getNome() );
        System.out.println("Cpf: " + locatorio.getCpf() );
        System.out.println("Veiculo: " + carroAlugado.getMarca() + " " + carroAlugado.getMarca() );
        System.out.println("Chassi: " + carroAlugado.getChassi() );


        System.out.print("Custo total da locação para " + alugar.numeroDiarias()+ " diárias : RS " + alugar.calculaCusto(carroAlugado.getPreco()));
        //System.out.print(alugar.numeroDiarias(LocalDateTime.now()));


        return;
    }





}
