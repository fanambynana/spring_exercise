package com.spring_exercise.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BalanceHistory implements Serializable {
    private int id;
    private int balanceId;
    private int accountId;
    private LocalDateTime datetime;

    public BalanceHistory() {
    }

    public BalanceHistory(int id, int balanceId, int accountId, LocalDateTime datetime) {
        this.id = id;
        this.balanceId = balanceId;
        this.accountId = accountId;
        this.datetime = datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(int balanceId) {
        this.balanceId = balanceId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "BalanceHistory{" +
                "id=" + id +
                ", balanceId=" + balanceId +
                ", accountId=" + accountId +
                ", datetime=" + datetime +
                '}';
    }
}
