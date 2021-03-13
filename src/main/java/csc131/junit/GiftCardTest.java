package csc131.junit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals; 
import org.junit.rules.ExpectedException; 
import org.junit.Test;

public class GiftCardTest {

	@Test
	public void testGetIssuingStore() {
		double balance;
		GiftCard card;
		int issuingStore;

		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);

		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
		
	}

	@Test
	public void getBalance()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}
	
	@Test
	public void deduct_RemainingBalance()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		String s;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		s = "Remaining Balance: " + String.format("%6.2f", 90.0);
		
		assertEquals("deduct(10.00)", s, card.deduct(10.0));
	}
}




