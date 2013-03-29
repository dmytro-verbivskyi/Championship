package championship;

import java.util.Comparator;
import java.util.Random;

public class Challenger implements Comparable<Challenger> {
    private String title;
    private int score;

    private static Random randomGenerator = new Random();

    Challenger(String t) {
        title = t;
        score = 0;
    }

    @Override
    public String toString() {
        return score + ":" + title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        setTitle(title);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        setScore(score);
    }

    public void win() {
        score += 2;
    }

    public void draw() {
        score += 1;
    }

    public void battle(Challenger that) {
        int choice = randomGenerator.nextInt(3);

        if (choice == 0) {
            this.win();
        } else if (choice == 1) {
            that.win();
        } else {
            this.draw();
            that.draw();
        }
    }

    public int compareTo(Challenger that) {
        if (this.getScore() < that.getScore())
            return -1;
        else if (this.getScore() == that.getScore())
            return 0;
        else
            return 1;
    }
}