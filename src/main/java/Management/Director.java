package Management;


public class Director extends Management.Manager {

    private double budget;

    public Director(String name, int nationalInsurance, double salary, String deptname,double budget){
        super(name, nationalInsurance, salary, deptname);
        this.budget = budget;
    }

    public double budgetAmount(){
        return this.budget;
    }
}
