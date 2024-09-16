public class CommissionEmployee extends Employee{
    private float commissionRate;
    private float grossSales;
    
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, float commissionRate, float grossSales){
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

    public float getCommissionRate(){
        return commissionRate;
    }

    public float getGrossSales(){
        return grossSales;
    }
}