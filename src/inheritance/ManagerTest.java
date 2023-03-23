package inheritance;

/**
 * This program demonstrates inheritance.
 * @version 0.1 2023-03-01
 * @author Dariusz Mrugała
 */

public class ManagerTest {

    public static void main(String[] args) {
        var boss = new Manager("Carl Crackes", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50_000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40_000, 1990, 3, 15);

        for(Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}
