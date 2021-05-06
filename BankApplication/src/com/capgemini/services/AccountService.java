package com.capgemini.services;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.AccountNotFoundException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientOpeningBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;

public interface AccountService {
	public String createAccount(int account_number, double amount) throws InsufficientOpeningBalanceException, InvalidAccountNumberException;
	public String depositAmount(int account_number, double amount);
	public String withdrawAmount (int account_number, double amount) throws InsufficientBalanceException;
	public String fundTransfer(int account_from, int account_to, double amount) throws InsufficientBalanceException;
}
