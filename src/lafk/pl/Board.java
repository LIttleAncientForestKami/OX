package lafk.pl;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Board {
    private final FieldsList fields;

    public Board(BoardSize boardSize) {
        this.fields = new FieldsList(boardSize);
    }

    public Board placeO() {
        return placeWhereUserPoints(Sign.O);
    }

    private Board placeWhereUserPoints(Sign sign) {
        System.out.println("Place " + sign + "! Fields numbered <1-9>, 5 being the middle, (0 someday will quit)?");
        int chosenFieldNumber = UserInput.askWhichField() - 1;
        switch (sign) {
            case O: fields.addOField(chosenFieldNumber); break;
            case X: fields.addXField(chosenFieldNumber); break;
        }
        return this;
    }

    public Board placeX() {
        return placeWhereUserPoints(Sign.X);
    }

    @Override
    public String toString() {
        return fields.toString();
    }

}
