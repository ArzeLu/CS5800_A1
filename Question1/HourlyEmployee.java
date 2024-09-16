public class HourlyEmployee extends Employee{
    private float wage;
    private float hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, float wage, float hoursWorked){
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public void setWage(float wage){
        this.wage = wage;
    }

    public void setHoursWorked(float hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public float getWage(){
        return wage;
    }

    public float getHoursWorked(){
        return hoursWorked;
    }
}