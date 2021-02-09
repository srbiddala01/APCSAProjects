package apcs.penny;

public class Square {
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int score;

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    private boolean occupied;

    public Square(int scoreValue){
        score = scoreValue;
        occupied = false;
    }

    public String toString(){
        if (occupied == false){
            return "" + score;
        } else {
            return "P";
        }
    }
}
