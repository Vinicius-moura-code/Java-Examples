package javaCourse.oo.part04.exeHashCode;

public class Exe002 {
    public static void main(String[]args){
        Veiculo carro1 = new Carro("Palio", "Fiat", 2000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 2000.0);

        System.out.println(carro1.equals(carro2)); //false
    }
}
