package models.banco;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;

    public Conta(int numero, Cliente titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double quantidade) {
        if(this.saldo < quantidade)
            return	false;
        else {
            this.saldo -= quantidade;
            return true;
        }
    }

    public void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
