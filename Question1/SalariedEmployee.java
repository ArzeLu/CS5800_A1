public class SalariedEmployee extends Employee{
    private float weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, float weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(float weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    public float getWeeklySalary(float weeklySalary){
        return weeklySalary;
    }
}