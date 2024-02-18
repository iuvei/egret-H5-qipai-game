package com.idealighter.game.dao.data.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransferGoldRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TransferGoldRecordExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeIsNull() {
            addCriterion("opposite_type is null");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeIsNotNull() {
            addCriterion("opposite_type is not null");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeEqualTo(Byte value) {
            addCriterion("opposite_type =", value, "oppositeType");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeNotEqualTo(Byte value) {
            addCriterion("opposite_type <>", value, "oppositeType");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeGreaterThan(Byte value) {
            addCriterion("opposite_type >", value, "oppositeType");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("opposite_type >=", value, "oppositeType");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeLessThan(Byte value) {
            addCriterion("opposite_type <", value, "oppositeType");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeLessThanOrEqualTo(Byte value) {
            addCriterion("opposite_type <=", value, "oppositeType");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeIn(List<Byte> values) {
            addCriterion("opposite_type in", values, "oppositeType");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeNotIn(List<Byte> values) {
            addCriterion("opposite_type not in", values, "oppositeType");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeBetween(Byte value1, Byte value2) {
            addCriterion("opposite_type between", value1, value2, "oppositeType");
            return (Criteria) this;
        }

        public Criteria andOppositeTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("opposite_type not between", value1, value2, "oppositeType");
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

        public Criteria andPlayerSuperIdIsNull() {
            addCriterion("player_super_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdIsNotNull() {
            addCriterion("player_super_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdEqualTo(Long value) {
            addCriterion("player_super_id =", value, "playerSuperId");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdNotEqualTo(Long value) {
            addCriterion("player_super_id <>", value, "playerSuperId");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdGreaterThan(Long value) {
            addCriterion("player_super_id >", value, "playerSuperId");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("player_super_id >=", value, "playerSuperId");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdLessThan(Long value) {
            addCriterion("player_super_id <", value, "playerSuperId");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdLessThanOrEqualTo(Long value) {
            addCriterion("player_super_id <=", value, "playerSuperId");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdIn(List<Long> values) {
            addCriterion("player_super_id in", values, "playerSuperId");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdNotIn(List<Long> values) {
            addCriterion("player_super_id not in", values, "playerSuperId");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdBetween(Long value1, Long value2) {
            addCriterion("player_super_id between", value1, value2, "playerSuperId");
            return (Criteria) this;
        }

        public Criteria andPlayerSuperIdNotBetween(Long value1, Long value2) {
            addCriterion("player_super_id not between", value1, value2, "playerSuperId");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNull() {
            addCriterion("player_name is null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNotNull() {
            addCriterion("player_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameEqualTo(String value) {
            addCriterion("player_name =", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotEqualTo(String value) {
            addCriterion("player_name <>", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThan(String value) {
            addCriterion("player_name >", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("player_name >=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThan(String value) {
            addCriterion("player_name <", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThanOrEqualTo(String value) {
            addCriterion("player_name <=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLike(String value) {
            addCriterion("player_name like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotLike(String value) {
            addCriterion("player_name not like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIn(List<String> values) {
            addCriterion("player_name in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotIn(List<String> values) {
            addCriterion("player_name not in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameBetween(String value1, String value2) {
            addCriterion("player_name between", value1, value2, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotBetween(String value1, String value2) {
            addCriterion("player_name not between", value1, value2, "playerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdIsNull() {
            addCriterion("opposite_player_id is null");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdIsNotNull() {
            addCriterion("opposite_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdEqualTo(Long value) {
            addCriterion("opposite_player_id =", value, "oppositePlayerId");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdNotEqualTo(Long value) {
            addCriterion("opposite_player_id <>", value, "oppositePlayerId");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdGreaterThan(Long value) {
            addCriterion("opposite_player_id >", value, "oppositePlayerId");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("opposite_player_id >=", value, "oppositePlayerId");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdLessThan(Long value) {
            addCriterion("opposite_player_id <", value, "oppositePlayerId");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdLessThanOrEqualTo(Long value) {
            addCriterion("opposite_player_id <=", value, "oppositePlayerId");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdIn(List<Long> values) {
            addCriterion("opposite_player_id in", values, "oppositePlayerId");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdNotIn(List<Long> values) {
            addCriterion("opposite_player_id not in", values, "oppositePlayerId");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdBetween(Long value1, Long value2) {
            addCriterion("opposite_player_id between", value1, value2, "oppositePlayerId");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerIdNotBetween(Long value1, Long value2) {
            addCriterion("opposite_player_id not between", value1, value2, "oppositePlayerId");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdIsNull() {
            addCriterion("opposite_super_id is null");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdIsNotNull() {
            addCriterion("opposite_super_id is not null");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdEqualTo(Long value) {
            addCriterion("opposite_super_id =", value, "oppositeSuperId");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdNotEqualTo(Long value) {
            addCriterion("opposite_super_id <>", value, "oppositeSuperId");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdGreaterThan(Long value) {
            addCriterion("opposite_super_id >", value, "oppositeSuperId");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("opposite_super_id >=", value, "oppositeSuperId");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdLessThan(Long value) {
            addCriterion("opposite_super_id <", value, "oppositeSuperId");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdLessThanOrEqualTo(Long value) {
            addCriterion("opposite_super_id <=", value, "oppositeSuperId");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdIn(List<Long> values) {
            addCriterion("opposite_super_id in", values, "oppositeSuperId");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdNotIn(List<Long> values) {
            addCriterion("opposite_super_id not in", values, "oppositeSuperId");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdBetween(Long value1, Long value2) {
            addCriterion("opposite_super_id between", value1, value2, "oppositeSuperId");
            return (Criteria) this;
        }

        public Criteria andOppositeSuperIdNotBetween(Long value1, Long value2) {
            addCriterion("opposite_super_id not between", value1, value2, "oppositeSuperId");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameIsNull() {
            addCriterion("opposite_player_name is null");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameIsNotNull() {
            addCriterion("opposite_player_name is not null");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameEqualTo(String value) {
            addCriterion("opposite_player_name =", value, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameNotEqualTo(String value) {
            addCriterion("opposite_player_name <>", value, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameGreaterThan(String value) {
            addCriterion("opposite_player_name >", value, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("opposite_player_name >=", value, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameLessThan(String value) {
            addCriterion("opposite_player_name <", value, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameLessThanOrEqualTo(String value) {
            addCriterion("opposite_player_name <=", value, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameLike(String value) {
            addCriterion("opposite_player_name like", value, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameNotLike(String value) {
            addCriterion("opposite_player_name not like", value, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameIn(List<String> values) {
            addCriterion("opposite_player_name in", values, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameNotIn(List<String> values) {
            addCriterion("opposite_player_name not in", values, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameBetween(String value1, String value2) {
            addCriterion("opposite_player_name between", value1, value2, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andOppositePlayerNameNotBetween(String value1, String value2) {
            addCriterion("opposite_player_name not between", value1, value2, "oppositePlayerName");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldIsNull() {
            addCriterion("before_safe_gold is null");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldIsNotNull() {
            addCriterion("before_safe_gold is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldEqualTo(Long value) {
            addCriterion("before_safe_gold =", value, "beforeSafeGold");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldNotEqualTo(Long value) {
            addCriterion("before_safe_gold <>", value, "beforeSafeGold");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldGreaterThan(Long value) {
            addCriterion("before_safe_gold >", value, "beforeSafeGold");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldGreaterThanOrEqualTo(Long value) {
            addCriterion("before_safe_gold >=", value, "beforeSafeGold");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldLessThan(Long value) {
            addCriterion("before_safe_gold <", value, "beforeSafeGold");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldLessThanOrEqualTo(Long value) {
            addCriterion("before_safe_gold <=", value, "beforeSafeGold");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldIn(List<Long> values) {
            addCriterion("before_safe_gold in", values, "beforeSafeGold");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldNotIn(List<Long> values) {
            addCriterion("before_safe_gold not in", values, "beforeSafeGold");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldBetween(Long value1, Long value2) {
            addCriterion("before_safe_gold between", value1, value2, "beforeSafeGold");
            return (Criteria) this;
        }

        public Criteria andBeforeSafeGoldNotBetween(Long value1, Long value2) {
            addCriterion("before_safe_gold not between", value1, value2, "beforeSafeGold");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldIsNull() {
            addCriterion("after_safe_gold is null");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldIsNotNull() {
            addCriterion("after_safe_gold is not null");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldEqualTo(Long value) {
            addCriterion("after_safe_gold =", value, "afterSafeGold");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldNotEqualTo(Long value) {
            addCriterion("after_safe_gold <>", value, "afterSafeGold");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldGreaterThan(Long value) {
            addCriterion("after_safe_gold >", value, "afterSafeGold");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldGreaterThanOrEqualTo(Long value) {
            addCriterion("after_safe_gold >=", value, "afterSafeGold");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldLessThan(Long value) {
            addCriterion("after_safe_gold <", value, "afterSafeGold");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldLessThanOrEqualTo(Long value) {
            addCriterion("after_safe_gold <=", value, "afterSafeGold");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldIn(List<Long> values) {
            addCriterion("after_safe_gold in", values, "afterSafeGold");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldNotIn(List<Long> values) {
            addCriterion("after_safe_gold not in", values, "afterSafeGold");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldBetween(Long value1, Long value2) {
            addCriterion("after_safe_gold between", value1, value2, "afterSafeGold");
            return (Criteria) this;
        }

        public Criteria andAfterSafeGoldNotBetween(Long value1, Long value2) {
            addCriterion("after_safe_gold not between", value1, value2, "afterSafeGold");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(Long value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(Long value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(Long value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(Long value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(Long value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<Long> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<Long> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(Long value1, Long value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(Long value1, Long value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeRateIsNull() {
            addCriterion("fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andFeeRateIsNotNull() {
            addCriterion("fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRateEqualTo(Integer value) {
            addCriterion("fee_rate =", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotEqualTo(Integer value) {
            addCriterion("fee_rate <>", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateGreaterThan(Integer value) {
            addCriterion("fee_rate >", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_rate >=", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateLessThan(Integer value) {
            addCriterion("fee_rate <", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateLessThanOrEqualTo(Integer value) {
            addCriterion("fee_rate <=", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateIn(List<Integer> values) {
            addCriterion("fee_rate in", values, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotIn(List<Integer> values) {
            addCriterion("fee_rate not in", values, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateBetween(Integer value1, Integer value2) {
            addCriterion("fee_rate between", value1, value2, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_rate not between", value1, value2, "feeRate");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldIsNull() {
            addCriterion("change_safe_gold is null");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldIsNotNull() {
            addCriterion("change_safe_gold is not null");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldEqualTo(Long value) {
            addCriterion("change_safe_gold =", value, "changeSafeGold");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldNotEqualTo(Long value) {
            addCriterion("change_safe_gold <>", value, "changeSafeGold");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldGreaterThan(Long value) {
            addCriterion("change_safe_gold >", value, "changeSafeGold");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldGreaterThanOrEqualTo(Long value) {
            addCriterion("change_safe_gold >=", value, "changeSafeGold");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldLessThan(Long value) {
            addCriterion("change_safe_gold <", value, "changeSafeGold");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldLessThanOrEqualTo(Long value) {
            addCriterion("change_safe_gold <=", value, "changeSafeGold");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldIn(List<Long> values) {
            addCriterion("change_safe_gold in", values, "changeSafeGold");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldNotIn(List<Long> values) {
            addCriterion("change_safe_gold not in", values, "changeSafeGold");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldBetween(Long value1, Long value2) {
            addCriterion("change_safe_gold between", value1, value2, "changeSafeGold");
            return (Criteria) this;
        }

        public Criteria andChangeSafeGoldNotBetween(Long value1, Long value2) {
            addCriterion("change_safe_gold not between", value1, value2, "changeSafeGold");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeIsNull() {
            addCriterion("player_type is null");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeIsNotNull() {
            addCriterion("player_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeEqualTo(Byte value) {
            addCriterion("player_type =", value, "playerType");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeNotEqualTo(Byte value) {
            addCriterion("player_type <>", value, "playerType");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeGreaterThan(Byte value) {
            addCriterion("player_type >", value, "playerType");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("player_type >=", value, "playerType");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeLessThan(Byte value) {
            addCriterion("player_type <", value, "playerType");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("player_type <=", value, "playerType");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeIn(List<Byte> values) {
            addCriterion("player_type in", values, "playerType");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeNotIn(List<Byte> values) {
            addCriterion("player_type not in", values, "playerType");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeBetween(Byte value1, Byte value2) {
            addCriterion("player_type between", value1, value2, "playerType");
            return (Criteria) this;
        }

        public Criteria andPlayerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("player_type not between", value1, value2, "playerType");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("channel_id like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("channel_id not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
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