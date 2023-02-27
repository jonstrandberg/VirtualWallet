import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard1;
    DebitCard debitCard2;

    @Before
    public void setUp(){
        debitCard1 = new DebitCard(1234432432,"09-23", 123,321412,"45-67-90" );
    }

    @Test
    public void canGetCardNumber(){
        assertEquals(1234432432, debitCard1.getCardNumber());
    }
    @Test
    public void canGetExpiryData(){
        assertEquals("09-23", debitCard1.getExpiryDate());
    }
    @Test
    public void canGetSecurityNumber(){
        assertEquals(123, debitCard1.getSecurityNumber());
    }
    @Test
    public void canGetAccountNumber(){
        assertEquals(321412, debitCard1.getAccountNumber());
    }
    @Test
    public void canGetSortCode(){
        assertEquals("45-67-90", debitCard1.getSortCode());
    }

}
