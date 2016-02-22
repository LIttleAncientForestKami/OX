package lafk.pl;

import java.util.List;
import java.util.Map;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Arbiter {

    private final Board board;
    private final Map<SequenceName, Sequence> seqMap;

    Arbiter(Board board) {
        this.board = board;
        this.seqMap = SequenceInitializer.allSequencesMap();
    }

    public boolean didOWinWithField(FieldNumber chosen) {
        final List<SequenceName> fittingSequenceNames = SequenceFinder.seqsWithField(chosen);
        for (SequenceName seqName : fittingSequenceNames) {
            final Sequence sequence = seqMap.get(seqName);
            if(sequence.hasCompletOf(Sign.O)) {
                return true;
            }
            sequence.setTypeIfNotSet(Sign.O);
            System.out.println(sequence);
        }
        return false;
    }
}
