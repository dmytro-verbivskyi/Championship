package championship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start!");
        List<Challenger> list = new ArrayList<Challenger>();

        list.add(new Challenger("яблоко"));
        list.add(new Challenger("груша"));
        list.add(new Challenger("вишня"));
        list.add(new Challenger("виноград"));
        list.add(new Challenger("черешня"));
        list.add(new Challenger("персик"));
        list.add(new Challenger("абрикос"));

        int size = list.size();
        for (int i = 0; i < size; i++) {
            Challenger first = list.get(i);

            for (int j = i + 1; j < size; j++) {
                Challenger second = list.get(j);

                System.out.println(first.getTitle() + " < vs > " + second.getTitle());
                first.battle(second);
            }
        }
        System.out.println("========== result ==========");
        Collections.sort(list, new ChallengerComparator());

        for (Challenger ch : list) {
            System.out.println(ch);
        }
    }
}
