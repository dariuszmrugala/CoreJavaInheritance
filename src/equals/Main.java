package equals;

import java.sql.Timestamp;

public class Main {

    public static void main(String[] args) {
        Timestamp timestamp1 = new Timestamp(1);
        Timestamp timestamp2 = new Timestamp(2);

        System.out.println(timestamp2.equals(timestamp1));

    }

}
