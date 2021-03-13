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
	
	@Test
	public void deduct_AmountDue()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		String s;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		s = "Amount Due: " + String.format("%6.2f", 10.0);
		
		assertEquals("deduct 110 from 100", s, card.deduct(110.0));
	}
	
	@Test
	public void deduct_InvalidTransaction()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		String s;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		s = "Invalid Transaction";
		
		assertEquals("deduct -10.00 from 100", s, card.deduct(-10.0));
	}
	
	 
	 @Test
	 public void testException()
	 {
		 assertThrows(IllegalArgumentException.class, () -> {new GiftCard(1,-100.00);});
	 }
	 
	 
	 
	 @Test
	 public void constructor_IncorrectID_Low() 
	 {
			assertThrows(IllegalArgumentException.class, () -> {new GiftCard(-1, 9999);});
	 }

	 @Test
	 public void constructor_IncorrectID_High() 
	 {
		
			assertThrows(IllegalArgumentException.class, () -> {new GiftCard(100000, 100.00);});
	 }
	 
}





