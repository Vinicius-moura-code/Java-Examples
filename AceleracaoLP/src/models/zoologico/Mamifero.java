package models.zoologico;

import java.time.LocalDate;

public class Mamifero {
    protected String nome;
    protected LocalDate dataNascimento;

    public Mamifero(){
        this.nome = "Mamiferos";
        this.dataNascimento =  LocalDate.of(2000,6,2);
        emiteSom();
    }

    public String emiteSom(){
        return "som generico" ;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + dataNascimento + ", Sons: "+ emiteSom();
    }
}
