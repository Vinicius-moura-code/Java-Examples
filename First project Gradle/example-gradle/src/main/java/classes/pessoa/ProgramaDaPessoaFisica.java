package classes.pessoa;

public class ProgramaDaPessoaFisica {
    public static void main(String[] args) {
        final classes.pessoa.PessoaFisica pessoaFisica = new classes.pessoa.PessoaFisica(33, 100.5f);

        System.out.println(pessoaFisica.relatorio());
    }
}
