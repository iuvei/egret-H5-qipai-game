package com.idealighter.game.app.gold.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TransferMoneyGoldLogDto {

  private Integer id;

  private String orderNo;

  private Long price;

  private Long beforeBalance;

  private Long afterBalance;

  private Long beforeSafeGold;

  private Long afterSafeGold;

  private Byte flag;

  private Long playerId;

  private Long superId;


  private String playerName;


  private Boolean isPlayer;


  private String userName;


  private Integer level;

  private Long actionId;

  private Date time;
  
  private String channelId;
}
