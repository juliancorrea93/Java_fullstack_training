package com.capgemini.repository;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.AccountNotFoundException;

public interface AccountRepository {
	public boolean saveAccount(Account account);
	public Account fetchAccount(int account_number) throws AccountNotFoundException;
}
