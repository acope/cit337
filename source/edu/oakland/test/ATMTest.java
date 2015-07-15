package edu.oakland.test;

import edu.oakland.production.*;
import edu.oakland.helper.*;
import junit.framework.*;

/**
*
*
*
*
*/

public class ATMTest extends TestCase{

	private ATM atmInfo;
	private BankDataBase bankInfo;
	private int bankBalanceSubmitted = 500; //initial bank balance in $
	private int bankBalanceRetrieved;
	private int withdrawAmountSubmitted = 400; //Amount withdrawn from account in $
	private int withdrawAmountRetrieved;
	
	/** test method testATMMoneyStorage() asserts that the money retrieved
	*(withdrawn)from the bank account has not been overdrawn
	*/
	public void setUp(){
		atmInfo = new ATM(withdrawAmountSubmitted);
		bankInfo = new BankDataBase(bankBalanceSubmitted);
	}
	
	public void testATMMoneyStorage(){
		int bankBalanceAmountRetrieved = (int)bankInfo.withdrawCalculation();
		assertEquals(withdrawAmountSubmitted, bankBalanceAmountRetrieved);
	}
}