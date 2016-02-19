package lafk.pl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tammo on 19.02.16.
 */
public class FieldsList {

    private final List<Field> fields;
    private final int max;

    public FieldsList(BoardSize boardSize) {
        this.max = boardSize.value();
        this.fields = new ArrayList<Field>(max*max);
        initializeFields();
    }

    private void initializeFields() {
        for (int i = 1; i <= max*max; i++) {
            fields.add(new EmptyField(i));
        }
    }

    public FieldsList addOField(int fieldNumber) {
        fields.set(fieldNumber, new OField());
        return this;
    }

    @Override
    public String toString() {
        return fields.toString();
    }

}
