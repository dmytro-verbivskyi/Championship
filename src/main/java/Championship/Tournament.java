package championship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tournament {
    private List<Challenger> competitors = new ArrayList<Challenger>();
    private List<Match> tournament = new ArrayList<Match>();
    private static Random randomGenerator = new Random();

    Tournament(List<Challenger> c) {
        competitors = c;

        fillInTournament();
    }

    private void fillInTournament() {
        int size = competitors.size();
        for (int i = 0; i < size; i++) {
            Challenger first = competitors.get(i);

            for (int j = i + 1; j < size; j++) {
                Challenger second = competitors.get(j);

                this.addMatch(first, second);
            }
        }
    }

    private void addMatch(Challenger first, Challenger second) {
        tournament.add(new Match(first, second));
    }

    public void shuffleMathches() {
        Collections.shuffle(tournament);
    }

    public void displayAll() {
        for (Match m : tournament) {
            System.out.println(m.toString());
        }
    }

    public void listCompetitors() {
        Collections.sort(competitors);

        for (Challenger c : competitors) {
            System.out.println(c.getTitle() + ": " + c.getScore());
        }
    }

    public void performAllMatches() {
        for (Match m : tournament) {
            System.out.println(m.presentChallengers());

            int choice = randomGenerator.nextInt(3);
            int f = 0, s = 0;

            if (choice == 0) f = 1;
            else if (choice == 1) s = 1;

            m.setScore(f, s);
        }
    }
}
