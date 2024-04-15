package managerTask;

public class Director extends  Manager {


    private double bonus;

    public Director(int employeeId, String name, int yearStarted, String department, String departmentManaged, double bonus) {
        super(employeeId, name, yearStarted, department, departmentManaged);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public int calculateSalary() {
        return super.calculateSalary() + (int) bonus;
    }
    @Override
    public void work() {
        System.out.println("Director " + getName() );
    }

}





