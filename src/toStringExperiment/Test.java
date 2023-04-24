package toStringExperiment;

import inheritance.Employee;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Integer x = 3;
        System.out.println(x.toString());

        var stuff = new ArrayList<Employee>();
        stuff.ensureCapacity(100);

        stuff.add(new Employee("darek", 100, 2006, 9, 1));

        stuff.trimToSize();

        stuff.add(new Employee("monia", 101, 2007, 1, 1));

        stuff.set(1,new Employee("haha", 2000, 1978, 12, 28));
        System.out.println(stuff);
//        System.out.println(stuff.size());

        Integer integer = 3;
        System.out.println(Integer.toString(3,2));

        System.out.println(Integer.parseInt("101", 2));

        System.out.printf("%d %s", new Object[] {Integer.valueOf(1), "widgets"});
        System.out.printf("%d %s", Integer.valueOf(1), "hejo");
        System.out.println();

        Size s = Enum.valueOf(Size.class, "SMALL");
        System.out.println(s);
        var s1 = Size.SMALL;
        System.out.println(s1);

        System.out.println(Arrays.toString(Size.values()));

    }

}
