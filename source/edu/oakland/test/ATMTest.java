package edu.oakland.test;

import edu.oakland.production.*;
import junit.framework.*;

/**
*
*
*
*
*/

public class ATMTest extends TestCase{

	/** test method testATMMoneyStorage() asserts that the money retrieved
	*(withdrawn)from the bank account has not been overdrawn
	*/
	
	public void testATMMoneyStorage(){
		assertEquals(withdrawAmountSubmitted, withdrawAmountRetrieved);
	}
}