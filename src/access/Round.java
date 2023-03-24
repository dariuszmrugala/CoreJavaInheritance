package access;

public class Round {
    private int r;

    public Round(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    void increaseRound(){ this.r += 100; }


}
