package com.lq.bank;

import java.util.HashMap;

public class MockDB implements BankDB {

	HashMap<Integer, Integer> accountInfo;

	public MockDB() {
		accountInfo = new HashMap<Integer, Integer>();
		accountInfo.put(187423, 10000);
		accountInfo.put(555555, 19891);
	}

	@Override
	public int getBalance(int acctNumber) {
		return accountInfo.get(acctNumber);
	}

	@Override
	public boolean addBalance(int acctNumber, int data) {
		int before = getBalance(acctNumber);
		int newBalance = before + data;
		accountInfo.put(acctNumber, newBalance);
		return true;
	}

	@Override
	public boolean reduceBalance(int acctNumber, int data) {
		int before = getBalance(acctNumber);
		int newBalance = before - data;
		accountInfo.put(acctNumber, newBalance);
		return true;		
	}

}
