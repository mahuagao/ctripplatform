package com.business.product.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProBaseExample() {
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

        public Criteria andProidIsNull() {
            addCriterion("proid is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("proid is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(Long value) {
            addCriterion("proid =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(Long value) {
            addCriterion("proid <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(Long value) {
            addCriterion("proid >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(Long value) {
            addCriterion("proid >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(Long value) {
            addCriterion("proid <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(Long value) {
            addCriterion("proid <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<Long> values) {
            addCriterion("proid in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<Long> values) {
            addCriterion("proid not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(Long value1, Long value2) {
            addCriterion("proid between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(Long value1, Long value2) {
            addCriterion("proid not between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProtypeidIsNull() {
            addCriterion("protypeid is null");
            return (Criteria) this;
        }

        public Criteria andProtypeidIsNotNull() {
            addCriterion("protypeid is not null");
            return (Criteria) this;
        }

        public Criteria andProtypeidEqualTo(Long value) {
            addCriterion("protypeid =", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotEqualTo(Long value) {
            addCriterion("protypeid <>", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidGreaterThan(Long value) {
            addCriterion("protypeid >", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("protypeid >=", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidLessThan(Long value) {
            addCriterion("protypeid <", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidLessThanOrEqualTo(Long value) {
            addCriterion("protypeid <=", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidIn(List<Long> values) {
            addCriterion("protypeid in", values, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotIn(List<Long> values) {
            addCriterion("protypeid not in", values, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidBetween(Long value1, Long value2) {
            addCriterion("protypeid between", value1, value2, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotBetween(Long value1, Long value2) {
            addCriterion("protypeid not between", value1, value2, "protypeid");
            return (Criteria) this;
        }

        public Criteria andCommeridIsNull() {
            addCriterion("commerid is null");
            return (Criteria) this;
        }

        public Criteria andCommeridIsNotNull() {
            addCriterion("commerid is not null");
            return (Criteria) this;
        }

        public Criteria andCommeridEqualTo(Long value) {
            addCriterion("commerid =", value, "commerid");
            return (Criteria) this;
        }

        public Criteria andCommeridNotEqualTo(Long value) {
            addCriterion("commerid <>", value, "commerid");
            return (Criteria) this;
        }

        public Criteria andCommeridGreaterThan(Long value) {
            addCriterion("commerid >", value, "commerid");
            return (Criteria) this;
        }

        public Criteria andCommeridGreaterThanOrEqualTo(Long value) {
            addCriterion("commerid >=", value, "commerid");
            return (Criteria) this;
        }

        public Criteria andCommeridLessThan(Long value) {
            addCriterion("commerid <", value, "commerid");
            return (Criteria) this;
        }

        public Criteria andCommeridLessThanOrEqualTo(Long value) {
            addCriterion("commerid <=", value, "commerid");
            return (Criteria) this;
        }

        public Criteria andCommeridIn(List<Long> values) {
            addCriterion("commerid in", values, "commerid");
            return (Criteria) this;
        }

        public Criteria andCommeridNotIn(List<Long> values) {
            addCriterion("commerid not in", values, "commerid");
            return (Criteria) this;
        }

        public Criteria andCommeridBetween(Long value1, Long value2) {
            addCriterion("commerid between", value1, value2, "commerid");
            return (Criteria) this;
        }

        public Criteria andCommeridNotBetween(Long value1, Long value2) {
            addCriterion("commerid not between", value1, value2, "commerid");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("proname is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("proname is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("proname =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("proname <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("proname >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("proname >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("proname <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("proname <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("proname like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("proname not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("proname in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("proname not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("proname between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("proname not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPropriceIsNull() {
            addCriterion("proprice is null");
            return (Criteria) this;
        }

        public Criteria andPropriceIsNotNull() {
            addCriterion("proprice is not null");
            return (Criteria) this;
        }

        public Criteria andPropriceEqualTo(Long value) {
            addCriterion("proprice =", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceNotEqualTo(Long value) {
            addCriterion("proprice <>", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceGreaterThan(Long value) {
            addCriterion("proprice >", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceGreaterThanOrEqualTo(Long value) {
            addCriterion("proprice >=", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceLessThan(Long value) {
            addCriterion("proprice <", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceLessThanOrEqualTo(Long value) {
            addCriterion("proprice <=", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceIn(List<Long> values) {
            addCriterion("proprice in", values, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceNotIn(List<Long> values) {
            addCriterion("proprice not in", values, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceBetween(Long value1, Long value2) {
            addCriterion("proprice between", value1, value2, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceNotBetween(Long value1, Long value2) {
            addCriterion("proprice not between", value1, value2, "proprice");
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