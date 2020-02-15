package com.hulk.cashbook.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/6.
 */
public class ConsumeNotes implements Serializable{
    public static String s = "sss";
    private String date;
    private Double amount;
    private Integer consumeTypeId;
    private Integer categoryId;
    private String notes;

    public ConsumeNotes() {

    }

    public ConsumeNotes(String s) {

    }
    public Integer getConsumeTypeId() {

        return consumeTypeId;
    }

    public void setConsumeTypeId(Integer s) {
        this.consumeTypeId = s;
        this.getDate();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }



    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}


