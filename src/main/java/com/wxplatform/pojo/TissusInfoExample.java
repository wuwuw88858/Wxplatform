package com.wxplatform.pojo;

import java.util.ArrayList;
import java.util.List;

public class TissusInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TissusInfoExample() {
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

        public Criteria andTissusidIsNull() {
            addCriterion("tissusid is null");
            return (Criteria) this;
        }

        public Criteria andTissusidIsNotNull() {
            addCriterion("tissusid is not null");
            return (Criteria) this;
        }

        public Criteria andTissusidEqualTo(Integer value) {
            addCriterion("tissusid =", value, "tissusid");
            return (Criteria) this;
        }

        public Criteria andTissusidNotEqualTo(Integer value) {
            addCriterion("tissusid <>", value, "tissusid");
            return (Criteria) this;
        }

        public Criteria andTissusidGreaterThan(Integer value) {
            addCriterion("tissusid >", value, "tissusid");
            return (Criteria) this;
        }

        public Criteria andTissusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tissusid >=", value, "tissusid");
            return (Criteria) this;
        }

        public Criteria andTissusidLessThan(Integer value) {
            addCriterion("tissusid <", value, "tissusid");
            return (Criteria) this;
        }

        public Criteria andTissusidLessThanOrEqualTo(Integer value) {
            addCriterion("tissusid <=", value, "tissusid");
            return (Criteria) this;
        }

        public Criteria andTissusidIn(List<Integer> values) {
            addCriterion("tissusid in", values, "tissusid");
            return (Criteria) this;
        }

        public Criteria andTissusidNotIn(List<Integer> values) {
            addCriterion("tissusid not in", values, "tissusid");
            return (Criteria) this;
        }

        public Criteria andTissusidBetween(Integer value1, Integer value2) {
            addCriterion("tissusid between", value1, value2, "tissusid");
            return (Criteria) this;
        }

        public Criteria andTissusidNotBetween(Integer value1, Integer value2) {
            addCriterion("tissusid not between", value1, value2, "tissusid");
            return (Criteria) this;
        }

        public Criteria andTissusnameIsNull() {
            addCriterion("tissusname is null");
            return (Criteria) this;
        }

        public Criteria andTissusnameIsNotNull() {
            addCriterion("tissusname is not null");
            return (Criteria) this;
        }

        public Criteria andTissusnameEqualTo(String value) {
            addCriterion("tissusname =", value, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameNotEqualTo(String value) {
            addCriterion("tissusname <>", value, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameGreaterThan(String value) {
            addCriterion("tissusname >", value, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameGreaterThanOrEqualTo(String value) {
            addCriterion("tissusname >=", value, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameLessThan(String value) {
            addCriterion("tissusname <", value, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameLessThanOrEqualTo(String value) {
            addCriterion("tissusname <=", value, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameLike(String value) {
            addCriterion("tissusname like", value, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameNotLike(String value) {
            addCriterion("tissusname not like", value, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameIn(List<String> values) {
            addCriterion("tissusname in", values, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameNotIn(List<String> values) {
            addCriterion("tissusname not in", values, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameBetween(String value1, String value2) {
            addCriterion("tissusname between", value1, value2, "tissusname");
            return (Criteria) this;
        }

        public Criteria andTissusnameNotBetween(String value1, String value2) {
            addCriterion("tissusname not between", value1, value2, "tissusname");
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