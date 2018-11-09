package com.business.product.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProTypeExample() {
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

        public Criteria andProtypenameIsNull() {
            addCriterion("protypename is null");
            return (Criteria) this;
        }

        public Criteria andProtypenameIsNotNull() {
            addCriterion("protypename is not null");
            return (Criteria) this;
        }

        public Criteria andProtypenameEqualTo(String value) {
            addCriterion("protypename =", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameNotEqualTo(String value) {
            addCriterion("protypename <>", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameGreaterThan(String value) {
            addCriterion("protypename >", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("protypename >=", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameLessThan(String value) {
            addCriterion("protypename <", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameLessThanOrEqualTo(String value) {
            addCriterion("protypename <=", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameLike(String value) {
            addCriterion("protypename like", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameNotLike(String value) {
            addCriterion("protypename not like", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameIn(List<String> values) {
            addCriterion("protypename in", values, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameNotIn(List<String> values) {
            addCriterion("protypename not in", values, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameBetween(String value1, String value2) {
            addCriterion("protypename between", value1, value2, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameNotBetween(String value1, String value2) {
            addCriterion("protypename not between", value1, value2, "protypename");
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