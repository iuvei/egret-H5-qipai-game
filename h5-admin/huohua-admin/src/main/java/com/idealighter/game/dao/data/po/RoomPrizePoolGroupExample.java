package com.idealighter.game.dao.data.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomPrizePoolGroupExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  private Integer limit;

  private Integer offset;

  public RoomPrizePoolGroupExample() {
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

    public Criteria andGameIsNull() {
      addCriterion("game is null");
      return (Criteria) this;
    }

    public Criteria andGameIsNotNull() {
      addCriterion("game is not null");
      return (Criteria) this;
    }

    public Criteria andGameEqualTo(Integer value) {
      addCriterion("game =", value, "game");
      return (Criteria) this;
    }

    public Criteria andGameNotEqualTo(Integer value) {
      addCriterion("game <>", value, "game");
      return (Criteria) this;
    }

    public Criteria andGameGreaterThan(Integer value) {
      addCriterion("game >", value, "game");
      return (Criteria) this;
    }

    public Criteria andGameGreaterThanOrEqualTo(Integer value) {
      addCriterion("game >=", value, "game");
      return (Criteria) this;
    }

    public Criteria andGameLessThan(Integer value) {
      addCriterion("game <", value, "game");
      return (Criteria) this;
    }

    public Criteria andGameLessThanOrEqualTo(Integer value) {
      addCriterion("game <=", value, "game");
      return (Criteria) this;
    }

    public Criteria andGameIn(List<Integer> values) {
      addCriterion("game in", values, "game");
      return (Criteria) this;
    }

    public Criteria andGameNotIn(List<Integer> values) {
      addCriterion("game not in", values, "game");
      return (Criteria) this;
    }

    public Criteria andGameBetween(Integer value1, Integer value2) {
      addCriterion("game between", value1, value2, "game");
      return (Criteria) this;
    }

    public Criteria andGameNotBetween(Integer value1, Integer value2) {
      addCriterion("game not between", value1, value2, "game");
      return (Criteria) this;
    }

    public Criteria andRoomIdIsNull() {
      addCriterion("room_id is null");
      return (Criteria) this;
    }

    public Criteria andRoomIdIsNotNull() {
      addCriterion("room_id is not null");
      return (Criteria) this;
    }

    public Criteria andRoomIdEqualTo(Integer value) {
      addCriterion("room_id =", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdNotEqualTo(Integer value) {
      addCriterion("room_id <>", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdGreaterThan(Integer value) {
      addCriterion("room_id >", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("room_id >=", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdLessThan(Integer value) {
      addCriterion("room_id <", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
      addCriterion("room_id <=", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdIn(List<Integer> values) {
      addCriterion("room_id in", values, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdNotIn(List<Integer> values) {
      addCriterion("room_id not in", values, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdBetween(Integer value1, Integer value2) {
      addCriterion("room_id between", value1, value2, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
      addCriterion("room_id not between", value1, value2, "roomId");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolIsNull() {
      addCriterion("default_prize_pool is null");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolIsNotNull() {
      addCriterion("default_prize_pool is not null");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolEqualTo(String value) {
      addCriterion("default_prize_pool =", value, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolNotEqualTo(String value) {
      addCriterion("default_prize_pool <>", value, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolGreaterThan(String value) {
      addCriterion("default_prize_pool >", value, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolGreaterThanOrEqualTo(String value) {
      addCriterion("default_prize_pool >=", value, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolLessThan(String value) {
      addCriterion("default_prize_pool <", value, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolLessThanOrEqualTo(String value) {
      addCriterion("default_prize_pool <=", value, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolLike(String value) {
      addCriterion("default_prize_pool like", value, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolNotLike(String value) {
      addCriterion("default_prize_pool not like", value, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolIn(List<String> values) {
      addCriterion("default_prize_pool in", values, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolNotIn(List<String> values) {
      addCriterion("default_prize_pool not in", values, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolBetween(String value1, String value2) {
      addCriterion("default_prize_pool between", value1, value2, "defaultPrizePool");
      return (Criteria) this;
    }

    public Criteria andDefaultPrizePoolNotBetween(String value1, String value2) {
      addCriterion("default_prize_pool not between", value1, value2, "defaultPrizePool");
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

    public Criteria andUpdateTimeIsNull() {
      addCriterion("update_time is null");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIsNotNull() {
      addCriterion("update_time is not null");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeEqualTo(Date value) {
      addCriterion("update_time =", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotEqualTo(Date value) {
      addCriterion("update_time <>", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeGreaterThan(Date value) {
      addCriterion("update_time >", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("update_time >=", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeLessThan(Date value) {
      addCriterion("update_time <", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
      addCriterion("update_time <=", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIn(List<Date> values) {
      addCriterion("update_time in", values, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotIn(List<Date> values) {
      addCriterion("update_time not in", values, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeBetween(Date value1, Date value2) {
      addCriterion("update_time between", value1, value2, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
      addCriterion("update_time not between", value1, value2, "updateTime");
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
