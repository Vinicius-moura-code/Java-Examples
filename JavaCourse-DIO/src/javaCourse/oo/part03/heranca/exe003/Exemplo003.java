package javaCourse.oo.part03.heranca.exe003;

public class Exemplo003 {
    public static void main(String[] args) {

        Veiculo generico = new Veiculo();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto());

        Veiculo carro = new Carro();
        carro.setValorVenal(1000.0);
        System.out.println(carro.calculaImposto());


        Veiculo moto = new Motocicleta();
        moto.setValorVenal(1000.0);
        System.out.println(moto.calculaImposto());


    }

}
