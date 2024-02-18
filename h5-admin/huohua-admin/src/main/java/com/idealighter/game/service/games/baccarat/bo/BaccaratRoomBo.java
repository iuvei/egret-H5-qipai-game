package com.idealighter.game.service.games.baccarat.bo;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class BaccaratRoomBo {
  private Integer id;

  /**
   * 房间名称.
   */
  private String name;

  /**
   * 房间类型.
   */
  private Integer type;

  /**
   * 房间最大人数.
   */
  private Integer maxNum;

  /**
   * 进入下限.
   */
  private Integer lower;

  /**
   * 进入上限.
   */
  private Integer upper;

  /**
   * 普通玩家进入人数百分比.
   */
  private Integer ordinarPeople;

  // 机器人占百分比
  private Integer robotRatio;

  /**
   * 金币与筹码比例（金币）.
   */
  private Integer proportionGold;

  /**
   * 金币与筹码比例（筹码）.
   */
  private Integer proportionChips;

  /**
   * 桌子数.
   */
  private Integer tableNum;

  /**
   * 每桌椅子数.
   */
  private Integer chair;

  /**
   * 单局台费（筹码）.
   */
  private Integer afee;

  /**
   * 进入类型（0点击入座，1自动分配）.
   */
  private Integer inType;

  /**
   * 状态(0:关闭,1:开启).
   */
  private Byte isActive;

  /**
   * 创建时间.
   */
  private Date timeCreate;

  /**
   * 开启时间.
   */
  private Date timeOpen;
  
  private List<Long> betOptions;
}
