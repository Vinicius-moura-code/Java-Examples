package javaCourse.oo.part02.ex004;

public class Carro {
    private String modelo;
    private String marca;
    private Integer ano;
    public String variante;

    public Carro(String marca, String modelo, Integer ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.variante = variante;
    }

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }


}
