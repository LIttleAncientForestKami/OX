package lafk.pl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Sequence<S extends Sign> {

    private final List<FieldNumber> seqList = new ArrayList<>();
    private S type;
    private int counter;

    public Sequence(FieldNumber start, int step) {
        int begin = start.getNumber();
        seqList.add(start);
        seqList.add(new FieldNumber(begin+step));
        seqList.add(new FieldNumber(begin+2*step));
    }

    public boolean contains(FieldNumber num) {
        return seqList.contains(num);
    }

    public boolean hasCompletOf(S sign) {
        return type == sign && counter == 3;
    }

    public void setTypeIfNotSet(S s) {
        if (type == null) {
            type = s;
        }
    }

    @Override
    public String toString() {
        return "Fields: " + seqList.toString() +
                " type: " + type.toString() +
                " counter: " + counter;
    }
}
