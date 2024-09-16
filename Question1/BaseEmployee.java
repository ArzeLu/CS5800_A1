public class BaseEmployee extends Employee{
    private float baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, float baseSalary){
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(float baseSalary){
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary(){
        return baseSalary;
    }
}