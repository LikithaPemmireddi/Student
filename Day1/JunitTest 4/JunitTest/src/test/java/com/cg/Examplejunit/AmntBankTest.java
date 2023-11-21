package com.cg.Examplejunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.ExampleJUnit.Amount;
import com.cg.ExampleJUnit.AmntInsufficientFundsException;

public class AmntBankTest {
	Amount ba=new Amount();
	
	@Test
	public void test() throws AmntInsufficientFundsException {
		assertEquals(true,ba.withdraw(9000));
		assertEquals(true,ba.withdraw(100));
		assertEquals(true,ba.withdraw(100000));
		assertEquals(true,ba.withdraw(0));
	}
	
}
