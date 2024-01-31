package com.spring_exercise.model;

import com.spring_exercise.model.Enum.TransactionType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction implements Serializable {
    private int id;
    private String label;
    private BigDecimal amount;
    private LocalDateTime transactionDate;
    private TransactionType transactionType;
    private int transactionCategoryId;
    private int accountId;

    public Transaction() {
    }

    public Transaction(int id, String label, BigDecimal amount, LocalDateTime transactionDate, TransactionType transactionType, int transactionCategoryId, int accountId) {
        this.id = id;
        this.label = label;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.transactionCategoryId = transactionCategoryId;
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public int getTransactionCategoryId() {
        return transactionCategoryId;
    }

    public void setTransactionCategoryId(int transactionCategoryId) {
        this.transactionCategoryId = transactionCategoryId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", transactionType=" + transactionType +
                ", transactionCategoryId=" + transactionCategoryId +
                ", accountId=" + accountId +
                '}';
    }
}
