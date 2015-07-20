package edu.oakland.helper;

/**This BankDataBase.java is used to initialize the starting bank account amount
 * and retrieve and set the bank account amount
 *@author Austin Copeman
 *@version beta 1.0
 *@since beta 0.5
*/

public class BankDataBase{
	
	
	private int customerBalance;	
       
    /**
     * Constructor
     * Sets the bank balance to 0 if no initial desired amount is required
     */
	public BankDataBase(){
            customerBalance = 0;
        }
	
	/**
	 *Overloaded Constructor
     *@param balance
     */
	public BankDataBase(int balance){
            customerBalance = balance;	
	}
	
	/**
	*Acessor
	*Retrieve the amount of money that is in the bank
    *@return customerBalance 
	*/
	public int getBankBalance(){
            return customerBalance;	
	}
	
	/**
	 *Mutator
	 *Sets the amount of money left in the bank
     * @param balance
	 */
	public void setBankBalance(int balance){
            customerBalance = balance;
	}
}