package com.spring_exercise.model;

import com.spring_exercise.model.Enum.AccountName;
import com.spring_exercise.model.Enum.AccountType;

import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private AccountName accountName;
    private int balanceId;
    private int currencyId;
    private AccountType accountType;

    public Account() {
    }

    public Account(int id, AccountName accountName, int balanceId, int currencyId, AccountType accountType) {
        this.id = id;
        this.accountName = accountName;
        this.balanceId = balanceId;
        this.currencyId = currencyId;
        this.accountType = accountType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccountName getAccountName() {
        return accountName;
    }

    public void setAccountName(AccountName accountName) {
        this.accountName = accountName;
    }

    public int getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(int balanceId) {
        this.balanceId = balanceId;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountName=" + accountName +
                ", balanceId=" + balanceId +
                ", currencyId=" + currencyId +
                ", accountType=" + accountType +
                '}';
    }
}