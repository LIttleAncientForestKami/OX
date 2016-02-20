package lafk.pl;

/**
 * Game of XO as a state machine.
 * Tried coding it from walking skeleton (Growing OO-software guided by tests)
 * and in Object Callisthenic style (see my blog).
 *
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Game(new BoardSize(3), new WinningSeqLength(3));
        game.start()
            .playO()
            .playX()
            .playO()
            .playX()
            .playO()
            .playX()
            .playO()
            .playX()
            .playO()
            .end();

    }
}