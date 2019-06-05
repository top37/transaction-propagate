package com.zyc.transactionpropagate.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccCodeRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccCodeRuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Long value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Long value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Long value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Long value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Long value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Long value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Long> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Long> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Long value1, Long value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Long value1, Long value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeIsNull() {
            addCriterion("f_accounting_code is null");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeIsNotNull() {
            addCriterion("f_accounting_code is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeEqualTo(String value) {
            addCriterion("f_accounting_code =", value, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNotEqualTo(String value) {
            addCriterion("f_accounting_code <>", value, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeGreaterThan(String value) {
            addCriterion("f_accounting_code >", value, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_accounting_code >=", value, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeLessThan(String value) {
            addCriterion("f_accounting_code <", value, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeLessThanOrEqualTo(String value) {
            addCriterion("f_accounting_code <=", value, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeLike(String value) {
            addCriterion("f_accounting_code like", value, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNotLike(String value) {
            addCriterion("f_accounting_code not like", value, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeIn(List<String> values) {
            addCriterion("f_accounting_code in", values, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNotIn(List<String> values) {
            addCriterion("f_accounting_code not in", values, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeBetween(String value1, String value2) {
            addCriterion("f_accounting_code between", value1, value2, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNotBetween(String value1, String value2) {
            addCriterion("f_accounting_code not between", value1, value2, "fAccountingCode");
            return (Criteria) this;
        }

        public Criteria andFDescriptionIsNull() {
            addCriterion("f_description is null");
            return (Criteria) this;
        }

        public Criteria andFDescriptionIsNotNull() {
            addCriterion("f_description is not null");
            return (Criteria) this;
        }

        public Criteria andFDescriptionEqualTo(String value) {
            addCriterion("f_description =", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotEqualTo(String value) {
            addCriterion("f_description <>", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionGreaterThan(String value) {
            addCriterion("f_description >", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("f_description >=", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionLessThan(String value) {
            addCriterion("f_description <", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionLessThanOrEqualTo(String value) {
            addCriterion("f_description <=", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionLike(String value) {
            addCriterion("f_description like", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotLike(String value) {
            addCriterion("f_description not like", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionIn(List<String> values) {
            addCriterion("f_description in", values, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotIn(List<String> values) {
            addCriterion("f_description not in", values, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionBetween(String value1, String value2) {
            addCriterion("f_description between", value1, value2, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotBetween(String value1, String value2) {
            addCriterion("f_description not between", value1, value2, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFSequenceIsNull() {
            addCriterion("f_sequence is null");
            return (Criteria) this;
        }

        public Criteria andFSequenceIsNotNull() {
            addCriterion("f_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andFSequenceEqualTo(Integer value) {
            addCriterion("f_sequence =", value, "fSequence");
            return (Criteria) this;
        }

        public Criteria andFSequenceNotEqualTo(Integer value) {
            addCriterion("f_sequence <>", value, "fSequence");
            return (Criteria) this;
        }

        public Criteria andFSequenceGreaterThan(Integer value) {
            addCriterion("f_sequence >", value, "fSequence");
            return (Criteria) this;
        }

        public Criteria andFSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_sequence >=", value, "fSequence");
            return (Criteria) this;
        }

        public Criteria andFSequenceLessThan(Integer value) {
            addCriterion("f_sequence <", value, "fSequence");
            return (Criteria) this;
        }

        public Criteria andFSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("f_sequence <=", value, "fSequence");
            return (Criteria) this;
        }

        public Criteria andFSequenceIn(List<Integer> values) {
            addCriterion("f_sequence in", values, "fSequence");
            return (Criteria) this;
        }

        public Criteria andFSequenceNotIn(List<Integer> values) {
            addCriterion("f_sequence not in", values, "fSequence");
            return (Criteria) this;
        }

        public Criteria andFSequenceBetween(Integer value1, Integer value2) {
            addCriterion("f_sequence between", value1, value2, "fSequence");
            return (Criteria) this;
        }

        public Criteria andFSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("f_sequence not between", value1, value2, "fSequence");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionIsNull() {
            addCriterion("f_accounting_direction is null");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionIsNotNull() {
            addCriterion("f_accounting_direction is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionEqualTo(Byte value) {
            addCriterion("f_accounting_direction =", value, "fAccountingDirection");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionNotEqualTo(Byte value) {
            addCriterion("f_accounting_direction <>", value, "fAccountingDirection");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionGreaterThan(Byte value) {
            addCriterion("f_accounting_direction >", value, "fAccountingDirection");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_accounting_direction >=", value, "fAccountingDirection");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionLessThan(Byte value) {
            addCriterion("f_accounting_direction <", value, "fAccountingDirection");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionLessThanOrEqualTo(Byte value) {
            addCriterion("f_accounting_direction <=", value, "fAccountingDirection");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionIn(List<Byte> values) {
            addCriterion("f_accounting_direction in", values, "fAccountingDirection");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionNotIn(List<Byte> values) {
            addCriterion("f_accounting_direction not in", values, "fAccountingDirection");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionBetween(Byte value1, Byte value2) {
            addCriterion("f_accounting_direction between", value1, value2, "fAccountingDirection");
            return (Criteria) this;
        }

        public Criteria andFAccountingDirectionNotBetween(Byte value1, Byte value2) {
            addCriterion("f_accounting_direction not between", value1, value2, "fAccountingDirection");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionIsNull() {
            addCriterion("f_trans_direction is null");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionIsNotNull() {
            addCriterion("f_trans_direction is not null");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionEqualTo(Byte value) {
            addCriterion("f_trans_direction =", value, "fTransDirection");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionNotEqualTo(Byte value) {
            addCriterion("f_trans_direction <>", value, "fTransDirection");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionGreaterThan(Byte value) {
            addCriterion("f_trans_direction >", value, "fTransDirection");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_trans_direction >=", value, "fTransDirection");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionLessThan(Byte value) {
            addCriterion("f_trans_direction <", value, "fTransDirection");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionLessThanOrEqualTo(Byte value) {
            addCriterion("f_trans_direction <=", value, "fTransDirection");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionIn(List<Byte> values) {
            addCriterion("f_trans_direction in", values, "fTransDirection");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionNotIn(List<Byte> values) {
            addCriterion("f_trans_direction not in", values, "fTransDirection");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionBetween(Byte value1, Byte value2) {
            addCriterion("f_trans_direction between", value1, value2, "fTransDirection");
            return (Criteria) this;
        }

        public Criteria andFTransDirectionNotBetween(Byte value1, Byte value2) {
            addCriterion("f_trans_direction not between", value1, value2, "fTransDirection");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagIsNull() {
            addCriterion("f_red_blue_flag is null");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagIsNotNull() {
            addCriterion("f_red_blue_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagEqualTo(Byte value) {
            addCriterion("f_red_blue_flag =", value, "fRedBlueFlag");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagNotEqualTo(Byte value) {
            addCriterion("f_red_blue_flag <>", value, "fRedBlueFlag");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagGreaterThan(Byte value) {
            addCriterion("f_red_blue_flag >", value, "fRedBlueFlag");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_red_blue_flag >=", value, "fRedBlueFlag");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagLessThan(Byte value) {
            addCriterion("f_red_blue_flag <", value, "fRedBlueFlag");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagLessThanOrEqualTo(Byte value) {
            addCriterion("f_red_blue_flag <=", value, "fRedBlueFlag");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagIn(List<Byte> values) {
            addCriterion("f_red_blue_flag in", values, "fRedBlueFlag");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagNotIn(List<Byte> values) {
            addCriterion("f_red_blue_flag not in", values, "fRedBlueFlag");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagBetween(Byte value1, Byte value2) {
            addCriterion("f_red_blue_flag between", value1, value2, "fRedBlueFlag");
            return (Criteria) this;
        }

        public Criteria andFRedBlueFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("f_red_blue_flag not between", value1, value2, "fRedBlueFlag");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeIsNull() {
            addCriterion("f_account_sign_code is null");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeIsNotNull() {
            addCriterion("f_account_sign_code is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeEqualTo(String value) {
            addCriterion("f_account_sign_code =", value, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeNotEqualTo(String value) {
            addCriterion("f_account_sign_code <>", value, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeGreaterThan(String value) {
            addCriterion("f_account_sign_code >", value, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_account_sign_code >=", value, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeLessThan(String value) {
            addCriterion("f_account_sign_code <", value, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeLessThanOrEqualTo(String value) {
            addCriterion("f_account_sign_code <=", value, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeLike(String value) {
            addCriterion("f_account_sign_code like", value, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeNotLike(String value) {
            addCriterion("f_account_sign_code not like", value, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeIn(List<String> values) {
            addCriterion("f_account_sign_code in", values, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeNotIn(List<String> values) {
            addCriterion("f_account_sign_code not in", values, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeBetween(String value1, String value2) {
            addCriterion("f_account_sign_code between", value1, value2, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFAccountSignCodeNotBetween(String value1, String value2) {
            addCriterion("f_account_sign_code not between", value1, value2, "fAccountSignCode");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeIsNull() {
            addCriterion("f_member_no_type is null");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeIsNotNull() {
            addCriterion("f_member_no_type is not null");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeEqualTo(Byte value) {
            addCriterion("f_member_no_type =", value, "fMemberNoType");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeNotEqualTo(Byte value) {
            addCriterion("f_member_no_type <>", value, "fMemberNoType");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeGreaterThan(Byte value) {
            addCriterion("f_member_no_type >", value, "fMemberNoType");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_member_no_type >=", value, "fMemberNoType");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeLessThan(Byte value) {
            addCriterion("f_member_no_type <", value, "fMemberNoType");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeLessThanOrEqualTo(Byte value) {
            addCriterion("f_member_no_type <=", value, "fMemberNoType");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeIn(List<Byte> values) {
            addCriterion("f_member_no_type in", values, "fMemberNoType");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeNotIn(List<Byte> values) {
            addCriterion("f_member_no_type not in", values, "fMemberNoType");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeBetween(Byte value1, Byte value2) {
            addCriterion("f_member_no_type between", value1, value2, "fMemberNoType");
            return (Criteria) this;
        }

        public Criteria andFMemberNoTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("f_member_no_type not between", value1, value2, "fMemberNoType");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleIsNull() {
            addCriterion("f_participant_role is null");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleIsNotNull() {
            addCriterion("f_participant_role is not null");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleEqualTo(String value) {
            addCriterion("f_participant_role =", value, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleNotEqualTo(String value) {
            addCriterion("f_participant_role <>", value, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleGreaterThan(String value) {
            addCriterion("f_participant_role >", value, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleGreaterThanOrEqualTo(String value) {
            addCriterion("f_participant_role >=", value, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleLessThan(String value) {
            addCriterion("f_participant_role <", value, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleLessThanOrEqualTo(String value) {
            addCriterion("f_participant_role <=", value, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleLike(String value) {
            addCriterion("f_participant_role like", value, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleNotLike(String value) {
            addCriterion("f_participant_role not like", value, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleIn(List<String> values) {
            addCriterion("f_participant_role in", values, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleNotIn(List<String> values) {
            addCriterion("f_participant_role not in", values, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleBetween(String value1, String value2) {
            addCriterion("f_participant_role between", value1, value2, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFParticipantRoleNotBetween(String value1, String value2) {
            addCriterion("f_participant_role not between", value1, value2, "fParticipantRole");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNull() {
            addCriterion("f_status is null");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNotNull() {
            addCriterion("f_status is not null");
            return (Criteria) this;
        }

        public Criteria andFStatusEqualTo(Byte value) {
            addCriterion("f_status =", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotEqualTo(Byte value) {
            addCriterion("f_status <>", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThan(Byte value) {
            addCriterion("f_status >", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_status >=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThan(Byte value) {
            addCriterion("f_status <", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThanOrEqualTo(Byte value) {
            addCriterion("f_status <=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusIn(List<Byte> values) {
            addCriterion("f_status in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotIn(List<Byte> values) {
            addCriterion("f_status not in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusBetween(Byte value1, Byte value2) {
            addCriterion("f_status between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("f_status not between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFCreateByIsNull() {
            addCriterion("f_create_by is null");
            return (Criteria) this;
        }

        public Criteria andFCreateByIsNotNull() {
            addCriterion("f_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andFCreateByEqualTo(String value) {
            addCriterion("f_create_by =", value, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByNotEqualTo(String value) {
            addCriterion("f_create_by <>", value, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByGreaterThan(String value) {
            addCriterion("f_create_by >", value, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("f_create_by >=", value, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByLessThan(String value) {
            addCriterion("f_create_by <", value, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByLessThanOrEqualTo(String value) {
            addCriterion("f_create_by <=", value, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByLike(String value) {
            addCriterion("f_create_by like", value, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByNotLike(String value) {
            addCriterion("f_create_by not like", value, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByIn(List<String> values) {
            addCriterion("f_create_by in", values, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByNotIn(List<String> values) {
            addCriterion("f_create_by not in", values, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByBetween(String value1, String value2) {
            addCriterion("f_create_by between", value1, value2, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreateByNotBetween(String value1, String value2) {
            addCriterion("f_create_by not between", value1, value2, "fCreateBy");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeIsNull() {
            addCriterion("f_created_time is null");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeIsNotNull() {
            addCriterion("f_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeEqualTo(Date value) {
            addCriterion("f_created_time =", value, "fCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeNotEqualTo(Date value) {
            addCriterion("f_created_time <>", value, "fCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeGreaterThan(Date value) {
            addCriterion("f_created_time >", value, "fCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_created_time >=", value, "fCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeLessThan(Date value) {
            addCriterion("f_created_time <", value, "fCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("f_created_time <=", value, "fCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeIn(List<Date> values) {
            addCriterion("f_created_time in", values, "fCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeNotIn(List<Date> values) {
            addCriterion("f_created_time not in", values, "fCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("f_created_time between", value1, value2, "fCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("f_created_time not between", value1, value2, "fCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFModifiedByIsNull() {
            addCriterion("f_modified_by is null");
            return (Criteria) this;
        }

        public Criteria andFModifiedByIsNotNull() {
            addCriterion("f_modified_by is not null");
            return (Criteria) this;
        }

        public Criteria andFModifiedByEqualTo(String value) {
            addCriterion("f_modified_by =", value, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByNotEqualTo(String value) {
            addCriterion("f_modified_by <>", value, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByGreaterThan(String value) {
            addCriterion("f_modified_by >", value, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("f_modified_by >=", value, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByLessThan(String value) {
            addCriterion("f_modified_by <", value, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByLessThanOrEqualTo(String value) {
            addCriterion("f_modified_by <=", value, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByLike(String value) {
            addCriterion("f_modified_by like", value, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByNotLike(String value) {
            addCriterion("f_modified_by not like", value, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByIn(List<String> values) {
            addCriterion("f_modified_by in", values, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByNotIn(List<String> values) {
            addCriterion("f_modified_by not in", values, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByBetween(String value1, String value2) {
            addCriterion("f_modified_by between", value1, value2, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedByNotBetween(String value1, String value2) {
            addCriterion("f_modified_by not between", value1, value2, "fModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeIsNull() {
            addCriterion("f_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeIsNotNull() {
            addCriterion("f_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeEqualTo(Date value) {
            addCriterion("f_modified_time =", value, "fModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeNotEqualTo(Date value) {
            addCriterion("f_modified_time <>", value, "fModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeGreaterThan(Date value) {
            addCriterion("f_modified_time >", value, "fModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_modified_time >=", value, "fModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeLessThan(Date value) {
            addCriterion("f_modified_time <", value, "fModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("f_modified_time <=", value, "fModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeIn(List<Date> values) {
            addCriterion("f_modified_time in", values, "fModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeNotIn(List<Date> values) {
            addCriterion("f_modified_time not in", values, "fModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("f_modified_time between", value1, value2, "fModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("f_modified_time not between", value1, value2, "fModifiedTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}