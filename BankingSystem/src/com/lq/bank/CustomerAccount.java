package com.lq.bank;

import com.lq.bank.exception.MaximumWithdrawalAmountException;
import com.lq.bank.exception.MinimumBalanceException;

public class CustomerAccount implements BankAccount {

	private BankDB db;
	private int accountNumber;

	public CustomerAccount(int accountNumber, BankDB db) {
		this.accountNumber = accountNumber;
		this.db = db;
	}

	@Override
	public int getBalance() {
		return db.getBalance(accountNumber);
	}

	@Override
	public int getAvailBalance() {
		return getBalance() - 2000;
	}

	@Override
	public boolean deposit(int amt) {
		return db.addBalance(accountNumber, amt);
	}

	@Override
	public boolean withdrawal(int amt) throws MinimumBalanceException, MaximumWithdrawalAmountException {
		if (amt <= 50000) {
			int afterWith = getAvailBalance() - amt;
			if (afterWith >= 0) {
				db.reduceBalance(accountNumber, amt);
				return true;
			} else {
				throw new MinimumBalanceException();
			}
		} else {
			throw new MaximumWithdrawalAmountException();
		}
	}

}
