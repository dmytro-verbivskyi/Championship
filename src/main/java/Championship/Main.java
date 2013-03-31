package championship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Challenger> list = new ArrayList<Challenger>();

        list.add(new Challenger("яблоко"));
        list.add(new Challenger("груша"));
        list.add(new Challenger("вишня"));
        list.add(new Challenger("виноград"));
        list.add(new Challenger("черешня"));
        list.add(new Challenger("персик"));
        list.add(new Challenger("абрикос"));

        Tournament t = new Tournament(list);
        t.shuffleMathches();

        System.out.println("==== championship begins ===");
        t.performAllMatches();

        System.out.println("===== matches' results =====");
        t.displayAll();

        System.out.println("========= results ==========");
        t.listCompetitors();
    }
}
