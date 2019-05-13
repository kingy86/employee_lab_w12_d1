package Staff;

public abstract class Employee {

    private String name;
    private int nationalInsurance;
    private double salary;

    public Employee(String name, int nationalInsurance, double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getNationalInsurance(){
        return nationalInsurance;
    }

    public double getSalary(){
        return salary;
    }

    public double raiseSalary(Double increase){
        return salary += increase;
    }

    public double payBonus(){
        salary += (salary / 100);
        return salary;
    }
}