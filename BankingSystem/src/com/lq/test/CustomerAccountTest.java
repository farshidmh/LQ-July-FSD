package com.lq.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lq.bank.CustomerAccount;
import com.lq.bank.MockDB;
import com.lq.bank.exception.MaximumWithdrawalAmountException;
import com.lq.bank.exception.MinimumBalanceException;

class CustomerAccountTest {

	private MockDB myDb;

	@BeforeEach
	public void startup() {
		myDb = new MockDB();
	}

	@Test
	public void getBalance_187423_balance() {
		CustomerAccount a = new CustomerAccount(187423, myDb);
		assertEquals(a.getBalance(), 10000);
	}

	@Test
	public void getBalance_187423_avail_balance() {
		CustomerAccount a = new CustomerAccount(187423, myDb);
		assertEquals(a.getAvailBalance(), 8000);
	}

	@Test
	public void getBalance_555555_balance() {
		CustomerAccount b = new CustomerAccount(555555, myDb);
		assertEquals(b.getBalance(), 19891);
	}

	@Test
	public void getBalance_555555_avail_balance() {
		CustomerAccount b = new CustomerAccount(555555, myDb);
		assertEquals(b.getAvailBalance(), 17891);
	}

	@Test
	public void deposit_187423() {
		CustomerAccount a = new CustomerAccount(187423, myDb);
		a.deposit(5000);
		assertEquals(a.getAvailBalance(), 13000);
	}

	@Test
	public void deposit_555555() {
		CustomerAccount a = new CustomerAccount(555555, myDb);
		a.deposit(10000);
		assertEquals(a.getAvailBalance(), 27891);
	}

	@Test
	public void with_187423() {
		CustomerAccount a = new CustomerAccount(187423, myDb);
		try {
			a.withdrawal(1000);

		} catch (MinimumBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MaximumWithdrawalAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(a.getAvailBalance(), 7000);

	}

	@Test
	public void with_187423_fail() {
		CustomerAccount a = new CustomerAccount(187423, myDb);

		assertThrows(MinimumBalanceException.class, () -> {
			a.withdrawal(10000);
		}

		);
	}

	@Test
	public void with187423_max() {
		CustomerAccount a = new CustomerAccount(187423, myDb);

		assertThrows(MaximumWithdrawalAmountException.class, () -> {

			a.withdrawal(100000);
			
			
		}

		);

	}

}
