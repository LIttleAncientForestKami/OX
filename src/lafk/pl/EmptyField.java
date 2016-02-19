package lafk.pl;

/**
 * Created by tammo on 19.02.16.
 */
public class EmptyField implements Field {

    private int fieldNumber;

    EmptyField(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    @Override
    public String toString() {
        return String.valueOf(fieldNumber);
    }
}
