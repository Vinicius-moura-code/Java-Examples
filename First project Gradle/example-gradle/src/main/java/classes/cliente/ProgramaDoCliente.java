package classes.cliente;

public class ProgramaDoCliente {
    public static void main(String[] args) {
        final var cliente = new classes.cliente.Cliente(18);

        cliente.getIdade();

        cliente.getPeso();

        //System.out.println(cliente.relatorio());
    }
}
