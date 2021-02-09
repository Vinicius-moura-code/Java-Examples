package classes.pessoa;

import classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "1234%$#@");

        batman.getLogin();

        //baatman.getSenha();  //ERROR

        //String nomeDoCliente = batman.nome; //ERRO

    }

}
