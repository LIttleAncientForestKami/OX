package lafk.pl;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Game {
    private final BoardSize boardSize;
    private final WinningSeqLength winningSeqLength;
    private Board board;

    public Game(BoardSize boardSize, WinningSeqLength winningSeqLength) {
        this.boardSize = boardSize;
        this.winningSeqLength = winningSeqLength;
    }

    public Game start() {
        System.out.println("OX game, O starts");
        board = new Board(boardSize);
        System.out.println(board);
        return this;
    }

    public Game playO() {
        board.placeO();
        System.out.println(board);
        return this;
    }

    public Game playX() {
        board.placeX();
        System.out.println(board);
        return this;
    }

    public Game end() {
        UserInput.closeScanner();
        return this;
    }
}
