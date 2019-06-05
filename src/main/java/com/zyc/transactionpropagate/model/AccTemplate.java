package com.zyc.transactionpropagate.model;

import java.util.Date;

public class AccTemplate {
    private Long fId;

    private String fTemplateCode;

    private String fDescription;

    private String fCurrency;

    private String fAccountSignCode;

    private String fAccountName;

    private String fAccountingEntryCode;

    private Byte fAccountingDirection;

    private Byte fAccountingSet;

    private Byte fMemberNoType;

    private Byte fBearInterest;

    private Byte fAllowIncome;

    private Byte fAllowOutcome;

    private Byte fAllowOverdraw;

    private Byte fAllowFreeze;

    private Byte fVisible;

    private String fCreateBy;

    private Date fCreatedTime;

    private String fModifiedBy;

    private Date fModifiedTime;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public String getfTemplateCode() {
        return fTemplateCode;
    }

    public void setfTemplateCode(String fTemplateCode) {
        this.fTemplateCode = fTemplateCode == null ? null : fTemplateCode.trim();
    }

    public String getfDescription() {
        return fDescription;
    }

    public void setfDescription(String fDescription) {
        this.fDescription = fDescription == null ? null : fDescription.trim();
    }

    public String getfCurrency() {
        return fCurrency;
    }

    public void setfCurrency(String fCurrency) {
        this.fCurrency = fCurrency == null ? null : fCurrency.trim();
    }

    public String getfAccountSignCode() {
        return fAccountSignCode;
    }

    public void setfAccountSignCode(String fAccountSignCode) {
        this.fAccountSignCode = fAccountSignCode == null ? null : fAccountSignCode.trim();
    }

    public String getfAccountName() {
        return fAccountName;
    }

    public void setfAccountName(String fAccountName) {
        this.fAccountName = fAccountName == null ? null : fAccountName.trim();
    }

    public String getfAccountingEntryCode() {
        return fAccountingEntryCode;
    }

    public void setfAccountingEntryCode(String fAccountingEntryCode) {
        this.fAccountingEntryCode = fAccountingEntryCode == null ? null : fAccountingEntryCode.trim();
    }

    public Byte getfAccountingDirection() {
        return fAccountingDirection;
    }

    public void setfAccountingDirection(Byte fAccountingDirection) {
        this.fAccountingDirection = fAccountingDirection;
    }

    public Byte getfAccountingSet() {
        return fAccountingSet;
    }

    public void setfAccountingSet(Byte fAccountingSet) {
        this.fAccountingSet = fAccountingSet;
    }

    public Byte getfMemberNoType() {
        return fMemberNoType;
    }

    public void setfMemberNoType(Byte fMemberNoType) {
        this.fMemberNoType = fMemberNoType;
    }

    public Byte getfBearInterest() {
        return fBearInterest;
    }

    public void setfBearInterest(Byte fBearInterest) {
        this.fBearInterest = fBearInterest;
    }

    public Byte getfAllowIncome() {
        return fAllowIncome;
    }

    public void setfAllowIncome(Byte fAllowIncome) {
        this.fAllowIncome = fAllowIncome;
    }

    public Byte getfAllowOutcome() {
        return fAllowOutcome;
    }

    public void setfAllowOutcome(Byte fAllowOutcome) {
        this.fAllowOutcome = fAllowOutcome;
    }

    public Byte getfAllowOverdraw() {
        return fAllowOverdraw;
    }

    public void setfAllowOverdraw(Byte fAllowOverdraw) {
        this.fAllowOverdraw = fAllowOverdraw;
    }

    public Byte getfAllowFreeze() {
        return fAllowFreeze;
    }

    public void setfAllowFreeze(Byte fAllowFreeze) {
        this.fAllowFreeze = fAllowFreeze;
    }

    public Byte getfVisible() {
        return fVisible;
    }

    public void setfVisible(Byte fVisible) {
        this.fVisible = fVisible;
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