package com.spring_exercise.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TransferHistory implements Serializable {
    private int id;
    private int debitTransactionId;
    private int creditTransactionId;
    private LocalDateTime datetime;

    public TransferHistory() {
    }

    public TransferHistory(int id, int debitTransactionId, int creditTransactionId, LocalDateTime datetime) {
        this.id = id;
        this.debitTransactionId = debitTransactionId;
        this.creditTransactionId = creditTransactionId;
        this.datetime = datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDebitTransactionId() {
        return debitTransactionId;
    }

    public void setDebitTransactionId(int debitTransactionId) {
        this.debitTransactionId = debitTransactionId;
    }

    public int getCreditTransactionId() {
        return creditTransactionId;
    }

    public void setCreditTransactionId(int creditTransactionId) {
        this.creditTransactionId = creditTransactionId;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "TransferHistory{" +
                "id=" + id +
                ", debitTransactionId=" + debitTransactionId +
                ", creditTransactionId=" + creditTransactionId +
                ", datetime=" + datetime +
                '}';
    }
}
