package com.business.register.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConsumerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsumerInfoExample() {
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

        public Criteria andConidIsNull() {
            addCriterion("conid is null");
            return (Criteria) this;
        }

        public Criteria andConidIsNotNull() {
            addCriterion("conid is not null");
            return (Criteria) this;
        }

        public Criteria andConidEqualTo(Long value) {
            addCriterion("conid =", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotEqualTo(Long value) {
            addCriterion("conid <>", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidGreaterThan(Long value) {
            addCriterion("conid >", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidGreaterThanOrEqualTo(Long value) {
            addCriterion("conid >=", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidLessThan(Long value) {
            addCriterion("conid <", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidLessThanOrEqualTo(Long value) {
            addCriterion("conid <=", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidIn(List<Long> values) {
            addCriterion("conid in", values, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotIn(List<Long> values) {
            addCriterion("conid not in", values, "conid");
            return (Criteria) this;
        }

        public Criteria andConidBetween(Long value1, Long value2) {
            addCriterion("conid between", value1, value2, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotBetween(Long value1, Long value2) {
            addCriterion("conid not between", value1, value2, "conid");
            return (Criteria) this;
        }

        public Criteria andSysuseridIsNull() {
            addCriterion("sysuserid is null");
            return (Criteria) this;
        }

        public Criteria andSysuseridIsNotNull() {
            addCriterion("sysuserid is not null");
            return (Criteria) this;
        }

        public Criteria andSysuseridEqualTo(Long value) {
            addCriterion("sysuserid =", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridNotEqualTo(Long value) {
            addCriterion("sysuserid <>", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridGreaterThan(Long value) {
            addCriterion("sysuserid >", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("sysuserid >=", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridLessThan(Long value) {
            addCriterion("sysuserid <", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridLessThanOrEqualTo(Long value) {
            addCriterion("sysuserid <=", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridIn(List<Long> values) {
            addCriterion("sysuserid in", values, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridNotIn(List<Long> values) {
            addCriterion("sysuserid not in", values, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridBetween(Long value1, Long value2) {
            addCriterion("sysuserid between", value1, value2, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridNotBetween(Long value1, Long value2) {
            addCriterion("sysuserid not between", value1, value2, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andConnameIsNull() {
            addCriterion("conname is null");
            return (Criteria) this;
        }

        public Criteria andConnameIsNotNull() {
            addCriterion("conname is not null");
            return (Criteria) this;
        }

        public Criteria andConnameEqualTo(String value) {
            addCriterion("conname =", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotEqualTo(String value) {
            addCriterion("conname <>", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameGreaterThan(String value) {
            addCriterion("conname >", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameGreaterThanOrEqualTo(String value) {
            addCriterion("conname >=", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameLessThan(String value) {
            addCriterion("conname <", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameLessThanOrEqualTo(String value) {
            addCriterion("conname <=", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameLike(String value) {
            addCriterion("conname like", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotLike(String value) {
            addCriterion("conname not like", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameIn(List<String> values) {
            addCriterion("conname in", values, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotIn(List<String> values) {
            addCriterion("conname not in", values, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameBetween(String value1, String value2) {
            addCriterion("conname between", value1, value2, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotBetween(String value1, String value2) {
            addCriterion("conname not between", value1, value2, "conname");
            return (Criteria) this;
        }

        public Criteria andConageIsNull() {
            addCriterion("conage is null");
            return (Criteria) this;
        }

        public Criteria andConageIsNotNull() {
            addCriterion("conage is not null");
            return (Criteria) this;
        }

        public Criteria andConageEqualTo(Long value) {
            addCriterion("conage =", value, "conage");
            return (Criteria) this;
        }

        public Criteria andConageNotEqualTo(Long value) {
            addCriterion("conage <>", value, "conage");
            return (Criteria) this;
        }

        public Criteria andConageGreaterThan(Long value) {
            addCriterion("conage >", value, "conage");
            return (Criteria) this;
        }

        public Criteria andConageGreaterThanOrEqualTo(Long value) {
            addCriterion("conage >=", value, "conage");
            return (Criteria) this;
        }

        public Criteria andConageLessThan(Long value) {
            addCriterion("conage <", value, "conage");
            return (Criteria) this;
        }

        public Criteria andConageLessThanOrEqualTo(Long value) {
            addCriterion("conage <=", value, "conage");
            return (Criteria) this;
        }

        public Criteria andConageIn(List<Long> values) {
            addCriterion("conage in", values, "conage");
            return (Criteria) this;
        }

        public Criteria andConageNotIn(List<Long> values) {
            addCriterion("conage not in", values, "conage");
            return (Criteria) this;
        }

        public Criteria andConageBetween(Long value1, Long value2) {
            addCriterion("conage between", value1, value2, "conage");
            return (Criteria) this;
        }

        public Criteria andConageNotBetween(Long value1, Long value2) {
            addCriterion("conage not between", value1, value2, "conage");
            return (Criteria) this;
        }

        public Criteria andConphoneIsNull() {
            addCriterion("conphone is null");
            return (Criteria) this;
        }

        public Criteria andConphoneIsNotNull() {
            addCriterion("conphone is not null");
            return (Criteria) this;
        }

        public Criteria andConphoneEqualTo(String value) {
            addCriterion("conphone =", value, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneNotEqualTo(String value) {
            addCriterion("conphone <>", value, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneGreaterThan(String value) {
            addCriterion("conphone >", value, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneGreaterThanOrEqualTo(String value) {
            addCriterion("conphone >=", value, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneLessThan(String value) {
            addCriterion("conphone <", value, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneLessThanOrEqualTo(String value) {
            addCriterion("conphone <=", value, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneLike(String value) {
            addCriterion("conphone like", value, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneNotLike(String value) {
            addCriterion("conphone not like", value, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneIn(List<String> values) {
            addCriterion("conphone in", values, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneNotIn(List<String> values) {
            addCriterion("conphone not in", values, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneBetween(String value1, String value2) {
            addCriterion("conphone between", value1, value2, "conphone");
            return (Criteria) this;
        }

        public Criteria andConphoneNotBetween(String value1, String value2) {
            addCriterion("conphone not between", value1, value2, "conphone");
            return (Criteria) this;
        }

        public Criteria andConweixinIsNull() {
            addCriterion("conweixin is null");
            return (Criteria) this;
        }

        public Criteria andConweixinIsNotNull() {
            addCriterion("conweixin is not null");
            return (Criteria) this;
        }

        public Criteria andConweixinEqualTo(String value) {
            addCriterion("conweixin =", value, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinNotEqualTo(String value) {
            addCriterion("conweixin <>", value, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinGreaterThan(String value) {
            addCriterion("conweixin >", value, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinGreaterThanOrEqualTo(String value) {
            addCriterion("conweixin >=", value, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinLessThan(String value) {
            addCriterion("conweixin <", value, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinLessThanOrEqualTo(String value) {
            addCriterion("conweixin <=", value, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinLike(String value) {
            addCriterion("conweixin like", value, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinNotLike(String value) {
            addCriterion("conweixin not like", value, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinIn(List<String> values) {
            addCriterion("conweixin in", values, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinNotIn(List<String> values) {
            addCriterion("conweixin not in", values, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinBetween(String value1, String value2) {
            addCriterion("conweixin between", value1, value2, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConweixinNotBetween(String value1, String value2) {
            addCriterion("conweixin not between", value1, value2, "conweixin");
            return (Criteria) this;
        }

        public Criteria andConaddrIsNull() {
            addCriterion("conaddr is null");
            return (Criteria) this;
        }

        public Criteria andConaddrIsNotNull() {
            addCriterion("conaddr is not null");
            return (Criteria) this;
        }

        public Criteria andConaddrEqualTo(String value) {
            addCriterion("conaddr =", value, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrNotEqualTo(String value) {
            addCriterion("conaddr <>", value, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrGreaterThan(String value) {
            addCriterion("conaddr >", value, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrGreaterThanOrEqualTo(String value) {
            addCriterion("conaddr >=", value, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrLessThan(String value) {
            addCriterion("conaddr <", value, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrLessThanOrEqualTo(String value) {
            addCriterion("conaddr <=", value, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrLike(String value) {
            addCriterion("conaddr like", value, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrNotLike(String value) {
            addCriterion("conaddr not like", value, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrIn(List<String> values) {
            addCriterion("conaddr in", values, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrNotIn(List<String> values) {
            addCriterion("conaddr not in", values, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrBetween(String value1, String value2) {
            addCriterion("conaddr between", value1, value2, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConaddrNotBetween(String value1, String value2) {
            addCriterion("conaddr not between", value1, value2, "conaddr");
            return (Criteria) this;
        }

        public Criteria andConidentityIsNull() {
            addCriterion("conidentity is null");
            return (Criteria) this;
        }

        public Criteria andConidentityIsNotNull() {
            addCriterion("conidentity is not null");
            return (Criteria) this;
        }

        public Criteria andConidentityEqualTo(String value) {
            addCriterion("conidentity =", value, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityNotEqualTo(String value) {
            addCriterion("conidentity <>", value, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityGreaterThan(String value) {
            addCriterion("conidentity >", value, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityGreaterThanOrEqualTo(String value) {
            addCriterion("conidentity >=", value, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityLessThan(String value) {
            addCriterion("conidentity <", value, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityLessThanOrEqualTo(String value) {
            addCriterion("conidentity <=", value, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityLike(String value) {
            addCriterion("conidentity like", value, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityNotLike(String value) {
            addCriterion("conidentity not like", value, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityIn(List<String> values) {
            addCriterion("conidentity in", values, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityNotIn(List<String> values) {
            addCriterion("conidentity not in", values, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityBetween(String value1, String value2) {
            addCriterion("conidentity between", value1, value2, "conidentity");
            return (Criteria) this;
        }

        public Criteria andConidentityNotBetween(String value1, String value2) {
            addCriterion("conidentity not between", value1, value2, "conidentity");
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