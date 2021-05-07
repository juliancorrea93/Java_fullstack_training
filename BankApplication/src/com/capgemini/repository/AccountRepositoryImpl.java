package com.capgemini.repository;

import java.util.HashMap;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.AccountNotFoundException;

public class AccountRepositoryImpl implements AccountRepository {
	private HashMap<String, Account> warehouse;
	
	public AccountRepositoryImpl() {
		warehouse = new HashMap<>();
	}

	@Override
	public boolean saveAccount(Account account) {
		try {
			Integer account_num = this.fetchAccount(account.getAccountNumber()).getAccountNumber();
			warehouse.replace(account_num.toString(), account);
			return true;
		}
		catch (AccountNotFoundException e) {
			Integer acct_num = account.getAccountNumber();
			warehouse.put(acct_num.toString(), account);
			return true;
		}
	}

	@Override
	public Account fetchAccount(int account_number) throws AccountNotFoundException {
		Integer acct_num = account_number;
		if (warehouse.containsKey(acct_num.toString())) {
			return warehouse.get(acct_num.toString());
		}
		else {
			throw new AccountNotFoundException();
		}
	}
	
}
