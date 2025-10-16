public class CommissionedEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionedEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) throw new IllegalArgumentException("Gross sales must be greater than 0.0");
        this.grossSales = grossSales;
    }
    public double getGrossSales() {return grossSales;}

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0) throw new IllegalArgumentException("Commission rate must be greater than 0.0");
        if (commissionRate >= 1.0) throw new IllegalArgumentException("Commission rate must be less or equal to 1.0");
        this.commissionRate = commissionRate;
    }
    public double getCommissionRate() {return commissionRate;}

    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return String.format("commissioned employee: %s%n%s: $%,.2f; %s: %.2f",
                super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
    }
}
