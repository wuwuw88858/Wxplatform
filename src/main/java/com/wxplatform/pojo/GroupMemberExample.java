package com.wxplatform.pojo;

import java.util.ArrayList;
import java.util.List;

public class GroupMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupMemberExample() {
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

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(String value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(String value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(String value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(String value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(String value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLike(String value) {
            addCriterion("memberid like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotLike(String value) {
            addCriterion("memberid not like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<String> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<String> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(String value1, String value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(String value1, String value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMembernameIsNull() {
            addCriterion("membername is null");
            return (Criteria) this;
        }

        public Criteria andMembernameIsNotNull() {
            addCriterion("membername is not null");
            return (Criteria) this;
        }

        public Criteria andMembernameEqualTo(String value) {
            addCriterion("membername =", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotEqualTo(String value) {
            addCriterion("membername <>", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameGreaterThan(String value) {
            addCriterion("membername >", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameGreaterThanOrEqualTo(String value) {
            addCriterion("membername >=", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLessThan(String value) {
            addCriterion("membername <", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLessThanOrEqualTo(String value) {
            addCriterion("membername <=", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLike(String value) {
            addCriterion("membername like", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotLike(String value) {
            addCriterion("membername not like", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameIn(List<String> values) {
            addCriterion("membername in", values, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotIn(List<String> values) {
            addCriterion("membername not in", values, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameBetween(String value1, String value2) {
            addCriterion("membername between", value1, value2, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotBetween(String value1, String value2) {
            addCriterion("membername not between", value1, value2, "membername");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusIsNull() {
            addCriterion("politicalstatus is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusIsNotNull() {
            addCriterion("politicalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusEqualTo(Integer value) {
            addCriterion("politicalstatus =", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotEqualTo(Integer value) {
            addCriterion("politicalstatus <>", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusGreaterThan(Integer value) {
            addCriterion("politicalstatus >", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("politicalstatus >=", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusLessThan(Integer value) {
            addCriterion("politicalstatus <", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusLessThanOrEqualTo(Integer value) {
            addCriterion("politicalstatus <=", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusIn(List<Integer> values) {
            addCriterion("politicalstatus in", values, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotIn(List<Integer> values) {
            addCriterion("politicalstatus not in", values, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusBetween(Integer value1, Integer value2) {
            addCriterion("politicalstatus between", value1, value2, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("politicalstatus not between", value1, value2, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andTissusIsNull() {
            addCriterion("tissus is null");
            return (Criteria) this;
        }

        public Criteria andTissusIsNotNull() {
            addCriterion("tissus is not null");
            return (Criteria) this;
        }

        public Criteria andTissusEqualTo(Integer value) {
            addCriterion("tissus =", value, "tissus");
            return (Criteria) this;
        }

        public Criteria andTissusNotEqualTo(Integer value) {
            addCriterion("tissus <>", value, "tissus");
            return (Criteria) this;
        }

        public Criteria andTissusGreaterThan(Integer value) {
            addCriterion("tissus >", value, "tissus");
            return (Criteria) this;
        }

        public Criteria andTissusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tissus >=", value, "tissus");
            return (Criteria) this;
        }

        public Criteria andTissusLessThan(Integer value) {
            addCriterion("tissus <", value, "tissus");
            return (Criteria) this;
        }

        public Criteria andTissusLessThanOrEqualTo(Integer value) {
            addCriterion("tissus <=", value, "tissus");
            return (Criteria) this;
        }

        public Criteria andTissusIn(List<Integer> values) {
            addCriterion("tissus in", values, "tissus");
            return (Criteria) this;
        }

        public Criteria andTissusNotIn(List<Integer> values) {
            addCriterion("tissus not in", values, "tissus");
            return (Criteria) this;
        }

        public Criteria andTissusBetween(Integer value1, Integer value2) {
            addCriterion("tissus between", value1, value2, "tissus");
            return (Criteria) this;
        }

        public Criteria andTissusNotBetween(Integer value1, Integer value2) {
            addCriterion("tissus not between", value1, value2, "tissus");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(Integer value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(Integer value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(Integer value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(Integer value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<Integer> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<Integer> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionIsNull() {
            addCriterion("departmentposition is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionIsNotNull() {
            addCriterion("departmentposition is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionEqualTo(Integer value) {
            addCriterion("departmentposition =", value, "departmentposition");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionNotEqualTo(Integer value) {
            addCriterion("departmentposition <>", value, "departmentposition");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionGreaterThan(Integer value) {
            addCriterion("departmentposition >", value, "departmentposition");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentposition >=", value, "departmentposition");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionLessThan(Integer value) {
            addCriterion("departmentposition <", value, "departmentposition");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionLessThanOrEqualTo(Integer value) {
            addCriterion("departmentposition <=", value, "departmentposition");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionIn(List<Integer> values) {
            addCriterion("departmentposition in", values, "departmentposition");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionNotIn(List<Integer> values) {
            addCriterion("departmentposition not in", values, "departmentposition");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionBetween(Integer value1, Integer value2) {
            addCriterion("departmentposition between", value1, value2, "departmentposition");
            return (Criteria) this;
        }

        public Criteria andDepartmentpositionNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentposition not between", value1, value2, "departmentposition");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNull() {
            addCriterion("telnumber is null");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNotNull() {
            addCriterion("telnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumberEqualTo(String value) {
            addCriterion("telnumber =", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotEqualTo(String value) {
            addCriterion("telnumber <>", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThan(String value) {
            addCriterion("telnumber >", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("telnumber >=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThan(String value) {
            addCriterion("telnumber <", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThanOrEqualTo(String value) {
            addCriterion("telnumber <=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLike(String value) {
            addCriterion("telnumber like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotLike(String value) {
            addCriterion("telnumber not like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberIn(List<String> values) {
            addCriterion("telnumber in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotIn(List<String> values) {
            addCriterion("telnumber not in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberBetween(String value1, String value2) {
            addCriterion("telnumber between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotBetween(String value1, String value2) {
            addCriterion("telnumber not between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andMemberstatusIsNull() {
            addCriterion("memberstatus is null");
            return (Criteria) this;
        }

        public Criteria andMemberstatusIsNotNull() {
            addCriterion("memberstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMemberstatusEqualTo(String value) {
            addCriterion("memberstatus =", value, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusNotEqualTo(String value) {
            addCriterion("memberstatus <>", value, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusGreaterThan(String value) {
            addCriterion("memberstatus >", value, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusGreaterThanOrEqualTo(String value) {
            addCriterion("memberstatus >=", value, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusLessThan(String value) {
            addCriterion("memberstatus <", value, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusLessThanOrEqualTo(String value) {
            addCriterion("memberstatus <=", value, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusLike(String value) {
            addCriterion("memberstatus like", value, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusNotLike(String value) {
            addCriterion("memberstatus not like", value, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusIn(List<String> values) {
            addCriterion("memberstatus in", values, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusNotIn(List<String> values) {
            addCriterion("memberstatus not in", values, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusBetween(String value1, String value2) {
            addCriterion("memberstatus between", value1, value2, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andMemberstatusNotBetween(String value1, String value2) {
            addCriterion("memberstatus not between", value1, value2, "memberstatus");
            return (Criteria) this;
        }

        public Criteria andStandby3IsNull() {
            addCriterion("standby3 is null");
            return (Criteria) this;
        }

        public Criteria andStandby3IsNotNull() {
            addCriterion("standby3 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby3EqualTo(String value) {
            addCriterion("standby3 =", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotEqualTo(String value) {
            addCriterion("standby3 <>", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3GreaterThan(String value) {
            addCriterion("standby3 >", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3GreaterThanOrEqualTo(String value) {
            addCriterion("standby3 >=", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3LessThan(String value) {
            addCriterion("standby3 <", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3LessThanOrEqualTo(String value) {
            addCriterion("standby3 <=", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3Like(String value) {
            addCriterion("standby3 like", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotLike(String value) {
            addCriterion("standby3 not like", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3In(List<String> values) {
            addCriterion("standby3 in", values, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotIn(List<String> values) {
            addCriterion("standby3 not in", values, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3Between(String value1, String value2) {
            addCriterion("standby3 between", value1, value2, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotBetween(String value1, String value2) {
            addCriterion("standby3 not between", value1, value2, "standby3");
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