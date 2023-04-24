package enums;

import java.util.Arrays;
import java.util.Scanner;
import toStringExperiment.Size;

public class EnumTest {

    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Enter the size: " + Arrays.toString(Size.values()));
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size + ", order = " + size.ordinal());
        System.out.println("abbreviation = " + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the _.");
        }
    }



}
