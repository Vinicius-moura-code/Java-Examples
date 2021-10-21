package Models.LocacaoAutomoveis;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    public Veiculo(String chassi, String marca, String modelo, int anoFabricacao, double preco, boolean disponibilidade) {
        this.chassi = chassi;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }
    public Veiculo(){

    }

    private String chassi;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;
    private boolean disponibilidade;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    //////////////////-------------------Métodos-----------------//////////////////

    public boolean isAvailable(){
        return disponibilidade;
    }

    //Retorna uma lista de Veiculos
    public List<Veiculo> geraCar(){

        List<Veiculo> v;
        v = new ArrayList<Veiculo>();

        v.add( new Veiculo("9BWSU19FO8B302158", "Fiat", "Pálio", 2011, 30.50, true ));
        v.add( new Veiculo("4CWSU87FO4B302158", "Fiat", "Uno", 1998, 20.17, true ));

        return v;
    }
}
