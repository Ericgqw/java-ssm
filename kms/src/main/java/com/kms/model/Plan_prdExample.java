package com.kms.model;

import java.util.ArrayList;
import java.util.List;

public class Plan_prdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Plan_prdExample() {
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

        public Criteria andMachIsNull() {
            addCriterion("MACH is null");
            return (Criteria) this;
        }

        public Criteria andMachIsNotNull() {
            addCriterion("MACH is not null");
            return (Criteria) this;
        }

        public Criteria andMachEqualTo(String value) {
            addCriterion("MACH =", value, "mach");
            return (Criteria) this;
        }

        public Criteria andMachNotEqualTo(String value) {
            addCriterion("MACH <>", value, "mach");
            return (Criteria) this;
        }

        public Criteria andMachGreaterThan(String value) {
            addCriterion("MACH >", value, "mach");
            return (Criteria) this;
        }

        public Criteria andMachGreaterThanOrEqualTo(String value) {
            addCriterion("MACH >=", value, "mach");
            return (Criteria) this;
        }

        public Criteria andMachLessThan(String value) {
            addCriterion("MACH <", value, "mach");
            return (Criteria) this;
        }

        public Criteria andMachLessThanOrEqualTo(String value) {
            addCriterion("MACH <=", value, "mach");
            return (Criteria) this;
        }

        public Criteria andMachLike(String value) {
            addCriterion("MACH like", value, "mach");
            return (Criteria) this;
        }

        public Criteria andMachNotLike(String value) {
            addCriterion("MACH not like", value, "mach");
            return (Criteria) this;
        }

        public Criteria andMachIn(List<String> values) {
            addCriterion("MACH in", values, "mach");
            return (Criteria) this;
        }

        public Criteria andMachNotIn(List<String> values) {
            addCriterion("MACH not in", values, "mach");
            return (Criteria) this;
        }

        public Criteria andMachBetween(String value1, String value2) {
            addCriterion("MACH between", value1, value2, "mach");
            return (Criteria) this;
        }

        public Criteria andMachNotBetween(String value1, String value2) {
            addCriterion("MACH not between", value1, value2, "mach");
            return (Criteria) this;
        }

        public Criteria andItemnoIsNull() {
            addCriterion("ITEMNO is null");
            return (Criteria) this;
        }

        public Criteria andItemnoIsNotNull() {
            addCriterion("ITEMNO is not null");
            return (Criteria) this;
        }

        public Criteria andItemnoEqualTo(String value) {
            addCriterion("ITEMNO =", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotEqualTo(String value) {
            addCriterion("ITEMNO <>", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoGreaterThan(String value) {
            addCriterion("ITEMNO >", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMNO >=", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLessThan(String value) {
            addCriterion("ITEMNO <", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLessThanOrEqualTo(String value) {
            addCriterion("ITEMNO <=", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLike(String value) {
            addCriterion("ITEMNO like", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotLike(String value) {
            addCriterion("ITEMNO not like", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoIn(List<String> values) {
            addCriterion("ITEMNO in", values, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotIn(List<String> values) {
            addCriterion("ITEMNO not in", values, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoBetween(String value1, String value2) {
            addCriterion("ITEMNO between", value1, value2, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotBetween(String value1, String value2) {
            addCriterion("ITEMNO not between", value1, value2, "itemno");
            return (Criteria) this;
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

        public Criteria andQtyokIsNull() {
            addCriterion("qtyOK is null");
            return (Criteria) this;
        }

        public Criteria andQtyokIsNotNull() {
            addCriterion("qtyOK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyokEqualTo(String value) {
            addCriterion("qtyOK =", value, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokNotEqualTo(String value) {
            addCriterion("qtyOK <>", value, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokGreaterThan(String value) {
            addCriterion("qtyOK >", value, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokGreaterThanOrEqualTo(String value) {
            addCriterion("qtyOK >=", value, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokLessThan(String value) {
            addCriterion("qtyOK <", value, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokLessThanOrEqualTo(String value) {
            addCriterion("qtyOK <=", value, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokLike(String value) {
            addCriterion("qtyOK like", value, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokNotLike(String value) {
            addCriterion("qtyOK not like", value, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokIn(List<String> values) {
            addCriterion("qtyOK in", values, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokNotIn(List<String> values) {
            addCriterion("qtyOK not in", values, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokBetween(String value1, String value2) {
            addCriterion("qtyOK between", value1, value2, "qtyok");
            return (Criteria) this;
        }

        public Criteria andQtyokNotBetween(String value1, String value2) {
            addCriterion("qtyOK not between", value1, value2, "qtyok");
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