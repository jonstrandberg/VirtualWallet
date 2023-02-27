public class DebitCard extends PaymentCard{

    private int accountNumber;
    private String sortCode;

    public DebitCard (int cardNumber, String expiryDate, int securityNumber, int accountNumber, String sortCode){
     super(cardNumber, expiryDate, securityNumber);
     this.accountNumber = accountNumber;
     this.sortCode = sortCode;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }
}
