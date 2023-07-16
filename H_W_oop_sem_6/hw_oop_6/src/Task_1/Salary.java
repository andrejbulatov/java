package Task_1;

public class Salary {

    private int baseSalary;
    private final double TAX_RATE = 0.25;

    public Salary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * TAX_RATE);//calculate in otherway
        return baseSalary - tax;
    }

}
