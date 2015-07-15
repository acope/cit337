package edu.oakland.production;

/**
*
*
*/

public class ATM{

	private int withdrawAmount;
	

	/**
	*Overloaded constructor
	*/
	public ATM(int withdraw){	
		withdrawAmount = withdraw;
	}
	
	/**
	*Getter
	*Retrieved the withdraw amount
	*/
	public int getWithdrawAmount(){
		return withdrawAmount;
	}
}