package lafk.pl;

/**
 * Created by tammo on 18.02.16.
 */
public class Field {
    private final int fieldNumber;
    private Sign sign;

    public Field(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public void with(Sign sign) {
        this.sign = sign;
    }

    public String toString() {
        return (sign != null) ? sign.toString() : String.valueOf(fieldNumber);
    }

}
