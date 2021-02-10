package strings;

public class BuilderDeStrings {
    public static void main(String[] args) {

        var nome = "Vinicius";

        final var builder = new java.lang.StringBuilder(nome);
        System.out.println(builder.append("Moura"));

        final var reverse = builder.reverse();

        System.out.println(reverse);

        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(insert);

    }
}
