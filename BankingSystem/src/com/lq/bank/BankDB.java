package com.lq.bank;

interface BankDB {
	
	int getBalance(int acctNumber);
	
	boolean addBalance( int acctNumber,int data );

	boolean reduceBalance( int acctNumber,int data );
		
}
