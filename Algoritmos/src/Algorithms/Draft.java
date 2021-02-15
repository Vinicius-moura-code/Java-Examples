package Algorithms;
import java.util.Scanner;
import java.util.ArrayList;
public class Draft {

    public static void main(String[] args) {
     
        Scanner l = new Scanner(System.in);
        
        System.out.println("BEM VINDO AO CADASTRO DE USU�RIOS");
        
        System.out.println("Digite os dados: "+"\nNome ");
        
        String nome = l.nextLine();
        
        System.out.println("Login desejado ");
        
        String login = l.nextLine();
        
        System.out.println("Cargo ");
        
        String cargo = l.nextLine();
        
        System.out.println("Senha de acesso");
        
        int senha = l.nextInt();
        
        
        Dados usuario;
        
        usuario = new Dados();
        
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setCargo(cargo);
        
        
        ArrayList<Dados> usuarios = new ArrayList<Dados>();
        
        usuarios.add(usuario);
        
        System.out.println(usuario.getNome()+"\n"+usuario.getLogin()+"\n"+usuario.getCargo());
     }
}