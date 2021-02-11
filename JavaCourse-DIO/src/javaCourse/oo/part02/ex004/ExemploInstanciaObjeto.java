package javaCourse.oo.part02.ex004;

/*
modelo;
marca;
ano;
variante;*/
public class ExemploInstanciaObjeto {

    public static void main(String[] args) {
        Carro carro = new Carro( "Uno" , "fiat", 56);
        carro.setVariante("Branca");

        System.out.println(carro.getModelo());
        System.out.println(carro.getMarca());
        System.out.println(carro.getAno());
        System.out.println(carro.getVariante());
    }
}
