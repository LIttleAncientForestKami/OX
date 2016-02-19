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
        Scanner s = new Scanner(System.in);
        System.out.println("Place "+ Sign.O +" Fields numbered <1-9>, 5 being the middle, (0 someday will quit)?");
        fields.addOField(s.nextInt()-1);
        s.close();
        return this;
    }

    @Override
    public String toString() {
        return fields.toString();
    }
}
