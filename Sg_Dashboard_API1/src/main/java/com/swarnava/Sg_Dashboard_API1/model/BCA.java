package com.swarnava.Sg_Dashboard_API1.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BCA {
    private int id;
    private String inst_name;
    private Date date;
    private int amount;
    private String status;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInst_name() {
        return inst_name;
    }

    public void setInst_name(String inst_name) {
        this.inst_name = inst_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BCA{" +
                "id=" + id +
                ", inst_name='" + inst_name + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
