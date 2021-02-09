package classes.usuario;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args){
        final var superUsuario = new classes.usuario.SuperUsuario("root",  "1234%$#@");

        superUsuario.getLogin();
        superUsuario.getSenha();
        String rot = superUsuario.nome;
    }

}
