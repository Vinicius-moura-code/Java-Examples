package models.zoologico;

import java.time.LocalDate;

public class Vaca extends Mamifero {


    public Vaca() {

        this.nome = "Vaca";
        this.dataNascimento = LocalDate.of(1998, 6, 2);
        emiteSom();
    }

    @Override
    public String emiteSom() {
        return "muuh";
    }


    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + dataNascimento + ", Sons: "+ emiteSom();
    }
}