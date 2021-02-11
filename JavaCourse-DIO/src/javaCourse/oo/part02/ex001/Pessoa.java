package javaCourse.oo.part02.ex001;

public class Pessoa {
    private String nome = "Vinicius";

    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome() {
        return "Ola, meu nome é " + getNome();
    }
}
