public class ShoppingList {
    private String item;
    private double price;
    private double tax;
    private String state;
    private int amount;
    private double discount;
    private double priceBeforeTax;


    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public String getItem() {
        return item;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }


    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax=tax;
    }

    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }

    public void taxRateCalculation(String state) {
        if (state.equals("UT")) {
            tax = 6.85;
        } if (state.equals("NV")) {
            tax = 8.0;
        } if (state.equals("TX")) {
            tax = 6.25;
        } if (state.equals("AL")) {
            tax = 4.0;
        } if (state.equals("CA")) {
            tax = 8.25;
        }
        setTax(tax);
    }

    public double total() {
        double total;
        double taxRate = tax/100;
        priceBeforeTax = price*amount;
        checkForDiscount();
        double discountRate = discount/100;
       priceBeforeTax = priceBeforeTax - discountRate*priceBeforeTax;

        total = priceBeforeTax * taxRate + priceBeforeTax;
        return total;
    }

    public void checkForDiscount() {
    if (priceBeforeTax>=1000){
        setDiscount(3);
        } if (priceBeforeTax>=5000) {
        setDiscount(5);
        } if (priceBeforeTax>=7000) {
        setDiscount(7);
        } if (priceBeforeTax>=10000) {
        setDiscount(10);
        } if (priceBeforeTax>=50000) {
        setDiscount(15);
        }
    }
}