package lafk.pl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
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

    public FieldsList addXField(int fieldNumber) {
        fields.set(fieldNumber, new XField());
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < max; i++) {
                if (i == max - 1) {
                    sb.append(fields.get(i+j*max).toString());
                    sb.append(System.lineSeparator());
                }
                else
                    sb.append(fields.get(i+j*max).toString() + " | ");
            }
            if (j == max - 1) {continue;}
            sb.append("--+---+--");
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
