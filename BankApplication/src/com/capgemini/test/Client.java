package com.capgemini.test;

import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientOpeningBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.services.AccountService;
import com.capgemini.services.AccountServiceImpl;

public class Client {

	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		
		try {
			System.out.println(service.createAccount(123131414, 501.00));
			//System.out.println(service.createAccount(123131414, 501.00)); will throw InvalidAccountNumberException
			//System.out.println(service.createAccount(123431414, 499.00)); will throw InsufficientOpeningBalanceException
			System.out.println(service.createAccount(123155514, 504.00));
			System.out.println(service.depositAmount(123131414, 500.00));
			//System.out.println(service.depositAmount(124, 500.00)); //will throw AccountNotFoundException within method, will get caught in method
			System.out.println(service.withdrawAmount(123131414, 12.5));
			//System.out.println(service.withdrawAmount(1, 12.5)); // will throw AccountNotFoundException within method, will get caught in method
			//System.out.println(service.withdrawAmount(123131414, 1250.5)); will throw InsufficientBalanceException
			System.out.println(service.fundTransfer(123131414, 123155514, 300));
			//System.out.println(service.fundTransfer(123131414, 123155514, 30000)); // Will throw InsufficientBalanceException
			//System.out.println(service.fundTransfer(123131414, 1, 300)); // Will throw AccountNotFoundException within method, will get caught in method
		} catch (InsufficientOpeningBalanceException e) {
			System.out.println("Starting balance requirement not met");
		} catch (InvalidAccountNumberException e) {
			System.out.println("Not a unique account number");
		} catch (InsufficientBalanceException e) {
			System.out.println("Insufficient balance in account to withdraw or transfer funds");
		}
		
	}

}
