import java.util.ArrayList;

public class Wallet {
    private ArrayList<IChargable> cardTypes;
    private IChargable selectedCard;

    public Wallet() {
        cardTypes = new ArrayList<IChargable>();
    }

    public void selectCard(IChargable chosenCard) {
        for (IChargable card : cardTypes) {
            if (card.equals(chosenCard)) {
                selectedCard = card;
                break;
            }
        }
    }

    public IChargable getSelectedCard() {
        return selectedCard;
    }

    public ArrayList<IChargable> getCardTypes() {
        return cardTypes;
    }

    public void makePaymentWithCard(double amount) {
        if (selectedCard != null) {
            if (selectedCard instanceof CreditCard) {
                CreditCard creditCard = (CreditCard) selectedCard;
                double newAvailableCredit = creditCard.reduceAvailableCredit(amount);
                creditCard.setAvailableCredit((int) newAvailableCredit);
            } else if (selectedCard instanceof DebitCard) {
                DebitCard debitCard = (DebitCard) selectedCard;
                double newBalance = debitCard.getBalance() - amount;
                debitCard.setBalance(newBalance);
            }
        }
    }

    public void addCard(IChargable card) {
        cardTypes.add(card);
    }
}



