public class DebitCard extends PaymentCard implements IChargable{

    private int accountNumber;
    private String sortCode;
    private double balance;

    public DebitCard (int cardNumber, String expiryDate, int securityNumber, int accountNumber, String sortCode){
     super(cardNumber, expiryDate, securityNumber);
     this.accountNumber = accountNumber;
     this.sortCode = sortCode;
     this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String logTransaction(double amount){
        return ("You have spent " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void makePaymentWithCard(double amount){
        this.balance -= amount;
    }


    @Override
    public double transactionCost(double amount) {
        return 0;
    }



}
