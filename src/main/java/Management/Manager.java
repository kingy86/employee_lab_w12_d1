package Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptname;

    public Manager(String name, int nationalInsurance, double salary, String deptname){
        super(name, nationalInsurance, salary);
        this.deptname = deptname;
    }

    public String getDeptname(){
        return deptname;
    }
}
