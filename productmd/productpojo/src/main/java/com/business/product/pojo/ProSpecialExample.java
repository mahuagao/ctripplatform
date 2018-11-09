package com.business.product.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProSpecialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProSpecialExample() {
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

        public Criteria andRoomtypeIsNull() {
            addCriterion("roomtype is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNotNull() {
            addCriterion("roomtype is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeEqualTo(String value) {
            addCriterion("roomtype =", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotEqualTo(String value) {
            addCriterion("roomtype <>", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThan(String value) {
            addCriterion("roomtype >", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThanOrEqualTo(String value) {
            addCriterion("roomtype >=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThan(String value) {
            addCriterion("roomtype <", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThanOrEqualTo(String value) {
            addCriterion("roomtype <=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLike(String value) {
            addCriterion("roomtype like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotLike(String value) {
            addCriterion("roomtype not like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIn(List<String> values) {
            addCriterion("roomtype in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotIn(List<String> values) {
            addCriterion("roomtype not in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeBetween(String value1, String value2) {
            addCriterion("roomtype between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotBetween(String value1, String value2) {
            addCriterion("roomtype not between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andStartpoIsNull() {
            addCriterion("startpo is null");
            return (Criteria) this;
        }

        public Criteria andStartpoIsNotNull() {
            addCriterion("startpo is not null");
            return (Criteria) this;
        }

        public Criteria andStartpoEqualTo(String value) {
            addCriterion("startpo =", value, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoNotEqualTo(String value) {
            addCriterion("startpo <>", value, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoGreaterThan(String value) {
            addCriterion("startpo >", value, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoGreaterThanOrEqualTo(String value) {
            addCriterion("startpo >=", value, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoLessThan(String value) {
            addCriterion("startpo <", value, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoLessThanOrEqualTo(String value) {
            addCriterion("startpo <=", value, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoLike(String value) {
            addCriterion("startpo like", value, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoNotLike(String value) {
            addCriterion("startpo not like", value, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoIn(List<String> values) {
            addCriterion("startpo in", values, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoNotIn(List<String> values) {
            addCriterion("startpo not in", values, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoBetween(String value1, String value2) {
            addCriterion("startpo between", value1, value2, "startpo");
            return (Criteria) this;
        }

        public Criteria andStartpoNotBetween(String value1, String value2) {
            addCriterion("startpo not between", value1, value2, "startpo");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andViewpointIsNull() {
            addCriterion("viewpoint is null");
            return (Criteria) this;
        }

        public Criteria andViewpointIsNotNull() {
            addCriterion("viewpoint is not null");
            return (Criteria) this;
        }

        public Criteria andViewpointEqualTo(String value) {
            addCriterion("viewpoint =", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointNotEqualTo(String value) {
            addCriterion("viewpoint <>", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointGreaterThan(String value) {
            addCriterion("viewpoint >", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointGreaterThanOrEqualTo(String value) {
            addCriterion("viewpoint >=", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointLessThan(String value) {
            addCriterion("viewpoint <", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointLessThanOrEqualTo(String value) {
            addCriterion("viewpoint <=", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointLike(String value) {
            addCriterion("viewpoint like", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointNotLike(String value) {
            addCriterion("viewpoint not like", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointIn(List<String> values) {
            addCriterion("viewpoint in", values, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointNotIn(List<String> values) {
            addCriterion("viewpoint not in", values, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointBetween(String value1, String value2) {
            addCriterion("viewpoint between", value1, value2, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointNotBetween(String value1, String value2) {
            addCriterion("viewpoint not between", value1, value2, "viewpoint");
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