package models.BancoPoli;

public final class Terceirizado extends Funcionario {
    private double despezaAdicional;


    public Terceirizado(String nome, int horasTrabalhadas, double valorPorHora, double despezaAdicional){
        super(nome, horasTrabalhadas, valorPorHora);
        this.despezaAdicional = despezaAdicional;
    }
    public double getDespezaAdicional() {
        return despezaAdicional;
    }

    public void setDespezaAdicional(double despezaAdicional) {
        this.despezaAdicional = despezaAdicional;
    }

    @Override
    public double pagamento(){
        var valor = (110 * this.despezaAdicional) / 100;
        return  super.getHorasTrabalhadas() * super.getValorPorHora() + valor;
    }
    @Override
    public String toString() {
        return nome + " - R$ " + pagamento();
    }
}
