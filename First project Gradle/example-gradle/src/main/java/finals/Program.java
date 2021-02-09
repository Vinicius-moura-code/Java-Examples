package finals;

public class Program {
    public static void main(String[] args) {
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        final var game = "PUBG";

        System.out.println(casualGamer.play(game));
    }
}
