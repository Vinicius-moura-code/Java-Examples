package models.zoologico;

import java.time.LocalDate;

public class Gato extends Mamifero {

    public Gato(){
        this.nome = "Gato";
        this.dataNascimento = LocalDate.of(2000,6,2);
        emiteSom();
    }

    @Override
    public String emiteSom() {
        return "miaiu";
    }


    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + dataNascimento + ", Sons: "+ emiteSom();
    }
}
