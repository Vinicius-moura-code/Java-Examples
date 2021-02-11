package javaCourse.oo.part04.exeEquals.exe001;

public class Exe001 {
    public static void main(String[]args){
        Veiculo carro1 = new Carro("Palio", "Fiat", 2000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 2000.0);

        System.out.println(carro1.equals(carro2)); //false
    }
}
