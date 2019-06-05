package com.zyc.transactionpropagate.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccCodeExample() {
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

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andFAccountingCodeNameIsNull() {
            addCriterion("f_accounting_code_name is null");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameIsNotNull() {
            addCriterion("f_accounting_code_name is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameEqualTo(String value) {
            addCriterion("f_accounting_code_name =", value, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameNotEqualTo(String value) {
            addCriterion("f_accounting_code_name <>", value, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameGreaterThan(String value) {
            addCriterion("f_accounting_code_name >", value, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_accounting_code_name >=", value, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameLessThan(String value) {
            addCriterion("f_accounting_code_name <", value, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameLessThanOrEqualTo(String value) {
            addCriterion("f_accounting_code_name <=", value, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameLike(String value) {
            addCriterion("f_accounting_code_name like", value, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameNotLike(String value) {
            addCriterion("f_accounting_code_name not like", value, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameIn(List<String> values) {
            addCriterion("f_accounting_code_name in", values, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameNotIn(List<String> values) {
            addCriterion("f_accounting_code_name not in", values, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameBetween(String value1, String value2) {
            addCriterion("f_accounting_code_name between", value1, value2, "fAccountingCodeName");
            return (Criteria) this;
        }

        public Criteria andFAccountingCodeNameNotBetween(String value1, String value2) {
            addCriterion("f_accounting_code_name not between", value1, value2, "fAccountingCodeName");
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