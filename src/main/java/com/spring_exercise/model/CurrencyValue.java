package com.spring_exercise.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CurrencyValue implements Serializable {
    private int id;
    private int exchangeSourceId;
    private int exchangeDestinationId;
    private BigDecimal exchangeValue;
    private LocalDateTime exchangeDatetime;

    public CurrencyValue() {
    }

    public CurrencyValue(int id, int exchangeSourceId, int exchangeDestinationId, BigDecimal exchangeValue, LocalDateTime exchangeDatetime) {
        this.id = id;
        this.exchangeSourceId = exchangeSourceId;
        this.exchangeDestinationId = exchangeDestinationId;
        this.exchangeValue = exchangeValue;
        this.exchangeDatetime = exchangeDatetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExchangeSourceId() {
        return exchangeSourceId;
    }

    public void setExchangeSourceId(int exchangeSourceId) {
        this.exchangeSourceId = exchangeSourceId;
    }

    public int getExchangeDestinationId() {
        return exchangeDestinationId;
    }

    public void setExchangeDestinationId(int exchangeDestinationId) {
        this.exchangeDestinationId = exchangeDestinationId;
    }

    public BigDecimal getExchangeValue() {
        return exchangeValue;
    }

    public void setExchangeValue(BigDecimal exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

    public LocalDateTime getExchangeDatetime() {
        return exchangeDatetime;
    }

    public void setExchangeDatetime(LocalDateTime exchangeDatetime) {
        this.exchangeDatetime = exchangeDatetime;
    }

    @Override
    public String toString() {
        return "CurrencyValue{" +
                "id=" + id +
                ", exchangeSourceId=" + exchangeSourceId +
                ", exchangeDestinationId=" + exchangeDestinationId +
                ", exchangeValue=" + exchangeValue +
                ", exchangeDatetime=" + exchangeDatetime +
                '}';
    }
}
