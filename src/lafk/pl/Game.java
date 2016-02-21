package lafk.pl;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Game {
    private final BoardSize boardSize;
    private final WinningSeqLength winningSeqLength;
    private Board board;
    private Arbiter arbiter;

    public Game(BoardSize boardSize, WinningSeqLength winningSeqLength) {
        this.boardSize = boardSize;
        this.winningSeqLength = winningSeqLength;
    }

    public Game start() {
        System.out.println("OX game, O starts");
        board = new Board(boardSize);
        arbiter = new Arbiter(board);
        System.out.println(board);
        return this;
    }

    public Game playO() {
        board = placeWhereUserPoints(Sign.O);
        System.out.println(board);
        return this;
    }

    private Board placeWhereUserPoints(Sign sign) {
        System.out.println("Place " + sign + "! Fields numbered <1-9>, 5 being the middle, (0 someday will quit)?");
        int chosenFieldNumber = UserInput.askWhichField() - 1;
        switch (sign) {
            case O: board.addOField(chosenFieldNumber); Arbiter.didOWinWithField(chosenFieldNumber); break;
            case X: board.addXField(chosenFieldNumber); break;
        }
        return board;
    }


    public Game playX() {
        board = placeWhereUserPoints(Sign.X);
        System.out.println(board);
        return this;
    }

    public Game end() {
        UserInput.closeScanner();
        return this;
    }
}
