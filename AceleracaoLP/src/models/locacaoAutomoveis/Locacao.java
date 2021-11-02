package models.locacaoAutomoveis;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Locacao {
    private LocalDateTime momentoRetirada;
    private LocalDateTime momentoEntrega;
    private Boolean  ativa;


    private Cliente locatorio;
    private Veiculo produto;

    public Locacao(Cliente locatorio, Veiculo produto, LocalDateTime momentoRetirada){
        this.locatorio = locatorio;
        this.produto = produto;
        this.momentoRetirada = momentoRetirada;

        produto.setDisponibilidade(false);

    }

    public LocalDateTime getMomentoRetirada() {
        return momentoRetirada;
    }

    public void setMomentoRetirada(LocalDateTime momentoRetirada) {
        this.momentoRetirada = momentoRetirada;
    }

    public LocalDateTime getMomentoEntrega() {
        return momentoEntrega;
    }

    public void setMomentoEntrega(LocalDateTime momentoEntrega) {
        this.momentoEntrega = momentoEntrega;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    //////////////////-------------------Métodos-----------------//////////////////



    public void registraEntrega(LocalDateTime momentoEntrega){
        this.momentoEntrega = momentoEntrega;
    }

    public double calculaCusto(double precoVeiculo){
        return  numeroDiarias() * precoVeiculo;
    }

    //Calcula o numero de diarias
    public int numeroDiarias(){
        long result = ChronoUnit.DAYS.between(momentoRetirada, this.momentoEntrega);
        return (int) result;
    }

    public Cliente getLocatorio() {
        return locatorio;
    }

    public void setLocatorio(Cliente locatorio) {
        this.locatorio = locatorio;
    }

    public Veiculo getProduto() {
        return produto;
    }

    public void setProduto(Veiculo produto) {
        this.produto = produto;
    }
}
