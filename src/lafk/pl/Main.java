package lafk.pl;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(new BoardSize(3), new WinningSeqLength(3));
        game.start()
            .playO()
            .playX();

    }
}