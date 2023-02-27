public class GiftCard {

    private int balance;

    public GiftCard(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public double UseGiftCard(double amount){
        return this.balance - amount;
    }

}
