package com.kms.model;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andWorkidIsNull() {
            addCriterion("WorkID is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("WorkID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(String value) {
            addCriterion("WorkID =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(String value) {
            addCriterion("WorkID <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(String value) {
            addCriterion("WorkID >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(String value) {
            addCriterion("WorkID >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(String value) {
            addCriterion("WorkID <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(String value) {
            addCriterion("WorkID <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLike(String value) {
            addCriterion("WorkID like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotLike(String value) {
            addCriterion("WorkID not like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<String> values) {
            addCriterion("WorkID in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<String> values) {
            addCriterion("WorkID not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(String value1, String value2) {
            addCriterion("WorkID between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(String value1, String value2) {
            addCriterion("WorkID not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("Department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("Department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("Department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("Department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("Department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("Department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("Department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("Department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("Department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("Department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("Department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("Department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("Department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("Department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andGroupsIsNull() {
            addCriterion("Groups is null");
            return (Criteria) this;
        }

        public Criteria andGroupsIsNotNull() {
            addCriterion("Groups is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsEqualTo(String value) {
            addCriterion("Groups =", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotEqualTo(String value) {
            addCriterion("Groups <>", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsGreaterThan(String value) {
            addCriterion("Groups >", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsGreaterThanOrEqualTo(String value) {
            addCriterion("Groups >=", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLessThan(String value) {
            addCriterion("Groups <", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLessThanOrEqualTo(String value) {
            addCriterion("Groups <=", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLike(String value) {
            addCriterion("Groups like", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotLike(String value) {
            addCriterion("Groups not like", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsIn(List<String> values) {
            addCriterion("Groups in", values, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotIn(List<String> values) {
            addCriterion("Groups not in", values, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsBetween(String value1, String value2) {
            addCriterion("Groups between", value1, value2, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotBetween(String value1, String value2) {
            addCriterion("Groups not between", value1, value2, "groups");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNull() {
            addCriterion("Authority is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNotNull() {
            addCriterion("Authority is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEqualTo(String value) {
            addCriterion("Authority =", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotEqualTo(String value) {
            addCriterion("Authority <>", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThan(String value) {
            addCriterion("Authority >", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("Authority >=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThan(String value) {
            addCriterion("Authority <", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThanOrEqualTo(String value) {
            addCriterion("Authority <=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLike(String value) {
            addCriterion("Authority like", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotLike(String value) {
            addCriterion("Authority not like", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityIn(List<String> values) {
            addCriterion("Authority in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotIn(List<String> values) {
            addCriterion("Authority not in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityBetween(String value1, String value2) {
            addCriterion("Authority between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotBetween(String value1, String value2) {
            addCriterion("Authority not between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andEntryriqIsNull() {
            addCriterion("EntryRIQ is null");
            return (Criteria) this;
        }

        public Criteria andEntryriqIsNotNull() {
            addCriterion("EntryRIQ is not null");
            return (Criteria) this;
        }

        public Criteria andEntryriqEqualTo(String value) {
            addCriterion("EntryRIQ =", value, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqNotEqualTo(String value) {
            addCriterion("EntryRIQ <>", value, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqGreaterThan(String value) {
            addCriterion("EntryRIQ >", value, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqGreaterThanOrEqualTo(String value) {
            addCriterion("EntryRIQ >=", value, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqLessThan(String value) {
            addCriterion("EntryRIQ <", value, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqLessThanOrEqualTo(String value) {
            addCriterion("EntryRIQ <=", value, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqLike(String value) {
            addCriterion("EntryRIQ like", value, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqNotLike(String value) {
            addCriterion("EntryRIQ not like", value, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqIn(List<String> values) {
            addCriterion("EntryRIQ in", values, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqNotIn(List<String> values) {
            addCriterion("EntryRIQ not in", values, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqBetween(String value1, String value2) {
            addCriterion("EntryRIQ between", value1, value2, "entryriq");
            return (Criteria) this;
        }

        public Criteria andEntryriqNotBetween(String value1, String value2) {
            addCriterion("EntryRIQ not between", value1, value2, "entryriq");
            return (Criteria) this;
        }

        public Criteria andDeparturedateIsNull() {
            addCriterion("DepartureDate is null");
            return (Criteria) this;
        }

        public Criteria andDeparturedateIsNotNull() {
            addCriterion("DepartureDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeparturedateEqualTo(String value) {
            addCriterion("DepartureDate =", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateNotEqualTo(String value) {
            addCriterion("DepartureDate <>", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateGreaterThan(String value) {
            addCriterion("DepartureDate >", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateGreaterThanOrEqualTo(String value) {
            addCriterion("DepartureDate >=", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateLessThan(String value) {
            addCriterion("DepartureDate <", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateLessThanOrEqualTo(String value) {
            addCriterion("DepartureDate <=", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateLike(String value) {
            addCriterion("DepartureDate like", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateNotLike(String value) {
            addCriterion("DepartureDate not like", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateIn(List<String> values) {
            addCriterion("DepartureDate in", values, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateNotIn(List<String> values) {
            addCriterion("DepartureDate not in", values, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateBetween(String value1, String value2) {
            addCriterion("DepartureDate between", value1, value2, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateNotBetween(String value1, String value2) {
            addCriterion("DepartureDate not between", value1, value2, "departuredate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("State like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("State not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIpaddrIsNull() {
            addCriterion("IPAddr is null");
            return (Criteria) this;
        }

        public Criteria andIpaddrIsNotNull() {
            addCriterion("IPAddr is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddrEqualTo(String value) {
            addCriterion("IPAddr =", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotEqualTo(String value) {
            addCriterion("IPAddr <>", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThan(String value) {
            addCriterion("IPAddr >", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThanOrEqualTo(String value) {
            addCriterion("IPAddr >=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThan(String value) {
            addCriterion("IPAddr <", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThanOrEqualTo(String value) {
            addCriterion("IPAddr <=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLike(String value) {
            addCriterion("IPAddr like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotLike(String value) {
            addCriterion("IPAddr not like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrIn(List<String> values) {
            addCriterion("IPAddr in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotIn(List<String> values) {
            addCriterion("IPAddr not in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrBetween(String value1, String value2) {
            addCriterion("IPAddr between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotBetween(String value1, String value2) {
            addCriterion("IPAddr not between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIsloginIsNull() {
            addCriterion("isLogin is null");
            return (Criteria) this;
        }

        public Criteria andIsloginIsNotNull() {
            addCriterion("isLogin is not null");
            return (Criteria) this;
        }

        public Criteria andIsloginEqualTo(String value) {
            addCriterion("isLogin =", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginNotEqualTo(String value) {
            addCriterion("isLogin <>", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginGreaterThan(String value) {
            addCriterion("isLogin >", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginGreaterThanOrEqualTo(String value) {
            addCriterion("isLogin >=", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginLessThan(String value) {
            addCriterion("isLogin <", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginLessThanOrEqualTo(String value) {
            addCriterion("isLogin <=", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginLike(String value) {
            addCriterion("isLogin like", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginNotLike(String value) {
            addCriterion("isLogin not like", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginIn(List<String> values) {
            addCriterion("isLogin in", values, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginNotIn(List<String> values) {
            addCriterion("isLogin not in", values, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginBetween(String value1, String value2) {
            addCriterion("isLogin between", value1, value2, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginNotBetween(String value1, String value2) {
            addCriterion("isLogin not between", value1, value2, "islogin");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("Port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("Port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("Port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("Port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("Port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("Port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("Port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("Port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("Port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("Port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("Port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("Port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("Port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("Port not between", value1, value2, "port");
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