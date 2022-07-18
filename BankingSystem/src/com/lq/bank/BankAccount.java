package com.lq.bank;

import com.lq.bank.exception.MaximumWithdrawalAmountException;
import com.lq.bank.exception.MinimumBalanceException;

interface BankAccount {	
	int getBalance();	
	int getAvailBalance();	
	boolean deposit(int amt);	
	boolean withdrawal(int amt) throws MinimumBalanceException, MaximumWithdrawalAmountException;
}
