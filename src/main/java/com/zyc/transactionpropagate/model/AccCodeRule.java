package com.zyc.transactionpropagate.model;

import java.util.Date;

public class AccCodeRule {
    private Long fId;

    private String fAccountingCode;

    private String fDescription;

    private Integer fSequence;

    private Byte fAccountingDirection;

    private Byte fTransDirection;

    private Byte fRedBlueFlag;

    private String fAccountSignCode;

    private Byte fMemberNoType;

    private String fParticipantRole;

    private Byte fStatus;

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

    public String getfAccountingCode() {
        return fAccountingCode;
    }

    public void setfAccountingCode(String fAccountingCode) {
        this.fAccountingCode = fAccountingCode == null ? null : fAccountingCode.trim();
    }

    public String getfDescription() {
        return fDescription;
    }

    public void setfDescription(String fDescription) {
        this.fDescription = fDescription == null ? null : fDescription.trim();
    }

    public Integer getfSequence() {
        return fSequence;
    }

    public void setfSequence(Integer fSequence) {
        this.fSequence = fSequence;
    }

    public Byte getfAccountingDirection() {
        return fAccountingDirection;
    }

    public void setfAccountingDirection(Byte fAccountingDirection) {
        this.fAccountingDirection = fAccountingDirection;
    }

    public Byte getfTransDirection() {
        return fTransDirection;
    }

    public void setfTransDirection(Byte fTransDirection) {
        this.fTransDirection = fTransDirection;
    }

    public Byte getfRedBlueFlag() {
        return fRedBlueFlag;
    }

    public void setfRedBlueFlag(Byte fRedBlueFlag) {
        this.fRedBlueFlag = fRedBlueFlag;
    }

    public String getfAccountSignCode() {
        return fAccountSignCode;
    }

    public void setfAccountSignCode(String fAccountSignCode) {
        this.fAccountSignCode = fAccountSignCode == null ? null : fAccountSignCode.trim();
    }

    public Byte getfMemberNoType() {
        return fMemberNoType;
    }

    public void setfMemberNoType(Byte fMemberNoType) {
        this.fMemberNoType = fMemberNoType;
    }

    public String getfParticipantRole() {
        return fParticipantRole;
    }

    public void setfParticipantRole(String fParticipantRole) {
        this.fParticipantRole = fParticipantRole == null ? null : fParticipantRole.trim();
    }

    public Byte getfStatus() {
        return fStatus;
    }

    public void setfStatus(Byte fStatus) {
        this.fStatus = fStatus;
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