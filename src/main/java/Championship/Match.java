package championship;


public class Match {
    private Challenger first;
    private Challenger second;
    private int firstPoints;
    private int secondPoints;

    public Match(Challenger first, Challenger second) {
        this.first = first;
        this.second = second;
    }

    private void setFirstWon() {
        first.win();
    }

    private void setSecondWon() {
        second.win();
    }

    private void setDraw() {
        first.draw();
        second.draw();
    }

    public void setScore(int first, int second) {
        this.firstPoints = first;
        this.secondPoints = second;

        if (firstPoints > secondPoints) setFirstWon();
        else if (firstPoints < secondPoints) setSecondWon();
        else setDraw();
    }

    @Override
    public String toString() {
        return first.getTitle() + " [" + firstPoints + ":" + secondPoints + "] " + second.getTitle();
    }

    public String presentChallengers() {
        return first.getTitle() + " vs " + second.getTitle();
    }
}
