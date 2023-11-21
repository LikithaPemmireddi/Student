package com.cg.ExampleJUnit;

public class Amount{
	private int amount=10000;
	public boolean withdraw(int amountToWithdraw) throws AmntInsufficientFundsException {
		if(amountToWithdraw>amount)
		{
			throw new AmntInsufficientFundsException();
		}
		amount-=amountToWithdraw;
		return true;
	}

public static void main() {
}
}