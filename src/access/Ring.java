package access;

public class Ring extends Round{
    private int ring;

    public Ring(int r, int ring) {
        super(r);
        this.ring = ring;
    }

    public int getRing() {
        return ring;
    }

    public void setRing(int ring) {
        this.ring = ring;
    }


}
