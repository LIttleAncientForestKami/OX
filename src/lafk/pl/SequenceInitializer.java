package lafk.pl;

import java.util.HashMap;
import java.util.Map;

import static lafk.pl.SequenceName.*;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class SequenceInitializer {

    static Map<SequenceName, Sequence> allSequencesMap() {
        Map<SequenceName, Sequence> m = new HashMap<>();
        m.put(UPPER, new Sequence(new FieldNumber(1), 1));
        m.put(MIDDLE, new Sequence(new FieldNumber(4), 1));
        m.put(LOWER, new Sequence(new FieldNumber(7), 1));
        m.put(LEFT, new Sequence(new FieldNumber(1), 3));
        m.put(CENTRAL, new Sequence(new FieldNumber(2), 3));
        m.put(RIGHT, new Sequence(new FieldNumber(3), 3));
        m.put(DESC, new Sequence(new FieldNumber(1), 4));
        m.put(ASC, new Sequence(new FieldNumber(3), 2));
        return m;
    }
}
