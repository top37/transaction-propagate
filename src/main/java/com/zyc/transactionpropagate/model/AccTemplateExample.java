package com.zyc.transactionpropagate.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccTemplateExample() {
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

        public Criteria andFTemplateCodeIsNull() {
            addCriterion("f_template_code is null");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeIsNotNull() {
            addCriterion("f_template_code is not null");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeEqualTo(String value) {
            addCriterion("f_template_code =", value, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeNotEqualTo(String value) {
            addCriterion("f_template_code <>", value, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeGreaterThan(String value) {
            addCriterion("f_template_code >", value, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_template_code >=", value, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeLessThan(String value) {
            addCriterion("f_template_code <", value, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeLessThanOrEqualTo(String value) {
            addCriterion("f_template_code <=", value, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeLike(String value) {
            addCriterion("f_template_code like", value, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeNotLike(String value) {
            addCriterion("f_template_code not like", value, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeIn(List<String> values) {
            addCriterion("f_template_code in", values, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeNotIn(List<String> values) {
            addCriterion("f_template_code not in", values, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeBetween(String value1, String value2) {
            addCriterion("f_template_code between", value1, value2, "fTemplateCode");
            return (Criteria) this;
        }

        public Criteria andFTemplateCodeNotBetween(String value1, String value2) {
            addCriterion("f_template_code not between", value1, value2, "fTemplateCode");
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

        public Criteria andFCurrencyIsNull() {
            addCriterion("f_currency is null");
            return (Criteria) this;
        }

        public Criteria andFCurrencyIsNotNull() {
            addCriterion("f_currency is not null");
            return (Criteria) this;
        }

        public Criteria andFCurrencyEqualTo(String value) {
            addCriterion("f_currency =", value, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyNotEqualTo(String value) {
            addCriterion("f_currency <>", value, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyGreaterThan(String value) {
            addCriterion("f_currency >", value, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("f_currency >=", value, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyLessThan(String value) {
            addCriterion("f_currency <", value, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyLessThanOrEqualTo(String value) {
            addCriterion("f_currency <=", value, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyLike(String value) {
            addCriterion("f_currency like", value, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyNotLike(String value) {
            addCriterion("f_currency not like", value, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyIn(List<String> values) {
            addCriterion("f_currency in", values, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyNotIn(List<String> values) {
            addCriterion("f_currency not in", values, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyBetween(String value1, String value2) {
            addCriterion("f_currency between", value1, value2, "fCurrency");
            return (Criteria) this;
        }

        public Criteria andFCurrencyNotBetween(String value1, String value2) {
            addCriterion("f_currency not between", value1, value2, "fCurrency");
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

        public Criteria andFAccountNameIsNull() {
            addCriterion("f_account_name is null");
            return (Criteria) this;
        }

        public Criteria andFAccountNameIsNotNull() {
            addCriterion("f_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountNameEqualTo(String value) {
            addCriterion("f_account_name =", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameNotEqualTo(String value) {
            addCriterion("f_account_name <>", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameGreaterThan(String value) {
            addCriterion("f_account_name >", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_account_name >=", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameLessThan(String value) {
            addCriterion("f_account_name <", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameLessThanOrEqualTo(String value) {
            addCriterion("f_account_name <=", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameLike(String value) {
            addCriterion("f_account_name like", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameNotLike(String value) {
            addCriterion("f_account_name not like", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameIn(List<String> values) {
            addCriterion("f_account_name in", values, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameNotIn(List<String> values) {
            addCriterion("f_account_name not in", values, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameBetween(String value1, String value2) {
            addCriterion("f_account_name between", value1, value2, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameNotBetween(String value1, String value2) {
            addCriterion("f_account_name not between", value1, value2, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeIsNull() {
            addCriterion("f_accounting_entry_code is null");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeIsNotNull() {
            addCriterion("f_accounting_entry_code is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeEqualTo(String value) {
            addCriterion("f_accounting_entry_code =", value, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeNotEqualTo(String value) {
            addCriterion("f_accounting_entry_code <>", value, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeGreaterThan(String value) {
            addCriterion("f_accounting_entry_code >", value, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_accounting_entry_code >=", value, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeLessThan(String value) {
            addCriterion("f_accounting_entry_code <", value, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeLessThanOrEqualTo(String value) {
            addCriterion("f_accounting_entry_code <=", value, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeLike(String value) {
            addCriterion("f_accounting_entry_code like", value, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeNotLike(String value) {
            addCriterion("f_accounting_entry_code not like", value, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeIn(List<String> values) {
            addCriterion("f_accounting_entry_code in", values, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeNotIn(List<String> values) {
            addCriterion("f_accounting_entry_code not in", values, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeBetween(String value1, String value2) {
            addCriterion("f_accounting_entry_code between", value1, value2, "fAccountingEntryCode");
            return (Criteria) this;
        }

        public Criteria andFAccountingEntryCodeNotBetween(String value1, String value2) {
            addCriterion("f_accounting_entry_code not between", value1, value2, "fAccountingEntryCode");
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

        public Criteria andFAccountingSetIsNull() {
            addCriterion("f_accounting_set is null");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetIsNotNull() {
            addCriterion("f_accounting_set is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetEqualTo(Byte value) {
            addCriterion("f_accounting_set =", value, "fAccountingSet");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetNotEqualTo(Byte value) {
            addCriterion("f_accounting_set <>", value, "fAccountingSet");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetGreaterThan(Byte value) {
            addCriterion("f_accounting_set >", value, "fAccountingSet");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_accounting_set >=", value, "fAccountingSet");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetLessThan(Byte value) {
            addCriterion("f_accounting_set <", value, "fAccountingSet");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetLessThanOrEqualTo(Byte value) {
            addCriterion("f_accounting_set <=", value, "fAccountingSet");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetIn(List<Byte> values) {
            addCriterion("f_accounting_set in", values, "fAccountingSet");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetNotIn(List<Byte> values) {
            addCriterion("f_accounting_set not in", values, "fAccountingSet");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetBetween(Byte value1, Byte value2) {
            addCriterion("f_accounting_set between", value1, value2, "fAccountingSet");
            return (Criteria) this;
        }

        public Criteria andFAccountingSetNotBetween(Byte value1, Byte value2) {
            addCriterion("f_accounting_set not between", value1, value2, "fAccountingSet");
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

        public Criteria andFBearInterestIsNull() {
            addCriterion("f_bear_interest is null");
            return (Criteria) this;
        }

        public Criteria andFBearInterestIsNotNull() {
            addCriterion("f_bear_interest is not null");
            return (Criteria) this;
        }

        public Criteria andFBearInterestEqualTo(Byte value) {
            addCriterion("f_bear_interest =", value, "fBearInterest");
            return (Criteria) this;
        }

        public Criteria andFBearInterestNotEqualTo(Byte value) {
            addCriterion("f_bear_interest <>", value, "fBearInterest");
            return (Criteria) this;
        }

        public Criteria andFBearInterestGreaterThan(Byte value) {
            addCriterion("f_bear_interest >", value, "fBearInterest");
            return (Criteria) this;
        }

        public Criteria andFBearInterestGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_bear_interest >=", value, "fBearInterest");
            return (Criteria) this;
        }

        public Criteria andFBearInterestLessThan(Byte value) {
            addCriterion("f_bear_interest <", value, "fBearInterest");
            return (Criteria) this;
        }

        public Criteria andFBearInterestLessThanOrEqualTo(Byte value) {
            addCriterion("f_bear_interest <=", value, "fBearInterest");
            return (Criteria) this;
        }

        public Criteria andFBearInterestIn(List<Byte> values) {
            addCriterion("f_bear_interest in", values, "fBearInterest");
            return (Criteria) this;
        }

        public Criteria andFBearInterestNotIn(List<Byte> values) {
            addCriterion("f_bear_interest not in", values, "fBearInterest");
            return (Criteria) this;
        }

        public Criteria andFBearInterestBetween(Byte value1, Byte value2) {
            addCriterion("f_bear_interest between", value1, value2, "fBearInterest");
            return (Criteria) this;
        }

        public Criteria andFBearInterestNotBetween(Byte value1, Byte value2) {
            addCriterion("f_bear_interest not between", value1, value2, "fBearInterest");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeIsNull() {
            addCriterion("f_allow_income is null");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeIsNotNull() {
            addCriterion("f_allow_income is not null");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeEqualTo(Byte value) {
            addCriterion("f_allow_income =", value, "fAllowIncome");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeNotEqualTo(Byte value) {
            addCriterion("f_allow_income <>", value, "fAllowIncome");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeGreaterThan(Byte value) {
            addCriterion("f_allow_income >", value, "fAllowIncome");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_allow_income >=", value, "fAllowIncome");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeLessThan(Byte value) {
            addCriterion("f_allow_income <", value, "fAllowIncome");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeLessThanOrEqualTo(Byte value) {
            addCriterion("f_allow_income <=", value, "fAllowIncome");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeIn(List<Byte> values) {
            addCriterion("f_allow_income in", values, "fAllowIncome");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeNotIn(List<Byte> values) {
            addCriterion("f_allow_income not in", values, "fAllowIncome");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeBetween(Byte value1, Byte value2) {
            addCriterion("f_allow_income between", value1, value2, "fAllowIncome");
            return (Criteria) this;
        }

        public Criteria andFAllowIncomeNotBetween(Byte value1, Byte value2) {
            addCriterion("f_allow_income not between", value1, value2, "fAllowIncome");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeIsNull() {
            addCriterion("f_allow_outcome is null");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeIsNotNull() {
            addCriterion("f_allow_outcome is not null");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeEqualTo(Byte value) {
            addCriterion("f_allow_outcome =", value, "fAllowOutcome");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeNotEqualTo(Byte value) {
            addCriterion("f_allow_outcome <>", value, "fAllowOutcome");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeGreaterThan(Byte value) {
            addCriterion("f_allow_outcome >", value, "fAllowOutcome");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_allow_outcome >=", value, "fAllowOutcome");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeLessThan(Byte value) {
            addCriterion("f_allow_outcome <", value, "fAllowOutcome");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeLessThanOrEqualTo(Byte value) {
            addCriterion("f_allow_outcome <=", value, "fAllowOutcome");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeIn(List<Byte> values) {
            addCriterion("f_allow_outcome in", values, "fAllowOutcome");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeNotIn(List<Byte> values) {
            addCriterion("f_allow_outcome not in", values, "fAllowOutcome");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeBetween(Byte value1, Byte value2) {
            addCriterion("f_allow_outcome between", value1, value2, "fAllowOutcome");
            return (Criteria) this;
        }

        public Criteria andFAllowOutcomeNotBetween(Byte value1, Byte value2) {
            addCriterion("f_allow_outcome not between", value1, value2, "fAllowOutcome");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawIsNull() {
            addCriterion("f_allow_overdraw is null");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawIsNotNull() {
            addCriterion("f_allow_overdraw is not null");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawEqualTo(Byte value) {
            addCriterion("f_allow_overdraw =", value, "fAllowOverdraw");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawNotEqualTo(Byte value) {
            addCriterion("f_allow_overdraw <>", value, "fAllowOverdraw");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawGreaterThan(Byte value) {
            addCriterion("f_allow_overdraw >", value, "fAllowOverdraw");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_allow_overdraw >=", value, "fAllowOverdraw");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawLessThan(Byte value) {
            addCriterion("f_allow_overdraw <", value, "fAllowOverdraw");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawLessThanOrEqualTo(Byte value) {
            addCriterion("f_allow_overdraw <=", value, "fAllowOverdraw");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawIn(List<Byte> values) {
            addCriterion("f_allow_overdraw in", values, "fAllowOverdraw");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawNotIn(List<Byte> values) {
            addCriterion("f_allow_overdraw not in", values, "fAllowOverdraw");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawBetween(Byte value1, Byte value2) {
            addCriterion("f_allow_overdraw between", value1, value2, "fAllowOverdraw");
            return (Criteria) this;
        }

        public Criteria andFAllowOverdrawNotBetween(Byte value1, Byte value2) {
            addCriterion("f_allow_overdraw not between", value1, value2, "fAllowOverdraw");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeIsNull() {
            addCriterion("f_allow_freeze is null");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeIsNotNull() {
            addCriterion("f_allow_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeEqualTo(Byte value) {
            addCriterion("f_allow_freeze =", value, "fAllowFreeze");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeNotEqualTo(Byte value) {
            addCriterion("f_allow_freeze <>", value, "fAllowFreeze");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeGreaterThan(Byte value) {
            addCriterion("f_allow_freeze >", value, "fAllowFreeze");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_allow_freeze >=", value, "fAllowFreeze");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeLessThan(Byte value) {
            addCriterion("f_allow_freeze <", value, "fAllowFreeze");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeLessThanOrEqualTo(Byte value) {
            addCriterion("f_allow_freeze <=", value, "fAllowFreeze");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeIn(List<Byte> values) {
            addCriterion("f_allow_freeze in", values, "fAllowFreeze");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeNotIn(List<Byte> values) {
            addCriterion("f_allow_freeze not in", values, "fAllowFreeze");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeBetween(Byte value1, Byte value2) {
            addCriterion("f_allow_freeze between", value1, value2, "fAllowFreeze");
            return (Criteria) this;
        }

        public Criteria andFAllowFreezeNotBetween(Byte value1, Byte value2) {
            addCriterion("f_allow_freeze not between", value1, value2, "fAllowFreeze");
            return (Criteria) this;
        }

        public Criteria andFVisibleIsNull() {
            addCriterion("f_visible is null");
            return (Criteria) this;
        }

        public Criteria andFVisibleIsNotNull() {
            addCriterion("f_visible is not null");
            return (Criteria) this;
        }

        public Criteria andFVisibleEqualTo(Byte value) {
            addCriterion("f_visible =", value, "fVisible");
            return (Criteria) this;
        }

        public Criteria andFVisibleNotEqualTo(Byte value) {
            addCriterion("f_visible <>", value, "fVisible");
            return (Criteria) this;
        }

        public Criteria andFVisibleGreaterThan(Byte value) {
            addCriterion("f_visible >", value, "fVisible");
            return (Criteria) this;
        }

        public Criteria andFVisibleGreaterThanOrEqualTo(Byte value) {
            addCriterion("f_visible >=", value, "fVisible");
            return (Criteria) this;
        }

        public Criteria andFVisibleLessThan(Byte value) {
            addCriterion("f_visible <", value, "fVisible");
            return (Criteria) this;
        }

        public Criteria andFVisibleLessThanOrEqualTo(Byte value) {
            addCriterion("f_visible <=", value, "fVisible");
            return (Criteria) this;
        }

        public Criteria andFVisibleIn(List<Byte> values) {
            addCriterion("f_visible in", values, "fVisible");
            return (Criteria) this;
        }

        public Criteria andFVisibleNotIn(List<Byte> values) {
            addCriterion("f_visible not in", values, "fVisible");
            return (Criteria) this;
        }

        public Criteria andFVisibleBetween(Byte value1, Byte value2) {
            addCriterion("f_visible between", value1, value2, "fVisible");
            return (Criteria) this;
        }

        public Criteria andFVisibleNotBetween(Byte value1, Byte value2) {
            addCriterion("f_visible not between", value1, value2, "fVisible");
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