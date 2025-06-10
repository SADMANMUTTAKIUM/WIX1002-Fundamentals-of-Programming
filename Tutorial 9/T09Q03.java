package com.mycompany.t09q03;
// Base class PaySystem
class PaySystem {
    protected double payRate;
    protected int hours;
    
    public PaySystem(double payRate, int hours) {
        this.payRate = payRate;
        this.hours = hours;
    }
    
    // Method to calculate total pay
    public double getTotalPay() {
        return payRate * hours;
    }
    
    // Method to display payment
    public void displayPayment() {
        System.out.println("Total Payment: $" + getTotalPay());
    }
}

// Regular pay class (no override)
class RegularPay extends PaySystem {
    public RegularPay(double payRate, int hours) {
        super(payRate, hours);
    }
}

// Special pay class (with 30% commission)
class SpecialPay extends PaySystem {
    public SpecialPay(double payRate, int hours) {
        super(payRate, hours);
    }
    
    @Override
    public double getTotalPay() {
        double basePay = super.getTotalPay();
        return basePay + (basePay * 0.30); // Add 30% commission
    }
}

