package lafk.pl;

import java.util.Scanner;

/**
 * Created by tammo on 18.02.16.
 */
public class Board {
    private final BoardSize boardSize;

    public Board(BoardSize boardSize) {
        this.boardSize = boardSize;
    }

    public Board placeO() {
        return this.place(Sign.O);
    }

    private Board place(Sign sign) {
        Scanner s = new Scanner(System.in);
        System.out.println("Field number <1-9>, 5 being the middle, (0 someday will quit)?");
        this.field(s.nextInt()).is(sign);
        s.close();
        return this;
    }

    private Field field(int fieldNumber) {
        return new Field(fieldNumber);
    }

    @Override
    public String toString() {

        return "1 | 2 | 3" +
                "---------" +
                "4 | 5 | 6" +
                "---------" +
                "7 | 8 | 9";
    }
}
