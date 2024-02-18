package com.idealighter.game.dao.data.po;

import java.util.ArrayList;
import java.util.List;

public class PlayerSafeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PlayerSafeInfoExample() {
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

        public Criteria andPlayerIdIsNull() {
            addCriterion("player_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNotNull() {
            addCriterion("player_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdEqualTo(Long value) {
            addCriterion("player_id =", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotEqualTo(Long value) {
            addCriterion("player_id <>", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThan(Long value) {
            addCriterion("player_id >", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("player_id >=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThan(Long value) {
            addCriterion("player_id <", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThanOrEqualTo(Long value) {
            addCriterion("player_id <=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIn(List<Long> values) {
            addCriterion("player_id in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotIn(List<Long> values) {
            addCriterion("player_id not in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdBetween(Long value1, Long value2) {
            addCriterion("player_id between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotBetween(Long value1, Long value2) {
            addCriterion("player_id not between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneIsNull() {
            addCriterion("validate_phone is null");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneIsNotNull() {
            addCriterion("validate_phone is not null");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneEqualTo(Boolean value) {
            addCriterion("validate_phone =", value, "validatePhone");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneNotEqualTo(Boolean value) {
            addCriterion("validate_phone <>", value, "validatePhone");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneGreaterThan(Boolean value) {
            addCriterion("validate_phone >", value, "validatePhone");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneGreaterThanOrEqualTo(Boolean value) {
            addCriterion("validate_phone >=", value, "validatePhone");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneLessThan(Boolean value) {
            addCriterion("validate_phone <", value, "validatePhone");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneLessThanOrEqualTo(Boolean value) {
            addCriterion("validate_phone <=", value, "validatePhone");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneIn(List<Boolean> values) {
            addCriterion("validate_phone in", values, "validatePhone");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneNotIn(List<Boolean> values) {
            addCriterion("validate_phone not in", values, "validatePhone");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneBetween(Boolean value1, Boolean value2) {
            addCriterion("validate_phone between", value1, value2, "validatePhone");
            return (Criteria) this;
        }

        public Criteria andValidatePhoneNotBetween(Boolean value1, Boolean value2) {
            addCriterion("validate_phone not between", value1, value2, "validatePhone");
            return (Criteria) this;
        }

        public Criteria andValidateEmailIsNull() {
            addCriterion("validate_email is null");
            return (Criteria) this;
        }

        public Criteria andValidateEmailIsNotNull() {
            addCriterion("validate_email is not null");
            return (Criteria) this;
        }

        public Criteria andValidateEmailEqualTo(Boolean value) {
            addCriterion("validate_email =", value, "validateEmail");
            return (Criteria) this;
        }

        public Criteria andValidateEmailNotEqualTo(Boolean value) {
            addCriterion("validate_email <>", value, "validateEmail");
            return (Criteria) this;
        }

        public Criteria andValidateEmailGreaterThan(Boolean value) {
            addCriterion("validate_email >", value, "validateEmail");
            return (Criteria) this;
        }

        public Criteria andValidateEmailGreaterThanOrEqualTo(Boolean value) {
            addCriterion("validate_email >=", value, "validateEmail");
            return (Criteria) this;
        }

        public Criteria andValidateEmailLessThan(Boolean value) {
            addCriterion("validate_email <", value, "validateEmail");
            return (Criteria) this;
        }

        public Criteria andValidateEmailLessThanOrEqualTo(Boolean value) {
            addCriterion("validate_email <=", value, "validateEmail");
            return (Criteria) this;
        }

        public Criteria andValidateEmailIn(List<Boolean> values) {
            addCriterion("validate_email in", values, "validateEmail");
            return (Criteria) this;
        }

        public Criteria andValidateEmailNotIn(List<Boolean> values) {
            addCriterion("validate_email not in", values, "validateEmail");
            return (Criteria) this;
        }

        public Criteria andValidateEmailBetween(Boolean value1, Boolean value2) {
            addCriterion("validate_email between", value1, value2, "validateEmail");
            return (Criteria) this;
        }

        public Criteria andValidateEmailNotBetween(Boolean value1, Boolean value2) {
            addCriterion("validate_email not between", value1, value2, "validateEmail");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQIsNull() {
            addCriterion("first_pwd_protect_q is null");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQIsNotNull() {
            addCriterion("first_pwd_protect_q is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQEqualTo(String value) {
            addCriterion("first_pwd_protect_q =", value, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQNotEqualTo(String value) {
            addCriterion("first_pwd_protect_q <>", value, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQGreaterThan(String value) {
            addCriterion("first_pwd_protect_q >", value, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQGreaterThanOrEqualTo(String value) {
            addCriterion("first_pwd_protect_q >=", value, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQLessThan(String value) {
            addCriterion("first_pwd_protect_q <", value, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQLessThanOrEqualTo(String value) {
            addCriterion("first_pwd_protect_q <=", value, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQLike(String value) {
            addCriterion("first_pwd_protect_q like", value, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQNotLike(String value) {
            addCriterion("first_pwd_protect_q not like", value, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQIn(List<String> values) {
            addCriterion("first_pwd_protect_q in", values, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQNotIn(List<String> values) {
            addCriterion("first_pwd_protect_q not in", values, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQBetween(String value1, String value2) {
            addCriterion("first_pwd_protect_q between", value1, value2, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectQNotBetween(String value1, String value2) {
            addCriterion("first_pwd_protect_q not between", value1, value2, "firstPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectAIsNull() {
            addCriterion("first_pwd_protect_a is null");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectAIsNotNull() {
            addCriterion("first_pwd_protect_a is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectAEqualTo(String value) {
            addCriterion("first_pwd_protect_a =", value, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectANotEqualTo(String value) {
            addCriterion("first_pwd_protect_a <>", value, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectAGreaterThan(String value) {
            addCriterion("first_pwd_protect_a >", value, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectAGreaterThanOrEqualTo(String value) {
            addCriterion("first_pwd_protect_a >=", value, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectALessThan(String value) {
            addCriterion("first_pwd_protect_a <", value, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectALessThanOrEqualTo(String value) {
            addCriterion("first_pwd_protect_a <=", value, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectALike(String value) {
            addCriterion("first_pwd_protect_a like", value, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectANotLike(String value) {
            addCriterion("first_pwd_protect_a not like", value, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectAIn(List<String> values) {
            addCriterion("first_pwd_protect_a in", values, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectANotIn(List<String> values) {
            addCriterion("first_pwd_protect_a not in", values, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectABetween(String value1, String value2) {
            addCriterion("first_pwd_protect_a between", value1, value2, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andFirstPwdProtectANotBetween(String value1, String value2) {
            addCriterion("first_pwd_protect_a not between", value1, value2, "firstPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQIsNull() {
            addCriterion("second_pwd_protect_q is null");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQIsNotNull() {
            addCriterion("second_pwd_protect_q is not null");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQEqualTo(String value) {
            addCriterion("second_pwd_protect_q =", value, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQNotEqualTo(String value) {
            addCriterion("second_pwd_protect_q <>", value, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQGreaterThan(String value) {
            addCriterion("second_pwd_protect_q >", value, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQGreaterThanOrEqualTo(String value) {
            addCriterion("second_pwd_protect_q >=", value, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQLessThan(String value) {
            addCriterion("second_pwd_protect_q <", value, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQLessThanOrEqualTo(String value) {
            addCriterion("second_pwd_protect_q <=", value, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQLike(String value) {
            addCriterion("second_pwd_protect_q like", value, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQNotLike(String value) {
            addCriterion("second_pwd_protect_q not like", value, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQIn(List<String> values) {
            addCriterion("second_pwd_protect_q in", values, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQNotIn(List<String> values) {
            addCriterion("second_pwd_protect_q not in", values, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQBetween(String value1, String value2) {
            addCriterion("second_pwd_protect_q between", value1, value2, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectQNotBetween(String value1, String value2) {
            addCriterion("second_pwd_protect_q not between", value1, value2, "secondPwdProtectQ");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectAIsNull() {
            addCriterion("second_pwd_protect_a is null");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectAIsNotNull() {
            addCriterion("second_pwd_protect_a is not null");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectAEqualTo(String value) {
            addCriterion("second_pwd_protect_a =", value, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectANotEqualTo(String value) {
            addCriterion("second_pwd_protect_a <>", value, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectAGreaterThan(String value) {
            addCriterion("second_pwd_protect_a >", value, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectAGreaterThanOrEqualTo(String value) {
            addCriterion("second_pwd_protect_a >=", value, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectALessThan(String value) {
            addCriterion("second_pwd_protect_a <", value, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectALessThanOrEqualTo(String value) {
            addCriterion("second_pwd_protect_a <=", value, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectALike(String value) {
            addCriterion("second_pwd_protect_a like", value, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectANotLike(String value) {
            addCriterion("second_pwd_protect_a not like", value, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectAIn(List<String> values) {
            addCriterion("second_pwd_protect_a in", values, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectANotIn(List<String> values) {
            addCriterion("second_pwd_protect_a not in", values, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectABetween(String value1, String value2) {
            addCriterion("second_pwd_protect_a between", value1, value2, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andSecondPwdProtectANotBetween(String value1, String value2) {
            addCriterion("second_pwd_protect_a not between", value1, value2, "secondPwdProtectA");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyIsNull() {
            addCriterion("login_phone_verify is null");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyIsNotNull() {
            addCriterion("login_phone_verify is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyEqualTo(Boolean value) {
            addCriterion("login_phone_verify =", value, "loginPhoneVerify");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyNotEqualTo(Boolean value) {
            addCriterion("login_phone_verify <>", value, "loginPhoneVerify");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyGreaterThan(Boolean value) {
            addCriterion("login_phone_verify >", value, "loginPhoneVerify");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("login_phone_verify >=", value, "loginPhoneVerify");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyLessThan(Boolean value) {
            addCriterion("login_phone_verify <", value, "loginPhoneVerify");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyLessThanOrEqualTo(Boolean value) {
            addCriterion("login_phone_verify <=", value, "loginPhoneVerify");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyIn(List<Boolean> values) {
            addCriterion("login_phone_verify in", values, "loginPhoneVerify");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyNotIn(List<Boolean> values) {
            addCriterion("login_phone_verify not in", values, "loginPhoneVerify");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyBetween(Boolean value1, Boolean value2) {
            addCriterion("login_phone_verify between", value1, value2, "loginPhoneVerify");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneVerifyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("login_phone_verify not between", value1, value2, "loginPhoneVerify");
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