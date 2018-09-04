package com.kms.model;

import java.util.ArrayList;
import java.util.List;

public class Plan_AutoSumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Plan_AutoSumExample() {
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

        public Criteria andPlanqtyIsNull() {
            addCriterion("PLANqty is null");
            return (Criteria) this;
        }

        public Criteria andPlanqtyIsNotNull() {
            addCriterion("PLANqty is not null");
            return (Criteria) this;
        }

        public Criteria andPlanqtyEqualTo(String value) {
            addCriterion("PLANqty =", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyNotEqualTo(String value) {
            addCriterion("PLANqty <>", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyGreaterThan(String value) {
            addCriterion("PLANqty >", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyGreaterThanOrEqualTo(String value) {
            addCriterion("PLANqty >=", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyLessThan(String value) {
            addCriterion("PLANqty <", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyLessThanOrEqualTo(String value) {
            addCriterion("PLANqty <=", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyLike(String value) {
            addCriterion("PLANqty like", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyNotLike(String value) {
            addCriterion("PLANqty not like", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyIn(List<String> values) {
            addCriterion("PLANqty in", values, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyNotIn(List<String> values) {
            addCriterion("PLANqty not in", values, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyBetween(String value1, String value2) {
            addCriterion("PLANqty between", value1, value2, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyNotBetween(String value1, String value2) {
            addCriterion("PLANqty not between", value1, value2, "planqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyIsNull() {
            addCriterion("TARGETqty is null");
            return (Criteria) this;
        }

        public Criteria andTargetqtyIsNotNull() {
            addCriterion("TARGETqty is not null");
            return (Criteria) this;
        }

        public Criteria andTargetqtyEqualTo(String value) {
            addCriterion("TARGETqty =", value, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyNotEqualTo(String value) {
            addCriterion("TARGETqty <>", value, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyGreaterThan(String value) {
            addCriterion("TARGETqty >", value, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyGreaterThanOrEqualTo(String value) {
            addCriterion("TARGETqty >=", value, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyLessThan(String value) {
            addCriterion("TARGETqty <", value, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyLessThanOrEqualTo(String value) {
            addCriterion("TARGETqty <=", value, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyLike(String value) {
            addCriterion("TARGETqty like", value, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyNotLike(String value) {
            addCriterion("TARGETqty not like", value, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyIn(List<String> values) {
            addCriterion("TARGETqty in", values, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyNotIn(List<String> values) {
            addCriterion("TARGETqty not in", values, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyBetween(String value1, String value2) {
            addCriterion("TARGETqty between", value1, value2, "targetqty");
            return (Criteria) this;
        }

        public Criteria andTargetqtyNotBetween(String value1, String value2) {
            addCriterion("TARGETqty not between", value1, value2, "targetqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyIsNull() {
            addCriterion("MACHqty is null");
            return (Criteria) this;
        }

        public Criteria andMachqtyIsNotNull() {
            addCriterion("MACHqty is not null");
            return (Criteria) this;
        }

        public Criteria andMachqtyEqualTo(String value) {
            addCriterion("MACHqty =", value, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyNotEqualTo(String value) {
            addCriterion("MACHqty <>", value, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyGreaterThan(String value) {
            addCriterion("MACHqty >", value, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyGreaterThanOrEqualTo(String value) {
            addCriterion("MACHqty >=", value, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyLessThan(String value) {
            addCriterion("MACHqty <", value, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyLessThanOrEqualTo(String value) {
            addCriterion("MACHqty <=", value, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyLike(String value) {
            addCriterion("MACHqty like", value, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyNotLike(String value) {
            addCriterion("MACHqty not like", value, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyIn(List<String> values) {
            addCriterion("MACHqty in", values, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyNotIn(List<String> values) {
            addCriterion("MACHqty not in", values, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyBetween(String value1, String value2) {
            addCriterion("MACHqty between", value1, value2, "machqty");
            return (Criteria) this;
        }

        public Criteria andMachqtyNotBetween(String value1, String value2) {
            addCriterion("MACHqty not between", value1, value2, "machqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyIsNull() {
            addCriterion("DONEqty is null");
            return (Criteria) this;
        }

        public Criteria andDoneqtyIsNotNull() {
            addCriterion("DONEqty is not null");
            return (Criteria) this;
        }

        public Criteria andDoneqtyEqualTo(String value) {
            addCriterion("DONEqty =", value, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyNotEqualTo(String value) {
            addCriterion("DONEqty <>", value, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyGreaterThan(String value) {
            addCriterion("DONEqty >", value, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyGreaterThanOrEqualTo(String value) {
            addCriterion("DONEqty >=", value, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyLessThan(String value) {
            addCriterion("DONEqty <", value, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyLessThanOrEqualTo(String value) {
            addCriterion("DONEqty <=", value, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyLike(String value) {
            addCriterion("DONEqty like", value, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyNotLike(String value) {
            addCriterion("DONEqty not like", value, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyIn(List<String> values) {
            addCriterion("DONEqty in", values, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyNotIn(List<String> values) {
            addCriterion("DONEqty not in", values, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyBetween(String value1, String value2) {
            addCriterion("DONEqty between", value1, value2, "doneqty");
            return (Criteria) this;
        }

        public Criteria andDoneqtyNotBetween(String value1, String value2) {
            addCriterion("DONEqty not between", value1, value2, "doneqty");
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

        public Criteria andRemainqtyIsNull() {
            addCriterion("Remainqty is null");
            return (Criteria) this;
        }

        public Criteria andRemainqtyIsNotNull() {
            addCriterion("Remainqty is not null");
            return (Criteria) this;
        }

        public Criteria andRemainqtyEqualTo(String value) {
            addCriterion("Remainqty =", value, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyNotEqualTo(String value) {
            addCriterion("Remainqty <>", value, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyGreaterThan(String value) {
            addCriterion("Remainqty >", value, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyGreaterThanOrEqualTo(String value) {
            addCriterion("Remainqty >=", value, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyLessThan(String value) {
            addCriterion("Remainqty <", value, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyLessThanOrEqualTo(String value) {
            addCriterion("Remainqty <=", value, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyLike(String value) {
            addCriterion("Remainqty like", value, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyNotLike(String value) {
            addCriterion("Remainqty not like", value, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyIn(List<String> values) {
            addCriterion("Remainqty in", values, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyNotIn(List<String> values) {
            addCriterion("Remainqty not in", values, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyBetween(String value1, String value2) {
            addCriterion("Remainqty between", value1, value2, "remainqty");
            return (Criteria) this;
        }

        public Criteria andRemainqtyNotBetween(String value1, String value2) {
            addCriterion("Remainqty not between", value1, value2, "remainqty");
            return (Criteria) this;
        }

        public Criteria andDonerateIsNull() {
            addCriterion("DoneRate is null");
            return (Criteria) this;
        }

        public Criteria andDonerateIsNotNull() {
            addCriterion("DoneRate is not null");
            return (Criteria) this;
        }

        public Criteria andDonerateEqualTo(String value) {
            addCriterion("DoneRate =", value, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateNotEqualTo(String value) {
            addCriterion("DoneRate <>", value, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateGreaterThan(String value) {
            addCriterion("DoneRate >", value, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateGreaterThanOrEqualTo(String value) {
            addCriterion("DoneRate >=", value, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateLessThan(String value) {
            addCriterion("DoneRate <", value, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateLessThanOrEqualTo(String value) {
            addCriterion("DoneRate <=", value, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateLike(String value) {
            addCriterion("DoneRate like", value, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateNotLike(String value) {
            addCriterion("DoneRate not like", value, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateIn(List<String> values) {
            addCriterion("DoneRate in", values, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateNotIn(List<String> values) {
            addCriterion("DoneRate not in", values, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateBetween(String value1, String value2) {
            addCriterion("DoneRate between", value1, value2, "donerate");
            return (Criteria) this;
        }

        public Criteria andDonerateNotBetween(String value1, String value2) {
            addCriterion("DoneRate not between", value1, value2, "donerate");
            return (Criteria) this;
        }

        public Criteria andRemainrateIsNull() {
            addCriterion("RemainRate is null");
            return (Criteria) this;
        }

        public Criteria andRemainrateIsNotNull() {
            addCriterion("RemainRate is not null");
            return (Criteria) this;
        }

        public Criteria andRemainrateEqualTo(String value) {
            addCriterion("RemainRate =", value, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateNotEqualTo(String value) {
            addCriterion("RemainRate <>", value, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateGreaterThan(String value) {
            addCriterion("RemainRate >", value, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateGreaterThanOrEqualTo(String value) {
            addCriterion("RemainRate >=", value, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateLessThan(String value) {
            addCriterion("RemainRate <", value, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateLessThanOrEqualTo(String value) {
            addCriterion("RemainRate <=", value, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateLike(String value) {
            addCriterion("RemainRate like", value, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateNotLike(String value) {
            addCriterion("RemainRate not like", value, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateIn(List<String> values) {
            addCriterion("RemainRate in", values, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateNotIn(List<String> values) {
            addCriterion("RemainRate not in", values, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateBetween(String value1, String value2) {
            addCriterion("RemainRate between", value1, value2, "remainrate");
            return (Criteria) this;
        }

        public Criteria andRemainrateNotBetween(String value1, String value2) {
            addCriterion("RemainRate not between", value1, value2, "remainrate");
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