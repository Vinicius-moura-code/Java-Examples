package interfaces;

public class Program {
    public static void main(String[] args) {

        final Gol gol = new Gol();
        System.out.println("Marca do Gol : " + gol.marca());
        gol.ligar();

        final Trator trator = new Trator();
        System.out.println("Registro do trator : " + trator.registro());
        trator.ligar();

        final Fiesta fiesta = new Fiesta();

        System.out.println("Marca do Fiesta : " + fiesta.marca());
        System.out.println("Registro do Fiesta : " + fiesta.registro());
        fiesta.ligar();
    }
}
