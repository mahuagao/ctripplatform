package com.business.orderin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
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

        public Criteria andTopenameIsNull() {
            addCriterion("topename is null");
            return (Criteria) this;
        }

        public Criteria andTopenameIsNotNull() {
            addCriterion("topename is not null");
            return (Criteria) this;
        }

        public Criteria andTopenameEqualTo(String value) {
            addCriterion("topename =", value, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameNotEqualTo(String value) {
            addCriterion("topename <>", value, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameGreaterThan(String value) {
            addCriterion("topename >", value, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameGreaterThanOrEqualTo(String value) {
            addCriterion("topename >=", value, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameLessThan(String value) {
            addCriterion("topename <", value, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameLessThanOrEqualTo(String value) {
            addCriterion("topename <=", value, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameLike(String value) {
            addCriterion("topename like", value, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameNotLike(String value) {
            addCriterion("topename not like", value, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameIn(List<String> values) {
            addCriterion("topename in", values, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameNotIn(List<String> values) {
            addCriterion("topename not in", values, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameBetween(String value1, String value2) {
            addCriterion("topename between", value1, value2, "topename");
            return (Criteria) this;
        }

        public Criteria andTopenameNotBetween(String value1, String value2) {
            addCriterion("topename not between", value1, value2, "topename");
            return (Criteria) this;
        }

        public Criteria andTopephoneIsNull() {
            addCriterion("topephone is null");
            return (Criteria) this;
        }

        public Criteria andTopephoneIsNotNull() {
            addCriterion("topephone is not null");
            return (Criteria) this;
        }

        public Criteria andTopephoneEqualTo(String value) {
            addCriterion("topephone =", value, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneNotEqualTo(String value) {
            addCriterion("topephone <>", value, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneGreaterThan(String value) {
            addCriterion("topephone >", value, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneGreaterThanOrEqualTo(String value) {
            addCriterion("topephone >=", value, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneLessThan(String value) {
            addCriterion("topephone <", value, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneLessThanOrEqualTo(String value) {
            addCriterion("topephone <=", value, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneLike(String value) {
            addCriterion("topephone like", value, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneNotLike(String value) {
            addCriterion("topephone not like", value, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneIn(List<String> values) {
            addCriterion("topephone in", values, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneNotIn(List<String> values) {
            addCriterion("topephone not in", values, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneBetween(String value1, String value2) {
            addCriterion("topephone between", value1, value2, "topephone");
            return (Criteria) this;
        }

        public Criteria andTopephoneNotBetween(String value1, String value2) {
            addCriterion("topephone not between", value1, value2, "topephone");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNull() {
            addCriterion("ordertype is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("ordertype is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(String value) {
            addCriterion("ordertype =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(String value) {
            addCriterion("ordertype <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(String value) {
            addCriterion("ordertype >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(String value) {
            addCriterion("ordertype >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(String value) {
            addCriterion("ordertype <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(String value) {
            addCriterion("ordertype <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLike(String value) {
            addCriterion("ordertype like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotLike(String value) {
            addCriterion("ordertype not like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<String> values) {
            addCriterion("ordertype in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<String> values) {
            addCriterion("ordertype not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(String value1, String value2) {
            addCriterion("ordertype between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(String value1, String value2) {
            addCriterion("ordertype not between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("orderstate is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("orderstate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Long value) {
            addCriterion("orderstate =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Long value) {
            addCriterion("orderstate <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Long value) {
            addCriterion("orderstate >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Long value) {
            addCriterion("orderstate >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Long value) {
            addCriterion("orderstate <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Long value) {
            addCriterion("orderstate <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Long> values) {
            addCriterion("orderstate in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Long> values) {
            addCriterion("orderstate not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Long value1, Long value2) {
            addCriterion("orderstate between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Long value1, Long value2) {
            addCriterion("orderstate not between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andIsorderIsNull() {
            addCriterion("isorder is null");
            return (Criteria) this;
        }

        public Criteria andIsorderIsNotNull() {
            addCriterion("isorder is not null");
            return (Criteria) this;
        }

        public Criteria andIsorderEqualTo(Long value) {
            addCriterion("isorder =", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotEqualTo(Long value) {
            addCriterion("isorder <>", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderGreaterThan(Long value) {
            addCriterion("isorder >", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderGreaterThanOrEqualTo(Long value) {
            addCriterion("isorder >=", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderLessThan(Long value) {
            addCriterion("isorder <", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderLessThanOrEqualTo(Long value) {
            addCriterion("isorder <=", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderIn(List<Long> values) {
            addCriterion("isorder in", values, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotIn(List<Long> values) {
            addCriterion("isorder not in", values, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderBetween(Long value1, Long value2) {
            addCriterion("isorder between", value1, value2, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotBetween(Long value1, Long value2) {
            addCriterion("isorder not between", value1, value2, "isorder");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andTradetypeIsNull() {
            addCriterion("tradetype is null");
            return (Criteria) this;
        }

        public Criteria andTradetypeIsNotNull() {
            addCriterion("tradetype is not null");
            return (Criteria) this;
        }

        public Criteria andTradetypeEqualTo(String value) {
            addCriterion("tradetype =", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotEqualTo(String value) {
            addCriterion("tradetype <>", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeGreaterThan(String value) {
            addCriterion("tradetype >", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeGreaterThanOrEqualTo(String value) {
            addCriterion("tradetype >=", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLessThan(String value) {
            addCriterion("tradetype <", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLessThanOrEqualTo(String value) {
            addCriterion("tradetype <=", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLike(String value) {
            addCriterion("tradetype like", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotLike(String value) {
            addCriterion("tradetype not like", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeIn(List<String> values) {
            addCriterion("tradetype in", values, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotIn(List<String> values) {
            addCriterion("tradetype not in", values, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeBetween(String value1, String value2) {
            addCriterion("tradetype between", value1, value2, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotBetween(String value1, String value2) {
            addCriterion("tradetype not between", value1, value2, "tradetype");
            return (Criteria) this;
        }

        public Criteria andOrderpayIsNull() {
            addCriterion("orderpay is null");
            return (Criteria) this;
        }

        public Criteria andOrderpayIsNotNull() {
            addCriterion("orderpay is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpayEqualTo(Long value) {
            addCriterion("orderpay =", value, "orderpay");
            return (Criteria) this;
        }

        public Criteria andOrderpayNotEqualTo(Long value) {
            addCriterion("orderpay <>", value, "orderpay");
            return (Criteria) this;
        }

        public Criteria andOrderpayGreaterThan(Long value) {
            addCriterion("orderpay >", value, "orderpay");
            return (Criteria) this;
        }

        public Criteria andOrderpayGreaterThanOrEqualTo(Long value) {
            addCriterion("orderpay >=", value, "orderpay");
            return (Criteria) this;
        }

        public Criteria andOrderpayLessThan(Long value) {
            addCriterion("orderpay <", value, "orderpay");
            return (Criteria) this;
        }

        public Criteria andOrderpayLessThanOrEqualTo(Long value) {
            addCriterion("orderpay <=", value, "orderpay");
            return (Criteria) this;
        }

        public Criteria andOrderpayIn(List<Long> values) {
            addCriterion("orderpay in", values, "orderpay");
            return (Criteria) this;
        }

        public Criteria andOrderpayNotIn(List<Long> values) {
            addCriterion("orderpay not in", values, "orderpay");
            return (Criteria) this;
        }

        public Criteria andOrderpayBetween(Long value1, Long value2) {
            addCriterion("orderpay between", value1, value2, "orderpay");
            return (Criteria) this;
        }

        public Criteria andOrderpayNotBetween(Long value1, Long value2) {
            addCriterion("orderpay not between", value1, value2, "orderpay");
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