package com.pradeep.springjsonrest.bean;

public class FinanceDetails extends DepartmentDetails {
	private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
