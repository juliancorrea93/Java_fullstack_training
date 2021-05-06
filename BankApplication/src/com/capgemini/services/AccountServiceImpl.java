package com.capgemini.services;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.AccountNotFoundException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientOpeningBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.repository.AccountRepository;
import com.capgemini.repository.AccountRepositoryImpl;

public class AccountServiceImpl implements AccountService {
	
	public AccountServiceImpl() {
		repo = new AccountRepositoryImpl();
	}

	@Override
	public String createAccount(int account_number, double amount) throws InsufficientOpeningBalanceException, InvalidAccountNumberException {
		Account new_account = new Account();
		try {
			Account account = repo.fetchAccount(account_number);
			throw new InvalidAccountNumberException();
		}
		catch (AccountNotFoundException e) {
			if (amount >= 500.0) {
				new_account.setAccountNumber(account_number);
				new_account.setAmount(amount);
				if (repo.saveAccount(new_account)) {
					return "Account created";
				}
				else {
					return "Account not saved";
				}
			}
			else {
				throw new InsufficientOpeningBalanceException();
			}
		}
	}

	@Override
	public String depositAmount(int account_number, double amount) {
		try {
			Account account = repo.fetchAccount(account_number);
			account.setAmount(account.getAmount() + amount);
			if (repo.saveAccount(account)) {
				return "Funds totaling " + amount + " deposited to account " + account.getAccountNumber() + " with a new balance of " + account.getAmount();
			}
			else {
				return "Account not saved";
			}
			
		}
		catch (AccountNotFoundException e) {
			return "No account found with that account number";
		}
	}

	@Override
	public String withdrawAmount(int account_number, double amount) throws InsufficientBalanceException {
		try {
			Account account = repo.fetchAccount(account_number);
			if (account.getAmount() - amount < 0.0) {
				throw new InsufficientBalanceException();
			}
			account.setAmount(account.getAmount() - amount);
			if (repo.saveAccount(account)) {
				return "Funds totaling " + amount + " were withdrawn from account " + account.getAccountNumber() + " with a new balance of " + account.getAmount();
			}
			else {
				return "Funds not withdrawn from account";
			}
		}
		catch (AccountNotFoundException e) {
			return "No account found with that account number";
		}
	}

	@Override
	public String fundTransfer(int account_from, int account_to, double amount) throws InsufficientBalanceException {
		try {
			Account acct_from = repo.fetchAccount(account_from);
			Account acct_to = repo.fetchAccount(account_to);
			if (acct_from.getAmount() - amount < 0.0) {
				throw new InsufficientBalanceException();
			}
			acct_from.setAmount(acct_from.getAmount() - amount);
			acct_to.setAmount(acct_to.getAmount() + amount);
			
			if (repo.saveAccount(acct_to) && repo.saveAccount(acct_from)) {
				return "Funds transferred from account number " + acct_from.getAccountNumber() + " to account " + acct_to.getAccountNumber();				
			}
			else {
				return "Problem with saving accounts";
			}
		}
		catch (AccountNotFoundException e) {
			return "One of the account numbers entered could not be found...";
		}
	}
	private AccountRepository repo;
}
