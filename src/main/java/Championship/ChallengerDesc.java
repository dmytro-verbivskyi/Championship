package championship;

import java.util.Comparator;

class ChallengerComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Challenger ch1 = (Challenger) o1;
        Challenger ch2 = (Challenger) o2;

        if (ch1.getScore() > ch2.getScore())
            return -1;
        else if (ch1.getScore() == ch2.getScore())
            return 0;
        else
            return 1;
    }
}

