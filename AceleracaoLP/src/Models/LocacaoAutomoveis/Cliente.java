package Models.LocacaoAutomoveis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;

    public Cliente(String nome, String cpf, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    public Cliente(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //Retorna uma lista de clientes

    public List<Cliente> geraClientes() {
        int aleatorio = new Random().nextInt(10) + 1;
        List<Cliente> c;
        c = new ArrayList<Cliente>();

        String[] nomes = {"Ibere", "Adalto", "Jair", "Marcia", "Mariza", "Godofredo", "Lisbela", "Ducarmo", "Sabia", "Mario", "Link"};
        String[] cpfs = {"14346285000121", "14451475000109", "34384798000134", "70970100000126", "86770058000130", "56796633000102", "65057698000127", "19267758000119", "87602488000105", "50438466000141", "45440783000162"};
        String[] emails = {"leyanis4762@uorak.com", "nagina9617@uorak.com", "staci3904@uorak.com", "liboria9128@uorak.com","leyanis4762@uorak.com", "nagina9617@uorak.com", "staci3904@uorak.com", "liboria9128@uorak.com","leyanis4762@uorak.com", "nagina9617@uorak.com", "staci3904@uorak.com", "liboria9128@uorak.com" };

        for (int i = 1; i < 10; i++) {
            c.add(
                    new Cliente(""+nomes[i]+"",
                            ""+ cpfs[i] +"",
                            ""+ emails[i] +"",
                            LocalDate.of(2010, i, i))
            );
        }
        return c;
    }


}
