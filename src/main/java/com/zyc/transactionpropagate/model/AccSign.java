package com.zyc.transactionpropagate.model;

import java.util.Date;

public class AccSign {
    private Integer fId;

    private String fAccountSignCode;

    private Byte fAccountCategory;

    private String fAccountSignName;

    private String fDescription;

    private String fCreateBy;

    private Date fCreatedTime;

    private String fModifiedBy;

    private Date fModifiedTime;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfAccountSignCode() {
        return fAccountSignCode;
    }

    public void setfAccountSignCode(String fAccountSignCode) {
        this.fAccountSignCode = fAccountSignCode == null ? null : fAccountSignCode.trim();
    }

    public Byte getfAccountCategory() {
        return fAccountCategory;
    }

    public void setfAccountCategory(Byte fAccountCategory) {
        this.fAccountCategory = fAccountCategory;
    }

    public String getfAccountSignName() {
        return fAccountSignName;
    }

    public void setfAccountSignName(String fAccountSignName) {
        this.fAccountSignName = fAccountSignName == null ? null : fAccountSignName.trim();
    }

    public String getfDescription() {
        return fDescription;
    }

    public void setfDescription(String fDescription) {
        this.fDescription = fDescription == null ? null : fDescription.trim();
    }

    public String getfCreateBy() {
        return fCreateBy;
    }

    public void setfCreateBy(String fCreateBy) {
        this.fCreateBy = fCreateBy == null ? null : fCreateBy.trim();
    }

    public Date getfCreatedTime() {
        return fCreatedTime;
    }

    public void setfCreatedTime(Date fCreatedTime) {
        this.fCreatedTime = fCreatedTime;
    }

    public String getfModifiedBy() {
        return fModifiedBy;
    }

    public void setfModifiedBy(String fModifiedBy) {
        this.fModifiedBy = fModifiedBy == null ? null : fModifiedBy.trim();
    }

    public Date getfModifiedTime() {
        return fModifiedTime;
    }

    public void setfModifiedTime(Date fModifiedTime) {
        this.fModifiedTime = fModifiedTime;
    }
}