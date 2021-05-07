package com.capgemini.repository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.AccountNotFoundException;

public class AccountRepositoryImplTest {
	
	AccountRepository repo;
	
	@Before
	public void setUp() throws Exception {
		repo = new AccountRepositoryImpl();
	}

	@Test
	public void testSaveAccount() {
		assertTrue(repo.saveAccount(new Account(1111, 5000)));
	}
	
	@Test
	public void testFetchAccount() throws AccountNotFoundException {
		repo.saveAccount(new Account(1111, 5000));
		Account a = repo.fetchAccount(1111);
		assertTrue(a.getAccountNumber() == 1111);
	}
	
	@Test(expected = AccountNotFoundException.class)
	public void testFetchAccountBadAccountNum() throws AccountNotFoundException {
		Account a = repo.fetchAccount(1111);
	}

}
