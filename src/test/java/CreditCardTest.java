import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard1;


    @Before
    public void setUp(){
        creditCard1 = new CreditCard(89045645, "04-23",446,5000);
    }


    @Test
    public void canGetCardNumber(){
        assertEquals(89045645,creditCard1.getCardNumber());
    }
    @Test
    public void canGetExpiryData(){
        assertEquals("04-23", creditCard1.getExpiryDate());
    }
    @Test
    public void canGetSecurityNumber(){
        assertEquals(446, creditCard1.getSecurityNumber());
    }
    @Test
    public void canGetAvailableCredit(){
        assertEquals(5000, creditCard1.getAvailableCredit());
    }
    @Test
    public void canSetAvailableCredit(){
        creditCard1.setAvailableCredit(6000);
        assertEquals(6000, creditCard1.getAvailableCredit());
    }
    @Test
    public void canGetTransactionCost(){
        assertEquals(0.4, creditCard1.transactionCost(20),0.01);
    }

    @Test
    public void canLogTransaction(){
        assertEquals("You have spent 20.0", creditCard1.logTransaction(20.0));
    }

    @Test
    public void canReduceAvailableCredit(){
        assertEquals(4980.0, creditCard1.reduceAvailableCredit(20), 0.01);
    }





}
