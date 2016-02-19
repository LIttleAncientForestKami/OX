package lafk.pl;

/**
 * Created by tammo on 18.02.16.
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
}
