package edu.oakland.test;

import edu.oakland.production.*;
import edu.oakland.helper.*;
import junit.framework.*;

/**This JUnit test class tests the ability of a production class,
 * ATM.java, to store a withdraw amount submitted by a user, to retrieve the 
 * bank account and ATM withdraw
 *@author Austin Copeman
 *@version beta 1.0
 *@since beta 0.5
 */

public class ATMTest extends TestCase{

	private ATM atm;
    private BankDataBase bank;
    private final int bankBalanceSubmitted = 500; //initial bank balance in $
	private final int withdrawAmountSubmittedOverdrawn = 600; //Amount withdrawn from account in $
    private final int withdrawAmountSubmittedSufficentFunds = 400;

	/** test method testATMMoneyStorage() asserts that the money retrieved
	 *(withdrawn)from the bank account has not been overdrawn
	 */
    @Override
	public void setUp(){
		bank = new BankDataBase(bankBalanceSubmitted);
        int bank2 = bank.getBankBalance();
        atm = new ATM(bank2);	
      
	}
	
    /**
     * The test method testATMMoneyStorageOverdrawn() tests whether or not
     * the bank account has been overdrawn by checking to see if the withdraw
     * amount is greater than or equal to the bank balance.
     * The bank balance is set to $500 and the withdraw amount is set to
     * $600
     */
	public void testATMMoneyStorageOverdrawn(){
		atm.setWithdrawAmount(withdrawAmountSubmittedOverdrawn);
        assertTrue(atm.getWithdrawAmount() >= bank.getBankBalance());
	}
        
    /**
     * The test method testATMMoneyStorageSufficentFunds() tests whether or
     * not the bank account has been overdrawn by checking to see if the 
     * withdraw amount is less than or equal to the bank balance.
     * The bank balance is set to $500 and the withdraw amount is set to 
     * $400
     */
    public void testATMMoneyStorageSufficentFunds(){
    	atm.setWithdrawAmount(withdrawAmountSubmittedSufficentFunds);
        assertTrue(atm.getWithdrawAmount() <= bank.getBankBalance());
    }
}