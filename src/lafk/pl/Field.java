package lafk.pl;

/**
 * Created by tammo on 18.02.16.
 */
public class Field {
    private final int fieldNumber;
    private Sign sign;
    private boolean taken = false;

    public Field(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public void is(Sign sign) {
        this.sign = sign;
        this.taken = true;
    }
}
