package inheritance;

public class Manager extends Employee{
    public double bonus;

    /**
     *
     * @param name the employee's name
     * @param salary the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    SubClass getStatus() {
        return new SubClass();
    }

    @Override
    public String toString() {
        return super.toString() + " Manager{" +
            "bonus=" + bonus +
            '}';
    }
}
