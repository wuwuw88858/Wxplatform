package com.wxplatform.pojo;

import java.util.ArrayList;
import java.util.List;

public class PoliticalStatusInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoliticalStatusInfoExample() {
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

        public Criteria andPoliticalstatusidIsNull() {
            addCriterion("politicalstatusid is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidIsNotNull() {
            addCriterion("politicalstatusid is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidEqualTo(Integer value) {
            addCriterion("politicalstatusid =", value, "politicalstatusid");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidNotEqualTo(Integer value) {
            addCriterion("politicalstatusid <>", value, "politicalstatusid");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidGreaterThan(Integer value) {
            addCriterion("politicalstatusid >", value, "politicalstatusid");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("politicalstatusid >=", value, "politicalstatusid");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidLessThan(Integer value) {
            addCriterion("politicalstatusid <", value, "politicalstatusid");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("politicalstatusid <=", value, "politicalstatusid");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidIn(List<Integer> values) {
            addCriterion("politicalstatusid in", values, "politicalstatusid");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidNotIn(List<Integer> values) {
            addCriterion("politicalstatusid not in", values, "politicalstatusid");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidBetween(Integer value1, Integer value2) {
            addCriterion("politicalstatusid between", value1, value2, "politicalstatusid");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("politicalstatusid not between", value1, value2, "politicalstatusid");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameIsNull() {
            addCriterion("politicalstatusname is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameIsNotNull() {
            addCriterion("politicalstatusname is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameEqualTo(String value) {
            addCriterion("politicalstatusname =", value, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameNotEqualTo(String value) {
            addCriterion("politicalstatusname <>", value, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameGreaterThan(String value) {
            addCriterion("politicalstatusname >", value, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("politicalstatusname >=", value, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameLessThan(String value) {
            addCriterion("politicalstatusname <", value, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameLessThanOrEqualTo(String value) {
            addCriterion("politicalstatusname <=", value, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameLike(String value) {
            addCriterion("politicalstatusname like", value, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameNotLike(String value) {
            addCriterion("politicalstatusname not like", value, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameIn(List<String> values) {
            addCriterion("politicalstatusname in", values, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameNotIn(List<String> values) {
            addCriterion("politicalstatusname not in", values, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameBetween(String value1, String value2) {
            addCriterion("politicalstatusname between", value1, value2, "politicalstatusname");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusnameNotBetween(String value1, String value2) {
            addCriterion("politicalstatusname not between", value1, value2, "politicalstatusname");
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