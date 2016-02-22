package lafk.pl;

/**
 * Value Object for field number (as it appears on a board, in UI, to user).
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class FieldNumber {

    private final int number;

    public FieldNumber(int n) {
        this.number = n;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "field number " + number;
    }
}
