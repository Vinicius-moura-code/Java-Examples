package abstracts;

public class Program {
    public static void main(String[] args) {

        //final FormaGeometrica formaGeometrica = new FormaGeometrica();

        final abstracts.FormaGeometrica quadrado = new abstracts.Quadrado("quadrado", 10.0);

        System.out.println(quadrado);

        System.out.println(quadrado.desenha(12, 34));
        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());


    }
}
