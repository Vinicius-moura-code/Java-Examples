package models.banco;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends Conta {
    private LocalDate dataAplicacao;

    public ContaPoupanca(int numero, Cliente titular, double saldo, LocalDate dataAplicacao) {
        super(numero, titular, saldo);
        this.dataAplicacao = dataAplicacao;
    }

    public LocalDate getTaxaRendimento() {
        return dataAplicacao;
    }

    public void setTaxaRendimento(LocalDate taxaRendimento) {
        this.dataAplicacao = taxaRendimento;
    }

    public String getTipo(){
        return "conta-poupança";
    }

    public double calculaTaxaDeRendimento(double taxaRendimeno){
        long calc = ChronoUnit.MONTHS.between(dataAplicacao, LocalDate.now());
        return calc * taxaRendimeno;
    }
    public static String format(double x ){
        return String.format("%.2f", x);
    }

    public String toString() {
        return "Nome: " + getTitular().getNome()+" "+ getTitular().getSobrenome()+"\n"
                + "Conta: "+getTipo() +" Nº: " + getNumero()+"\n"
                +"Saldo: R$ " + format(getSaldo())+"\n"
                +"\n"
                ;
    }
}
