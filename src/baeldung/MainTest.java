package baeldung;

public class MainTest {

    public static void main(String[] args) {
        Ring ring = new Ring();
        if(ring instanceof Round) {
            System.out.println("hmm");
        }
    }

}
