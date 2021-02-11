package javaCourse.oo.part03.encapsulamento;

public class Exemplo001 {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Vinicius", 06, 02, 2000);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calcularIdade());

        eu.setNome("Vinicius Moura");
        System.out.println(eu.getNome());
    }


}
