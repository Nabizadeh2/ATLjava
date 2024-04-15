package managerTask;

public class Employe {

    private int employeId;
    private String name;
    private int yearStarted;
    private String department;
    public static final int BASE_SALARY = 500;
    public Employe(int employeeId, String name, int yearStarted, String department) {
        this.employeId = employeId;
        this.name = name;
        this.yearStarted = yearStarted;
        this.department = department;
    }

    public int getEmployeId() {
        return employeId;
    }

    public void setEmployeId(int employeId) {
        this.employeId = employeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJoined() {
        return yearStarted;
    }

    public void setYearJoined(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int calculateSalary() {
        return BASE_SALARY;
    }
    public void work() {
        System.out.println("Employee " + name);
    }

}

