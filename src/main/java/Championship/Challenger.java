package championship;

public class Challenger implements Comparable<Challenger> {
    private String title;
    private int score;

    Challenger(String t) {
        setTitle(t);
        setScore(0);
    }

    @Override
    public String toString() {
        return score + ":" + title;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String t) {
        title = t;
    }


    public int getScore() {
        return score;
    }


    public void setScore(int s) {
        score = s;
    }


    public void win() {
        score += 2;
    }

    public void draw() {
        score += 1;
    }

    public int compareTo(Challenger that) {
        if (this.getScore() > that.getScore())
            return -1;
        else if (this.getScore() == that.getScore())
            return 0;
        else
            return 1;
    }
}