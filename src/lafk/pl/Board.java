package lafk.pl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tammo on 18.02.16.
 */
public class Board {
    private final BoardSize boardSize;
    private final FieldsList fields;

    public Board(BoardSize boardSize) {
        this.boardSize = boardSize;
        this.fields = new FieldsList(boardSize);
    }

    public Board placeO() {
        return this.place(Sign.O);
    }

    private Board place(Sign sign) {
        Scanner s = new Scanner(System.in);
        System.out.println("Field number <1-9>, 5 being the middle, (0 someday will quit)?");
        fields.updateField(s.nextInt()).with(sign);
        s.close();
        return this;
    }

    @Override
    public String toString() {
        return fields.toString();
    }
}
