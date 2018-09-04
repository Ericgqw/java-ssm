package com.kms.model;

import java.util.ArrayList;
import java.util.List;

public class Plan_NGExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Plan_NGExample() {
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

        public Criteria andHhIsNull() {
            addCriterion("HH is null");
            return (Criteria) this;
        }

        public Criteria andHhIsNotNull() {
            addCriterion("HH is not null");
            return (Criteria) this;
        }

        public Criteria andHhEqualTo(String value) {
            addCriterion("HH =", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhNotEqualTo(String value) {
            addCriterion("HH <>", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhGreaterThan(String value) {
            addCriterion("HH >", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhGreaterThanOrEqualTo(String value) {
            addCriterion("HH >=", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhLessThan(String value) {
            addCriterion("HH <", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhLessThanOrEqualTo(String value) {
            addCriterion("HH <=", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhLike(String value) {
            addCriterion("HH like", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhNotLike(String value) {
            addCriterion("HH not like", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhIn(List<String> values) {
            addCriterion("HH in", values, "hh");
            return (Criteria) this;
        }

        public Criteria andHhNotIn(List<String> values) {
            addCriterion("HH not in", values, "hh");
            return (Criteria) this;
        }

        public Criteria andHhBetween(String value1, String value2) {
            addCriterion("HH between", value1, value2, "hh");
            return (Criteria) this;
        }

        public Criteria andHhNotBetween(String value1, String value2) {
            addCriterion("HH not between", value1, value2, "hh");
            return (Criteria) this;
        }

        public Criteria andNgqtyIsNull() {
            addCriterion("NGqty is null");
            return (Criteria) this;
        }

        public Criteria andNgqtyIsNotNull() {
            addCriterion("NGqty is not null");
            return (Criteria) this;
        }

        public Criteria andNgqtyEqualTo(String value) {
            addCriterion("NGqty =", value, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyNotEqualTo(String value) {
            addCriterion("NGqty <>", value, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyGreaterThan(String value) {
            addCriterion("NGqty >", value, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyGreaterThanOrEqualTo(String value) {
            addCriterion("NGqty >=", value, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyLessThan(String value) {
            addCriterion("NGqty <", value, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyLessThanOrEqualTo(String value) {
            addCriterion("NGqty <=", value, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyLike(String value) {
            addCriterion("NGqty like", value, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyNotLike(String value) {
            addCriterion("NGqty not like", value, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyIn(List<String> values) {
            addCriterion("NGqty in", values, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyNotIn(List<String> values) {
            addCriterion("NGqty not in", values, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyBetween(String value1, String value2) {
            addCriterion("NGqty between", value1, value2, "ngqty");
            return (Criteria) this;
        }

        public Criteria andNgqtyNotBetween(String value1, String value2) {
            addCriterion("NGqty not between", value1, value2, "ngqty");
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