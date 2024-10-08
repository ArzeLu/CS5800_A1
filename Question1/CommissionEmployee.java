public class CommissionEmployee extends Employee{
    private double commissionRate;
    private double grossSales;
    
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales){
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public void setCommissionRate(float commissionRate){
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(float commissionRate){
        this.grossSales = grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public double getGrossSales(){
        return grossSales;
    }
}