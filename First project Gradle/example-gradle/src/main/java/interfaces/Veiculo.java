package interfaces;

public interface Veiculo {
    String registro();

    default void ligar() {
        System.out.println("Ligando o veiculo");
    }

    //void desligar();

   /* default void desligar() {
        System.out.println("Desligando veiculo");
    }*/
}
