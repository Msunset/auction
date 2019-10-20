package com.sunset.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRelationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPersonaIsNull() {
            addCriterion("persona is null");
            return (Criteria) this;
        }

        public Criteria andPersonaIsNotNull() {
            addCriterion("persona is not null");
            return (Criteria) this;
        }

        public Criteria andPersonaEqualTo(Integer value) {
            addCriterion("persona =", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaNotEqualTo(Integer value) {
            addCriterion("persona <>", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaGreaterThan(Integer value) {
            addCriterion("persona >", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaGreaterThanOrEqualTo(Integer value) {
            addCriterion("persona >=", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaLessThan(Integer value) {
            addCriterion("persona <", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaLessThanOrEqualTo(Integer value) {
            addCriterion("persona <=", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaIn(List<Integer> values) {
            addCriterion("persona in", values, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaNotIn(List<Integer> values) {
            addCriterion("persona not in", values, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaBetween(Integer value1, Integer value2) {
            addCriterion("persona between", value1, value2, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaNotBetween(Integer value1, Integer value2) {
            addCriterion("persona not between", value1, value2, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonbIsNull() {
            addCriterion("personb is null");
            return (Criteria) this;
        }

        public Criteria andPersonbIsNotNull() {
            addCriterion("personb is not null");
            return (Criteria) this;
        }

        public Criteria andPersonbEqualTo(Integer value) {
            addCriterion("personb =", value, "personb");
            return (Criteria) this;
        }

        public Criteria andPersonbNotEqualTo(Integer value) {
            addCriterion("personb <>", value, "personb");
            return (Criteria) this;
        }

        public Criteria andPersonbGreaterThan(Integer value) {
            addCriterion("personb >", value, "personb");
            return (Criteria) this;
        }

        public Criteria andPersonbGreaterThanOrEqualTo(Integer value) {
            addCriterion("personb >=", value, "personb");
            return (Criteria) this;
        }

        public Criteria andPersonbLessThan(Integer value) {
            addCriterion("personb <", value, "personb");
            return (Criteria) this;
        }

        public Criteria andPersonbLessThanOrEqualTo(Integer value) {
            addCriterion("personb <=", value, "personb");
            return (Criteria) this;
        }

        public Criteria andPersonbIn(List<Integer> values) {
            addCriterion("personb in", values, "personb");
            return (Criteria) this;
        }

        public Criteria andPersonbNotIn(List<Integer> values) {
            addCriterion("personb not in", values, "personb");
            return (Criteria) this;
        }

        public Criteria andPersonbBetween(Integer value1, Integer value2) {
            addCriterion("personb between", value1, value2, "personb");
            return (Criteria) this;
        }

        public Criteria andPersonbNotBetween(Integer value1, Integer value2) {
            addCriterion("personb not between", value1, value2, "personb");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPersonNameaIsNull() {
            addCriterion("person_namea is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameaIsNotNull() {
            addCriterion("person_namea is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameaEqualTo(String value) {
            addCriterion("person_namea =", value, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaNotEqualTo(String value) {
            addCriterion("person_namea <>", value, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaGreaterThan(String value) {
            addCriterion("person_namea >", value, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaGreaterThanOrEqualTo(String value) {
            addCriterion("person_namea >=", value, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaLessThan(String value) {
            addCriterion("person_namea <", value, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaLessThanOrEqualTo(String value) {
            addCriterion("person_namea <=", value, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaLike(String value) {
            addCriterion("person_namea like", value, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaNotLike(String value) {
            addCriterion("person_namea not like", value, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaIn(List<String> values) {
            addCriterion("person_namea in", values, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaNotIn(List<String> values) {
            addCriterion("person_namea not in", values, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaBetween(String value1, String value2) {
            addCriterion("person_namea between", value1, value2, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNameaNotBetween(String value1, String value2) {
            addCriterion("person_namea not between", value1, value2, "personNamea");
            return (Criteria) this;
        }

        public Criteria andPersonNamebIsNull() {
            addCriterion("person_nameb is null");
            return (Criteria) this;
        }

        public Criteria andPersonNamebIsNotNull() {
            addCriterion("person_nameb is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNamebEqualTo(String value) {
            addCriterion("person_nameb =", value, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebNotEqualTo(String value) {
            addCriterion("person_nameb <>", value, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebGreaterThan(String value) {
            addCriterion("person_nameb >", value, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebGreaterThanOrEqualTo(String value) {
            addCriterion("person_nameb >=", value, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebLessThan(String value) {
            addCriterion("person_nameb <", value, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebLessThanOrEqualTo(String value) {
            addCriterion("person_nameb <=", value, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebLike(String value) {
            addCriterion("person_nameb like", value, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebNotLike(String value) {
            addCriterion("person_nameb not like", value, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebIn(List<String> values) {
            addCriterion("person_nameb in", values, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebNotIn(List<String> values) {
            addCriterion("person_nameb not in", values, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebBetween(String value1, String value2) {
            addCriterion("person_nameb between", value1, value2, "personNameb");
            return (Criteria) this;
        }

        public Criteria andPersonNamebNotBetween(String value1, String value2) {
            addCriterion("person_nameb not between", value1, value2, "personNameb");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("creattime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creattime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("creattime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("creattime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("creattime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creattime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("creattime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("creattime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterion("creattime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterion("creattime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("creattime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("creattime not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
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