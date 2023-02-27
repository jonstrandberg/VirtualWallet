public class CreditCard extends PaymentCard implements IChargable{

    private int availableCredit;


    public CreditCard(int cardNumber, String expiryDate, int securityNumber, int availableCredit){
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public int getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(int availableCredit) {
        this.availableCredit = availableCredit;
    }

    public double transactionCost(double amount){
        return amount * 0.02;
    }

    public String logTransaction(double amount){
        return ("You have spent " + amount);
    }


    public double reduceAvailableCredit(double amount){
        return this.availableCredit - amount;
    }

    public void makePaymentWithCard(double amount){
        reduceAvailableCredit(amount);
    }

}
