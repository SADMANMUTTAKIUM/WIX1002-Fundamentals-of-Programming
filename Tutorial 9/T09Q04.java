// Base class PurchaseSystem
class PurchaseSystem {
    protected String productCode;
    protected double unitPrice;
    protected int quantity;
    protected double totalPrice;
    
    public PurchaseSystem(String productCode, double unitPrice, int quantity) {
        this.productCode = productCode;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    // Method to compute total price
    public void computeTotalPrice() {
        totalPrice = unitPrice * quantity;
    }
    
    // Display method
    public void display() {
        System.out.println("Product Code: " + productCode);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
    }
}

// Sugar purchase class
class SugarPurchase extends PurchaseSystem {
    private double sugarWeight;
    
    public SugarPurchase(String productCode, double unitPrice, int quantity, double sugarWeight) {
        super(productCode, unitPrice, quantity);
        this.sugarWeight = sugarWeight;
    }
    
    @Override
    public void computeTotalPrice() {
        totalPrice = unitPrice * quantity * sugarWeight;
    }
}

// ========================================
// SIMPLE TESTER CLASS
// ========================================

class TutorialTester {
    public static void main(String[] args) {
        System.out.println("=== Testing Animal ===");
        Animal dog = new Animal(5.0, 1.2, 3.5);
        dog.display();
        
        System.out.println("\n=== Testing Regular Pay ===");
        RegularPay regular = new RegularPay(15.0, 40);
        regular.displayPayment();
        
        System.out.println("\n=== Testing Special Pay ===");
        SpecialPay special = new SpecialPay(15.0, 40);
        special.displayPayment();
        
        System.out.println("\n=== Testing Purchase System ===");
        PurchaseSystem purchase = new PurchaseSystem("P001", 10.0, 5);
        purchase.computeTotalPrice();
        purchase.display();
        
        System.out.println("\n=== Testing Sugar Purchase ===");
        SugarPurchase sugar = new SugarPurchase("S001", 2.0, 10, 1.5);
        sugar.computeTotalPrice();
        sugar.display();
    }
}