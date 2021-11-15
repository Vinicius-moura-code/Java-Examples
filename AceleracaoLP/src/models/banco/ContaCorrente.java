package models.banco;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, Cliente titular, double saldo, double limiteChequeEspecial) {
        super(numero, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    public String getTipo(){
        return "conta-corrente";
    }
    public static String format(double x ){
        return String.format("%.2f", x);
    }

    @Override
    public boolean sacar(double quantidade) {
        if(this.limiteChequeEspecial < quantidade)
            return	false;
        else {
            this.setSaldo(getSaldo() - quantidade) ;
            return true;
        }
    }

    @Override
    public boolean transfere(double valor, Conta destino) {
        if (this.limiteChequeEspecial >= valor) {
            this.limiteChequeEspecial -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public String toString() {
        return "Nome: " + getTitular().getNome()+" "+ getTitular().getSobrenome()+"\n"
                + "Conta: "+getTipo() +" Nº: " + getNumero()+"\n"
                +"Saldo: R$ " + format(getSaldo())+"\n"
                +"\n"
                ;
    }

}
