package edu.oakland.production;


/**The ATM.java is used to set the initial withdraw amount as well as retrieving
 * and setting the withdraw amount.
 *@author Austin Copeman
 *@version beta 1.0
 *@since beta 0.5
*/

public class ATM{

	private int withdrawAmount;
        
    /**
     * Constructor
     * Sets the initial withdraw amount to 0 if no initial withdraw amount is
     * requested
     */
    public ATM(){
    	withdrawAmount = 0;
    }
	
	/**
	*Overloaded constructor
	*Initialize the initial withdraw amount
	*Withdraw amount is an integer
    * @param withdraw
	 */
	
	public ATM(int withdraw){	
		withdrawAmount = withdraw;
	}

	
	/**
	*Accessor
	*Retrieve the withdraw amount
    * @return 
	*/
	public int getWithdrawAmount(){
		return withdrawAmount;
	}
	
    /**
    * Mutator
    * Sets the withdraw amount requested from the bank
    * @param amount 
    */
    public void setWithdrawAmount(int amount){
       withdrawAmount = amount;
    }
}