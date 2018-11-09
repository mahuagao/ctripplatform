package com.business.sysuser.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommercialInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommercialInfoExample() {
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

        public Criteria andComgytypeidIsNull() {
            addCriterion("comgytypeid is null");
            return (Criteria) this;
        }

        public Criteria andComgytypeidIsNotNull() {
            addCriterion("comgytypeid is not null");
            return (Criteria) this;
        }

        public Criteria andComgytypeidEqualTo(Long value) {
            addCriterion("comgytypeid =", value, "comgytypeid");
            return (Criteria) this;
        }

        public Criteria andComgytypeidNotEqualTo(Long value) {
            addCriterion("comgytypeid <>", value, "comgytypeid");
            return (Criteria) this;
        }

        public Criteria andComgytypeidGreaterThan(Long value) {
            addCriterion("comgytypeid >", value, "comgytypeid");
            return (Criteria) this;
        }

        public Criteria andComgytypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("comgytypeid >=", value, "comgytypeid");
            return (Criteria) this;
        }

        public Criteria andComgytypeidLessThan(Long value) {
            addCriterion("comgytypeid <", value, "comgytypeid");
            return (Criteria) this;
        }

        public Criteria andComgytypeidLessThanOrEqualTo(Long value) {
            addCriterion("comgytypeid <=", value, "comgytypeid");
            return (Criteria) this;
        }

        public Criteria andComgytypeidIn(List<Long> values) {
            addCriterion("comgytypeid in", values, "comgytypeid");
            return (Criteria) this;
        }

        public Criteria andComgytypeidNotIn(List<Long> values) {
            addCriterion("comgytypeid not in", values, "comgytypeid");
            return (Criteria) this;
        }

        public Criteria andComgytypeidBetween(Long value1, Long value2) {
            addCriterion("comgytypeid between", value1, value2, "comgytypeid");
            return (Criteria) this;
        }

        public Criteria andComgytypeidNotBetween(Long value1, Long value2) {
            addCriterion("comgytypeid not between", value1, value2, "comgytypeid");
            return (Criteria) this;
        }

        public Criteria andComnameIsNull() {
            addCriterion("comname is null");
            return (Criteria) this;
        }

        public Criteria andComnameIsNotNull() {
            addCriterion("comname is not null");
            return (Criteria) this;
        }

        public Criteria andComnameEqualTo(String value) {
            addCriterion("comname =", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotEqualTo(String value) {
            addCriterion("comname <>", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThan(String value) {
            addCriterion("comname >", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThanOrEqualTo(String value) {
            addCriterion("comname >=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThan(String value) {
            addCriterion("comname <", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThanOrEqualTo(String value) {
            addCriterion("comname <=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLike(String value) {
            addCriterion("comname like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotLike(String value) {
            addCriterion("comname not like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameIn(List<String> values) {
            addCriterion("comname in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotIn(List<String> values) {
            addCriterion("comname not in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameBetween(String value1, String value2) {
            addCriterion("comname between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotBetween(String value1, String value2) {
            addCriterion("comname not between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andCommoneyIsNull() {
            addCriterion("commoney is null");
            return (Criteria) this;
        }

        public Criteria andCommoneyIsNotNull() {
            addCriterion("commoney is not null");
            return (Criteria) this;
        }

        public Criteria andCommoneyEqualTo(Long value) {
            addCriterion("commoney =", value, "commoney");
            return (Criteria) this;
        }

        public Criteria andCommoneyNotEqualTo(Long value) {
            addCriterion("commoney <>", value, "commoney");
            return (Criteria) this;
        }

        public Criteria andCommoneyGreaterThan(Long value) {
            addCriterion("commoney >", value, "commoney");
            return (Criteria) this;
        }

        public Criteria andCommoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("commoney >=", value, "commoney");
            return (Criteria) this;
        }

        public Criteria andCommoneyLessThan(Long value) {
            addCriterion("commoney <", value, "commoney");
            return (Criteria) this;
        }

        public Criteria andCommoneyLessThanOrEqualTo(Long value) {
            addCriterion("commoney <=", value, "commoney");
            return (Criteria) this;
        }

        public Criteria andCommoneyIn(List<Long> values) {
            addCriterion("commoney in", values, "commoney");
            return (Criteria) this;
        }

        public Criteria andCommoneyNotIn(List<Long> values) {
            addCriterion("commoney not in", values, "commoney");
            return (Criteria) this;
        }

        public Criteria andCommoneyBetween(Long value1, Long value2) {
            addCriterion("commoney between", value1, value2, "commoney");
            return (Criteria) this;
        }

        public Criteria andCommoneyNotBetween(Long value1, Long value2) {
            addCriterion("commoney not between", value1, value2, "commoney");
            return (Criteria) this;
        }

        public Criteria andComemailIsNull() {
            addCriterion("comemail is null");
            return (Criteria) this;
        }

        public Criteria andComemailIsNotNull() {
            addCriterion("comemail is not null");
            return (Criteria) this;
        }

        public Criteria andComemailEqualTo(String value) {
            addCriterion("comemail =", value, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailNotEqualTo(String value) {
            addCriterion("comemail <>", value, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailGreaterThan(String value) {
            addCriterion("comemail >", value, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailGreaterThanOrEqualTo(String value) {
            addCriterion("comemail >=", value, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailLessThan(String value) {
            addCriterion("comemail <", value, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailLessThanOrEqualTo(String value) {
            addCriterion("comemail <=", value, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailLike(String value) {
            addCriterion("comemail like", value, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailNotLike(String value) {
            addCriterion("comemail not like", value, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailIn(List<String> values) {
            addCriterion("comemail in", values, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailNotIn(List<String> values) {
            addCriterion("comemail not in", values, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailBetween(String value1, String value2) {
            addCriterion("comemail between", value1, value2, "comemail");
            return (Criteria) this;
        }

        public Criteria andComemailNotBetween(String value1, String value2) {
            addCriterion("comemail not between", value1, value2, "comemail");
            return (Criteria) this;
        }

        public Criteria andComweixinIsNull() {
            addCriterion("comweixin is null");
            return (Criteria) this;
        }

        public Criteria andComweixinIsNotNull() {
            addCriterion("comweixin is not null");
            return (Criteria) this;
        }

        public Criteria andComweixinEqualTo(String value) {
            addCriterion("comweixin =", value, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinNotEqualTo(String value) {
            addCriterion("comweixin <>", value, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinGreaterThan(String value) {
            addCriterion("comweixin >", value, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinGreaterThanOrEqualTo(String value) {
            addCriterion("comweixin >=", value, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinLessThan(String value) {
            addCriterion("comweixin <", value, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinLessThanOrEqualTo(String value) {
            addCriterion("comweixin <=", value, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinLike(String value) {
            addCriterion("comweixin like", value, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinNotLike(String value) {
            addCriterion("comweixin not like", value, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinIn(List<String> values) {
            addCriterion("comweixin in", values, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinNotIn(List<String> values) {
            addCriterion("comweixin not in", values, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinBetween(String value1, String value2) {
            addCriterion("comweixin between", value1, value2, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComweixinNotBetween(String value1, String value2) {
            addCriterion("comweixin not between", value1, value2, "comweixin");
            return (Criteria) this;
        }

        public Criteria andComqqIsNull() {
            addCriterion("comqq is null");
            return (Criteria) this;
        }

        public Criteria andComqqIsNotNull() {
            addCriterion("comqq is not null");
            return (Criteria) this;
        }

        public Criteria andComqqEqualTo(String value) {
            addCriterion("comqq =", value, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqNotEqualTo(String value) {
            addCriterion("comqq <>", value, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqGreaterThan(String value) {
            addCriterion("comqq >", value, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqGreaterThanOrEqualTo(String value) {
            addCriterion("comqq >=", value, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqLessThan(String value) {
            addCriterion("comqq <", value, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqLessThanOrEqualTo(String value) {
            addCriterion("comqq <=", value, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqLike(String value) {
            addCriterion("comqq like", value, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqNotLike(String value) {
            addCriterion("comqq not like", value, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqIn(List<String> values) {
            addCriterion("comqq in", values, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqNotIn(List<String> values) {
            addCriterion("comqq not in", values, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqBetween(String value1, String value2) {
            addCriterion("comqq between", value1, value2, "comqq");
            return (Criteria) this;
        }

        public Criteria andComqqNotBetween(String value1, String value2) {
            addCriterion("comqq not between", value1, value2, "comqq");
            return (Criteria) this;
        }

        public Criteria andCombankIsNull() {
            addCriterion("combank is null");
            return (Criteria) this;
        }

        public Criteria andCombankIsNotNull() {
            addCriterion("combank is not null");
            return (Criteria) this;
        }

        public Criteria andCombankEqualTo(String value) {
            addCriterion("combank =", value, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankNotEqualTo(String value) {
            addCriterion("combank <>", value, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankGreaterThan(String value) {
            addCriterion("combank >", value, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankGreaterThanOrEqualTo(String value) {
            addCriterion("combank >=", value, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankLessThan(String value) {
            addCriterion("combank <", value, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankLessThanOrEqualTo(String value) {
            addCriterion("combank <=", value, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankLike(String value) {
            addCriterion("combank like", value, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankNotLike(String value) {
            addCriterion("combank not like", value, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankIn(List<String> values) {
            addCriterion("combank in", values, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankNotIn(List<String> values) {
            addCriterion("combank not in", values, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankBetween(String value1, String value2) {
            addCriterion("combank between", value1, value2, "combank");
            return (Criteria) this;
        }

        public Criteria andCombankNotBetween(String value1, String value2) {
            addCriterion("combank not between", value1, value2, "combank");
            return (Criteria) this;
        }

        public Criteria andCompersoonIsNull() {
            addCriterion("compersoon is null");
            return (Criteria) this;
        }

        public Criteria andCompersoonIsNotNull() {
            addCriterion("compersoon is not null");
            return (Criteria) this;
        }

        public Criteria andCompersoonEqualTo(String value) {
            addCriterion("compersoon =", value, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonNotEqualTo(String value) {
            addCriterion("compersoon <>", value, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonGreaterThan(String value) {
            addCriterion("compersoon >", value, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonGreaterThanOrEqualTo(String value) {
            addCriterion("compersoon >=", value, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonLessThan(String value) {
            addCriterion("compersoon <", value, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonLessThanOrEqualTo(String value) {
            addCriterion("compersoon <=", value, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonLike(String value) {
            addCriterion("compersoon like", value, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonNotLike(String value) {
            addCriterion("compersoon not like", value, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonIn(List<String> values) {
            addCriterion("compersoon in", values, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonNotIn(List<String> values) {
            addCriterion("compersoon not in", values, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonBetween(String value1, String value2) {
            addCriterion("compersoon between", value1, value2, "compersoon");
            return (Criteria) this;
        }

        public Criteria andCompersoonNotBetween(String value1, String value2) {
            addCriterion("compersoon not between", value1, value2, "compersoon");
            return (Criteria) this;
        }

        public Criteria andComphoneIsNull() {
            addCriterion("comphone is null");
            return (Criteria) this;
        }

        public Criteria andComphoneIsNotNull() {
            addCriterion("comphone is not null");
            return (Criteria) this;
        }

        public Criteria andComphoneEqualTo(String value) {
            addCriterion("comphone =", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneNotEqualTo(String value) {
            addCriterion("comphone <>", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneGreaterThan(String value) {
            addCriterion("comphone >", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneGreaterThanOrEqualTo(String value) {
            addCriterion("comphone >=", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneLessThan(String value) {
            addCriterion("comphone <", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneLessThanOrEqualTo(String value) {
            addCriterion("comphone <=", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneLike(String value) {
            addCriterion("comphone like", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneNotLike(String value) {
            addCriterion("comphone not like", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneIn(List<String> values) {
            addCriterion("comphone in", values, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneNotIn(List<String> values) {
            addCriterion("comphone not in", values, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneBetween(String value1, String value2) {
            addCriterion("comphone between", value1, value2, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneNotBetween(String value1, String value2) {
            addCriterion("comphone not between", value1, value2, "comphone");
            return (Criteria) this;
        }

        public Criteria andComteleIsNull() {
            addCriterion("comtele is null");
            return (Criteria) this;
        }

        public Criteria andComteleIsNotNull() {
            addCriterion("comtele is not null");
            return (Criteria) this;
        }

        public Criteria andComteleEqualTo(String value) {
            addCriterion("comtele =", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleNotEqualTo(String value) {
            addCriterion("comtele <>", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleGreaterThan(String value) {
            addCriterion("comtele >", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleGreaterThanOrEqualTo(String value) {
            addCriterion("comtele >=", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleLessThan(String value) {
            addCriterion("comtele <", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleLessThanOrEqualTo(String value) {
            addCriterion("comtele <=", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleLike(String value) {
            addCriterion("comtele like", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleNotLike(String value) {
            addCriterion("comtele not like", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleIn(List<String> values) {
            addCriterion("comtele in", values, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleNotIn(List<String> values) {
            addCriterion("comtele not in", values, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleBetween(String value1, String value2) {
            addCriterion("comtele between", value1, value2, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleNotBetween(String value1, String value2) {
            addCriterion("comtele not between", value1, value2, "comtele");
            return (Criteria) this;
        }

        public Criteria andComidentityIsNull() {
            addCriterion("comidentity is null");
            return (Criteria) this;
        }

        public Criteria andComidentityIsNotNull() {
            addCriterion("comidentity is not null");
            return (Criteria) this;
        }

        public Criteria andComidentityEqualTo(String value) {
            addCriterion("comidentity =", value, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityNotEqualTo(String value) {
            addCriterion("comidentity <>", value, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityGreaterThan(String value) {
            addCriterion("comidentity >", value, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityGreaterThanOrEqualTo(String value) {
            addCriterion("comidentity >=", value, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityLessThan(String value) {
            addCriterion("comidentity <", value, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityLessThanOrEqualTo(String value) {
            addCriterion("comidentity <=", value, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityLike(String value) {
            addCriterion("comidentity like", value, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityNotLike(String value) {
            addCriterion("comidentity not like", value, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityIn(List<String> values) {
            addCriterion("comidentity in", values, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityNotIn(List<String> values) {
            addCriterion("comidentity not in", values, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityBetween(String value1, String value2) {
            addCriterion("comidentity between", value1, value2, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComidentityNotBetween(String value1, String value2) {
            addCriterion("comidentity not between", value1, value2, "comidentity");
            return (Criteria) this;
        }

        public Criteria andComaddrIsNull() {
            addCriterion("comaddr is null");
            return (Criteria) this;
        }

        public Criteria andComaddrIsNotNull() {
            addCriterion("comaddr is not null");
            return (Criteria) this;
        }

        public Criteria andComaddrEqualTo(String value) {
            addCriterion("comaddr =", value, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrNotEqualTo(String value) {
            addCriterion("comaddr <>", value, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrGreaterThan(String value) {
            addCriterion("comaddr >", value, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrGreaterThanOrEqualTo(String value) {
            addCriterion("comaddr >=", value, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrLessThan(String value) {
            addCriterion("comaddr <", value, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrLessThanOrEqualTo(String value) {
            addCriterion("comaddr <=", value, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrLike(String value) {
            addCriterion("comaddr like", value, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrNotLike(String value) {
            addCriterion("comaddr not like", value, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrIn(List<String> values) {
            addCriterion("comaddr in", values, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrNotIn(List<String> values) {
            addCriterion("comaddr not in", values, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrBetween(String value1, String value2) {
            addCriterion("comaddr between", value1, value2, "comaddr");
            return (Criteria) this;
        }

        public Criteria andComaddrNotBetween(String value1, String value2) {
            addCriterion("comaddr not between", value1, value2, "comaddr");
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