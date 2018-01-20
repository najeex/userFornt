package com.userFront.domain;

import java.math.BigDecimal;
import java.util.List;

public class Savings {
	private Long id;
	private int accountNumber;
	private BigDecimal accountBalance;
	
	private List<SavingsTransaction> savingsTransactionList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<Savings> getPrimaryTransactionList() {
		return primaryTransactionList;
	}

	public void setPrimaryTransactionList(List<Savings> primaryTransactionList) {
		this.primaryTransactionList = primaryTransactionList;
	}

}
