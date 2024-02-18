package com.idealighter.game.dao.dic.po;

import java.util.ArrayList;
import java.util.List;

public class JcbyScenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public JcbyScenceExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andStrategysIsNull() {
            addCriterion("strategys is null");
            return (Criteria) this;
        }

        public Criteria andStrategysIsNotNull() {
            addCriterion("strategys is not null");
            return (Criteria) this;
        }

        public Criteria andStrategysEqualTo(String value) {
            addCriterion("strategys =", value, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysNotEqualTo(String value) {
            addCriterion("strategys <>", value, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysGreaterThan(String value) {
            addCriterion("strategys >", value, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysGreaterThanOrEqualTo(String value) {
            addCriterion("strategys >=", value, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysLessThan(String value) {
            addCriterion("strategys <", value, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysLessThanOrEqualTo(String value) {
            addCriterion("strategys <=", value, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysLike(String value) {
            addCriterion("strategys like", value, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysNotLike(String value) {
            addCriterion("strategys not like", value, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysIn(List<String> values) {
            addCriterion("strategys in", values, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysNotIn(List<String> values) {
            addCriterion("strategys not in", values, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysBetween(String value1, String value2) {
            addCriterion("strategys between", value1, value2, "strategys");
            return (Criteria) this;
        }

        public Criteria andStrategysNotBetween(String value1, String value2) {
            addCriterion("strategys not between", value1, value2, "strategys");
            return (Criteria) this;
        }

        public Criteria andLifeTimeIsNull() {
            addCriterion("lifeTime is null");
            return (Criteria) this;
        }

        public Criteria andLifeTimeIsNotNull() {
            addCriterion("lifeTime is not null");
            return (Criteria) this;
        }

        public Criteria andLifeTimeEqualTo(Integer value) {
            addCriterion("lifeTime =", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeNotEqualTo(Integer value) {
            addCriterion("lifeTime <>", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeGreaterThan(Integer value) {
            addCriterion("lifeTime >", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lifeTime >=", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeLessThan(Integer value) {
            addCriterion("lifeTime <", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("lifeTime <=", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeIn(List<Integer> values) {
            addCriterion("lifeTime in", values, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeNotIn(List<Integer> values) {
            addCriterion("lifeTime not in", values, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeBetween(Integer value1, Integer value2) {
            addCriterion("lifeTime between", value1, value2, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lifeTime not between", value1, value2, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     */
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