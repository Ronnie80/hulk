package com.hulk.cashbook.model;

import java.util.Date;

import com.vo.ConsumeNotes;

/**
 * Created by Jacky on 2017/9/6.
 */
public class ConsumeInfo extends ConsumeNotes {
    private Long id;
    private Integer userId;
    private Integer monthId;
    private String flag;
    private String category;
    private String consumeType;
    private Date createdTime;
    private Integer isReturn;

    public Integer getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Integer isReturn) {
        this.isReturn = isReturn;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(String consumeType) {
        this.consumeType = consumeType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void toParent(ConsumeNotes consumeNotes) {
        this.setAmount(consumeNotes.getAmount());
        this.setDate(consumeNotes.getDate());
        this.setCategoryId(consumeNotes.getCategoryId());
        this.setNotes(consumeNotes.getNotes());
        this.setConsumeTypeId(consumeNotes.getConsumeTypeId());
    }
}
