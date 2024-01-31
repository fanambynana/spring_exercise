package com.spring_exercise.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Balance implements Serializable {
    private int id;
    private BigDecimal amount;
    private LocalDateTime updateDatetime;

    public Balance(int id, BigDecimal amount, LocalDateTime updateDatetime) {
        this.id = id;
        this.amount = amount;
        this.updateDatetime = updateDatetime;
    }

    public Balance() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "id=" + id +
                ", amount=" + amount +
                ", updateDatetime=" + updateDatetime +
                '}';
    }
}
