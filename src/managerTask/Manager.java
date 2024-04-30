package managerTask;

public class Manager extends Employe {

    private String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 5000;

    public Manager(int employeeId, String name, int yearStarted, String department, String departmentManaged) {
        super(employeeId, name, yearStarted, department);
        this.departmentManaged = departmentManaged;
    }
    public String getDepartmentManaged() {

        return departmentManaged;
    }

    public void setDepartmentManaged(String departmentManaged) {

        this.departmentManaged = departmentManaged;
    }
    @Override
    public int calculateSalary() {
        return  BASE_SALARY + MANAGEMENT_PAYMENT;
    }
    @Override
    public void work() {
        System.out.println("Manager " + getName() );
    }
}





