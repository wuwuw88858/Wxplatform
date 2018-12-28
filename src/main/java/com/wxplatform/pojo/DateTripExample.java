package com.wxplatform.pojo;

import java.util.ArrayList;
import java.util.List;

public class DateTripExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DateTripExample() {
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

        public Criteria andDatetripidIsNull() {
            addCriterion("datetripid is null");
            return (Criteria) this;
        }

        public Criteria andDatetripidIsNotNull() {
            addCriterion("datetripid is not null");
            return (Criteria) this;
        }

        public Criteria andDatetripidEqualTo(String value) {
            addCriterion("datetripid =", value, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidNotEqualTo(String value) {
            addCriterion("datetripid <>", value, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidGreaterThan(String value) {
            addCriterion("datetripid >", value, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidGreaterThanOrEqualTo(String value) {
            addCriterion("datetripid >=", value, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidLessThan(String value) {
            addCriterion("datetripid <", value, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidLessThanOrEqualTo(String value) {
            addCriterion("datetripid <=", value, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidLike(String value) {
            addCriterion("datetripid like", value, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidNotLike(String value) {
            addCriterion("datetripid not like", value, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidIn(List<String> values) {
            addCriterion("datetripid in", values, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidNotIn(List<String> values) {
            addCriterion("datetripid not in", values, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidBetween(String value1, String value2) {
            addCriterion("datetripid between", value1, value2, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDatetripidNotBetween(String value1, String value2) {
            addCriterion("datetripid not between", value1, value2, "datetripid");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(Integer value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(Integer value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(Integer value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(Integer value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(Integer value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<Integer> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<Integer> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(Integer value1, Integer value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andXqdayIsNull() {
            addCriterion("xqday is null");
            return (Criteria) this;
        }

        public Criteria andXqdayIsNotNull() {
            addCriterion("xqday is not null");
            return (Criteria) this;
        }

        public Criteria andXqdayEqualTo(String value) {
            addCriterion("xqday =", value, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayNotEqualTo(String value) {
            addCriterion("xqday <>", value, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayGreaterThan(String value) {
            addCriterion("xqday >", value, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayGreaterThanOrEqualTo(String value) {
            addCriterion("xqday >=", value, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayLessThan(String value) {
            addCriterion("xqday <", value, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayLessThanOrEqualTo(String value) {
            addCriterion("xqday <=", value, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayLike(String value) {
            addCriterion("xqday like", value, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayNotLike(String value) {
            addCriterion("xqday not like", value, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayIn(List<String> values) {
            addCriterion("xqday in", values, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayNotIn(List<String> values) {
            addCriterion("xqday not in", values, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayBetween(String value1, String value2) {
            addCriterion("xqday between", value1, value2, "xqday");
            return (Criteria) this;
        }

        public Criteria andXqdayNotBetween(String value1, String value2) {
            addCriterion("xqday not between", value1, value2, "xqday");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentIsNull() {
            addCriterion("datetripcontent is null");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentIsNotNull() {
            addCriterion("datetripcontent is not null");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentEqualTo(String value) {
            addCriterion("datetripcontent =", value, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentNotEqualTo(String value) {
            addCriterion("datetripcontent <>", value, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentGreaterThan(String value) {
            addCriterion("datetripcontent >", value, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentGreaterThanOrEqualTo(String value) {
            addCriterion("datetripcontent >=", value, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentLessThan(String value) {
            addCriterion("datetripcontent <", value, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentLessThanOrEqualTo(String value) {
            addCriterion("datetripcontent <=", value, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentLike(String value) {
            addCriterion("datetripcontent like", value, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentNotLike(String value) {
            addCriterion("datetripcontent not like", value, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentIn(List<String> values) {
            addCriterion("datetripcontent in", values, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentNotIn(List<String> values) {
            addCriterion("datetripcontent not in", values, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentBetween(String value1, String value2) {
            addCriterion("datetripcontent between", value1, value2, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andDatetripcontentNotBetween(String value1, String value2) {
            addCriterion("datetripcontent not between", value1, value2, "datetripcontent");
            return (Criteria) this;
        }

        public Criteria andParticipantsIsNull() {
            addCriterion("participants is null");
            return (Criteria) this;
        }

        public Criteria andParticipantsIsNotNull() {
            addCriterion("participants is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantsEqualTo(String value) {
            addCriterion("participants =", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotEqualTo(String value) {
            addCriterion("participants <>", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsGreaterThan(String value) {
            addCriterion("participants >", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsGreaterThanOrEqualTo(String value) {
            addCriterion("participants >=", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsLessThan(String value) {
            addCriterion("participants <", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsLessThanOrEqualTo(String value) {
            addCriterion("participants <=", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsLike(String value) {
            addCriterion("participants like", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotLike(String value) {
            addCriterion("participants not like", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsIn(List<String> values) {
            addCriterion("participants in", values, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotIn(List<String> values) {
            addCriterion("participants not in", values, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsBetween(String value1, String value2) {
            addCriterion("participants between", value1, value2, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotBetween(String value1, String value2) {
            addCriterion("participants not between", value1, value2, "participants");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentIsNull() {
            addCriterion("hostdepartment is null");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentIsNotNull() {
            addCriterion("hostdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentEqualTo(String value) {
            addCriterion("hostdepartment =", value, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentNotEqualTo(String value) {
            addCriterion("hostdepartment <>", value, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentGreaterThan(String value) {
            addCriterion("hostdepartment >", value, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("hostdepartment >=", value, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentLessThan(String value) {
            addCriterion("hostdepartment <", value, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentLessThanOrEqualTo(String value) {
            addCriterion("hostdepartment <=", value, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentLike(String value) {
            addCriterion("hostdepartment like", value, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentNotLike(String value) {
            addCriterion("hostdepartment not like", value, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentIn(List<String> values) {
            addCriterion("hostdepartment in", values, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentNotIn(List<String> values) {
            addCriterion("hostdepartment not in", values, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentBetween(String value1, String value2) {
            addCriterion("hostdepartment between", value1, value2, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andHostdepartmentNotBetween(String value1, String value2) {
            addCriterion("hostdepartment not between", value1, value2, "hostdepartment");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andEditorIsNull() {
            addCriterion("editor is null");
            return (Criteria) this;
        }

        public Criteria andEditorIsNotNull() {
            addCriterion("editor is not null");
            return (Criteria) this;
        }

        public Criteria andEditorEqualTo(String value) {
            addCriterion("editor =", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotEqualTo(String value) {
            addCriterion("editor <>", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThan(String value) {
            addCriterion("editor >", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThanOrEqualTo(String value) {
            addCriterion("editor >=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThan(String value) {
            addCriterion("editor <", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThanOrEqualTo(String value) {
            addCriterion("editor <=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLike(String value) {
            addCriterion("editor like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotLike(String value) {
            addCriterion("editor not like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorIn(List<String> values) {
            addCriterion("editor in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotIn(List<String> values) {
            addCriterion("editor not in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorBetween(String value1, String value2) {
            addCriterion("editor between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotBetween(String value1, String value2) {
            addCriterion("editor not between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andTripstatusIsNull() {
            addCriterion("tripstatus is null");
            return (Criteria) this;
        }

        public Criteria andTripstatusIsNotNull() {
            addCriterion("tripstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTripstatusEqualTo(String value) {
            addCriterion("tripstatus =", value, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusNotEqualTo(String value) {
            addCriterion("tripstatus <>", value, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusGreaterThan(String value) {
            addCriterion("tripstatus >", value, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tripstatus >=", value, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusLessThan(String value) {
            addCriterion("tripstatus <", value, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusLessThanOrEqualTo(String value) {
            addCriterion("tripstatus <=", value, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusLike(String value) {
            addCriterion("tripstatus like", value, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusNotLike(String value) {
            addCriterion("tripstatus not like", value, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusIn(List<String> values) {
            addCriterion("tripstatus in", values, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusNotIn(List<String> values) {
            addCriterion("tripstatus not in", values, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusBetween(String value1, String value2) {
            addCriterion("tripstatus between", value1, value2, "tripstatus");
            return (Criteria) this;
        }

        public Criteria andTripstatusNotBetween(String value1, String value2) {
            addCriterion("tripstatus not between", value1, value2, "tripstatus");
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