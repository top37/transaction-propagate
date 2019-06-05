package com.zyc.transactionpropagate.model;

import java.util.Date;

public class AccCode {
    private Integer fId;

    private String fAccountingCode;

    private String fAccountingCodeName;

    private String fDescription;

    private Date fCreatedTime;

    private Date fModifiedTime;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfAccountingCode() {
        return fAccountingCode;
    }

    public void setfAccountingCode(String fAccountingCode) {
        this.fAccountingCode = fAccountingCode == null ? null : fAccountingCode.trim();
    }

    public String getfAccountingCodeName() {
        return fAccountingCodeName;
    }

    public void setfAccountingCodeName(String fAccountingCodeName) {
        this.fAccountingCodeName = fAccountingCodeName == null ? null : fAccountingCodeName.trim();
    }

    public String getfDescription() {
        return fDescription;
    }

    public void setfDescription(String fDescription) {
        this.fDescription = fDescription == null ? null : fDescription.trim();
    }

    public Date getfCreatedTime() {
        return fCreatedTime;
    }

    public void setfCreatedTime(Date fCreatedTime) {
        this.fCreatedTime = fCreatedTime;
    }

    public Date getfModifiedTime() {
        return fModifiedTime;
    }

    public void setfModifiedTime(Date fModifiedTime) {
        this.fModifiedTime = fModifiedTime;
    }
}