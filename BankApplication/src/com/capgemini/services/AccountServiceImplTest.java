package com.capgemini.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientOpeningBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;

public class AccountServiceImplTest {
	
	AccountService service;

	@Before
	public void setUp() throws Exception {
		service = new AccountServiceImpl();
	}

	@Test
	public void testCreateAccount() throws InsufficientOpeningBalanceException, InvalidAccountNumberException {
		service.createAccount(1111111, 500);
	}
	
	@Test(expected =  InsufficientOpeningBalanceException.class)
	public void testCreateAccountOpeningBalance() throws InsufficientOpeningBalanceException, InvalidAccountNumberException {
		service.createAccount(1111111, 200);
	}
	
	@Test(expected =  InvalidAccountNumberException.class)
	public void testCreateAccountBadAccountNumber() throws InsufficientOpeningBalanceException, InvalidAccountNumberException {
		service.createAccount(1111111, 700);
		service.createAccount(1111111, 700);
	}

	@Test
	public void testDepositAmount() throws InsufficientOpeningBalanceException, InvalidAccountNumberException {
		service.createAccount(1111111, 700);
		service.depositAmount(1111111, 700);
	}
	
	@Test
	public void testDepositAmountBadAccountNum() {
		String s = service.depositAmount(1111111, 700);
		assertTrue(s.equals("No account found with that account number"));
	}

	@Test
	public void testWithdrawAmount() throws InsufficientOpeningBalanceException, InvalidAccountNumberException, InsufficientBalanceException {
		service.createAccount(1111111, 700);
		String s = service.withdrawAmount(1111111, 200);
		
		assertTrue(s.equals("Funds totaling 200.0 were withdrawn from account 1111111 with a new balance of 500.0"));
	}
	
	@Test(expected =  InsufficientBalanceException.class)
	public void testWithdrawAmountInsufficientBalance() throws InsufficientOpeningBalanceException, InvalidAccountNumberException, InsufficientBalanceException {
		service.createAccount(1111111, 700);
		service.withdrawAmount(1111111, 333333333);
	}
	
	public void testWithdrawAmountBadAccountNum() throws InsufficientBalanceException {
		String s = service.withdrawAmount(1111111, 700);
		assertTrue(s.equals("No account found with that account number"));
	}

	@Test
	public void testFundTransfer() throws InsufficientOpeningBalanceException, InvalidAccountNumberException, InsufficientBalanceException {
		//One of the accounts doesn't have a sufficient balance, normal operation, invalid account num
		
		service.createAccount(1111111, 700);
		service.createAccount(1111112, 700);
		String s = service.fundTransfer(1111111, 1111112, 400);
		assertTrue(s.equals("Funds transferred from account number 1111111 to account 1111112"));
	}
	
	@Test(expected =  InsufficientBalanceException.class)
	public void testFundTransferInsufficientBalance() throws InsufficientOpeningBalanceException, InvalidAccountNumberException, InsufficientBalanceException {
		service.createAccount(1111111, 700);
		service.createAccount(1111112, 700);
		service.fundTransfer(1111111, 1111112, 800);
	}
	
	@Test
	public void testFundTransferBadAccountNum() throws InsufficientBalanceException {
		String s = service.fundTransfer(1111,1111,2222);
		assertTrue(s.equals("One of the account numbers entered could not be found..."));
	}

}
