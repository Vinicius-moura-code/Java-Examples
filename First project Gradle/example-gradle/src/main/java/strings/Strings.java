package strings;

public class Strings {
    public static void main(String[] args) {
        var nome = "Vinicius";
        var sobreNome = "Moura";
        final var nomeCompleto = nome + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " + nomeCompleto);
        var string = new String("Minha string");

        System.out.println("Char na posição : " + string.charAt(2));
        System.out.println("Quantidade = " + string.length());
        System.out.println("Sem Trim [" + string + "]");
        System.out.println("Com Trim " + string.trim());
        System.out.println("Lower " + string.toLowerCase());
        System.out.println("Upper" + string.toUpperCase());
        System.out.println("Contem M ? " + string.contains("M"));
        System.out.println("Contem X ? " + string.contains("X"));
        System.out.println("Replace " + string.replace("n", "s"));
        System.out.println("Equals ? " + string.equals("Minha string"));
        System.out.println("EqualIgnoreCase? " + string.equalsIgnoreCase("minhaString"));//Ignorar maiusculas e minusculas
        System.out.println("Substring(1,6) = " + string.substring(1, 6));

    }
}
