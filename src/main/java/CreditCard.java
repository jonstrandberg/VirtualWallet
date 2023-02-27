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

//    public void logTransaction(double amount){
//        System.out.println("You have spent " + amount + transactionCost(amount));
//    }


    public double reduceAvailableCredit(double amount){
        return this.availableCredit - amount;
    }



//    public double logTransactiondweddasdasd(double amount){
//        if (this.availableCredit > amount) {
//            double calculateTransaction = this.availableCredit - amount;
//            return calculateTransaction;
//        }
//    }




//    public double reduceAvailableCredit(){
//        double calculateAvailableCredit = this.availableCredit - this.transactionCost();
//    }



//
//    public String logTransaction(){
//        double transaction = this.transactionCost();
//        String transactionAsAString = Double.toString(transaction);
//        return "Your transaction cost is" + transactionAsAString;
//    }

}
