package com.business.sysuser.pojo;

import java.util.ArrayList;
import java.util.List;

public class GyTypeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GyTypeInfoExample() {
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

        public Criteria andGytypeidIsNull() {
            addCriterion("gytypeid is null");
            return (Criteria) this;
        }

        public Criteria andGytypeidIsNotNull() {
            addCriterion("gytypeid is not null");
            return (Criteria) this;
        }

        public Criteria andGytypeidEqualTo(Long value) {
            addCriterion("gytypeid =", value, "gytypeid");
            return (Criteria) this;
        }

        public Criteria andGytypeidNotEqualTo(Long value) {
            addCriterion("gytypeid <>", value, "gytypeid");
            return (Criteria) this;
        }

        public Criteria andGytypeidGreaterThan(Long value) {
            addCriterion("gytypeid >", value, "gytypeid");
            return (Criteria) this;
        }

        public Criteria andGytypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("gytypeid >=", value, "gytypeid");
            return (Criteria) this;
        }

        public Criteria andGytypeidLessThan(Long value) {
            addCriterion("gytypeid <", value, "gytypeid");
            return (Criteria) this;
        }

        public Criteria andGytypeidLessThanOrEqualTo(Long value) {
            addCriterion("gytypeid <=", value, "gytypeid");
            return (Criteria) this;
        }

        public Criteria andGytypeidIn(List<Long> values) {
            addCriterion("gytypeid in", values, "gytypeid");
            return (Criteria) this;
        }

        public Criteria andGytypeidNotIn(List<Long> values) {
            addCriterion("gytypeid not in", values, "gytypeid");
            return (Criteria) this;
        }

        public Criteria andGytypeidBetween(Long value1, Long value2) {
            addCriterion("gytypeid between", value1, value2, "gytypeid");
            return (Criteria) this;
        }

        public Criteria andGytypeidNotBetween(Long value1, Long value2) {
            addCriterion("gytypeid not between", value1, value2, "gytypeid");
            return (Criteria) this;
        }

        public Criteria andGynameIsNull() {
            addCriterion("gyname is null");
            return (Criteria) this;
        }

        public Criteria andGynameIsNotNull() {
            addCriterion("gyname is not null");
            return (Criteria) this;
        }

        public Criteria andGynameEqualTo(String value) {
            addCriterion("gyname =", value, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameNotEqualTo(String value) {
            addCriterion("gyname <>", value, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameGreaterThan(String value) {
            addCriterion("gyname >", value, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameGreaterThanOrEqualTo(String value) {
            addCriterion("gyname >=", value, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameLessThan(String value) {
            addCriterion("gyname <", value, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameLessThanOrEqualTo(String value) {
            addCriterion("gyname <=", value, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameLike(String value) {
            addCriterion("gyname like", value, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameNotLike(String value) {
            addCriterion("gyname not like", value, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameIn(List<String> values) {
            addCriterion("gyname in", values, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameNotIn(List<String> values) {
            addCriterion("gyname not in", values, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameBetween(String value1, String value2) {
            addCriterion("gyname between", value1, value2, "gyname");
            return (Criteria) this;
        }

        public Criteria andGynameNotBetween(String value1, String value2) {
            addCriterion("gyname not between", value1, value2, "gyname");
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