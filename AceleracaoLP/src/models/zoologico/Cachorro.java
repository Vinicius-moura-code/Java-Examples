package models.zoologico;

import java.time.LocalDate;

public class Cachorro extends Mamifero {

    public Cachorro(){
        this.nome = "Cachorro";
        this.dataNascimento = LocalDate.of(2000, 5,22);
        emiteSom();
    }

    @Override
    public String emiteSom() {
        return "au au";
    }


    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + dataNascimento + ", Sons: "+ emiteSom();
    }
}
