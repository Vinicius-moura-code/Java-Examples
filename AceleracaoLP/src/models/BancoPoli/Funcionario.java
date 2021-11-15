package models.BancoPoli;

public class Funcionario {
    protected String nome;
    protected int horasTrabalhadas;
    protected double valorPorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorPorHora){
        this.setNome(nome);
        this.setHorasTrabalhadas(horasTrabalhadas);
        this.setValorPorHora(valorPorHora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }



    public double pagamento(){
        return  this.getHorasTrabalhadas() * this.getValorPorHora();
    }

    @Override
    public String toString() {
        return nome + " - R$ " + pagamento();
    }

}
