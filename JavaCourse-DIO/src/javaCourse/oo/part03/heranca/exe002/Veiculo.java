package javaCourse.oo.part03.heranca.exe002;

public class Veiculo {
    private String modelo;
    private String marca;

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

    public void acelera() {

        System.out.print("Acelerando ");
        for (int i = 0; i < 10; i++) {
            System.out.print(".");
        }
        System.out.println();
    }
}
