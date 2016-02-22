package lafk.pl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static lafk.pl.SequenceName.*;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class SequenceFinder {


    static List<SequenceName> seqsWithField(FieldNumber n) {
        List<SequenceName> ls = new ArrayList<>(4);
// TODO:        if (n.getNumber() < GameSettings.boardSize) ...
        switch(n.getNumber()) {
            case 1:
                ls.add(DESC);
                ls.add(UPPER);
                ls.add(LEFT);
                break;
            case 2:
                ls.add(UPPER);
                ls.add(MIDDLE);
                break;
            case 3:
                ls.add(ASC);
                ls.add(UPPER);
                ls.add(RIGHT);
                break;
            case 4:
                ls.add(MIDDLE);
                ls.add(LEFT);
                break;
            case 5:
                ls.add(MIDDLE);
                ls.add(CENTRAL);
                ls.add(ASC);
                ls.add(DESC);
                break;
            case 6:
                ls.add(MIDDLE);
                ls.add(RIGHT);
                break;
            case 7:
                ls.add(ASC);
                ls.add(LOWER);
                ls.add(LEFT);
                break;
            case 8:
                ls.add(LOWER);
                ls.add(MIDDLE);
                break;
            case 9:
                ls.add(DESC);
                ls.add(LOWER);
                ls.add(RIGHT);
                break;
        }
        return ls;
    }

}
