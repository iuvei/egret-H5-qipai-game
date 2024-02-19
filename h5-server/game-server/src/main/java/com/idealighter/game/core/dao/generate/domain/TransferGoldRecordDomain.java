package com.idealighter.game.core.dao.generate.domain;

import java.io.Serializable;
import java.util.Date;

public class TransferGoldRecordDomain implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.type
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.opposite_type
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Byte oppositeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.player_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Long playerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.player_super_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Long playerSuperId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.player_name
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private String playerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.opposite_player_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Long oppositePlayerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.opposite_super_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Long oppositeSuperId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.opposite_player_name
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private String oppositePlayerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.before_safe_gold
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Long beforeSafeGold;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.after_safe_gold
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Long afterSafeGold;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.fee
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Long fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.fee_rate
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Integer feeRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.change_safe_gold
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Long changeSafeGold;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.create_time
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.player_type
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private Byte playerType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transfer_gold_record.channel_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private String channelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transfer_gold_record
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.id
     *
     * @return the value of transfer_gold_record.id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.id
     *
     * @param id the value for transfer_gold_record.id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.type
     *
     * @return the value of transfer_gold_record.type
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.type
     *
     * @param type the value for transfer_gold_record.type
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.opposite_type
     *
     * @return the value of transfer_gold_record.opposite_type
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Byte getOppositeType() {
        return oppositeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.opposite_type
     *
     * @param oppositeType the value for transfer_gold_record.opposite_type
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setOppositeType(Byte oppositeType) {
        this.oppositeType = oppositeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.player_id
     *
     * @return the value of transfer_gold_record.player_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Long getPlayerId() {
        return playerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.player_id
     *
     * @param playerId the value for transfer_gold_record.player_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.player_super_id
     *
     * @return the value of transfer_gold_record.player_super_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Long getPlayerSuperId() {
        return playerSuperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.player_super_id
     *
     * @param playerSuperId the value for transfer_gold_record.player_super_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setPlayerSuperId(Long playerSuperId) {
        this.playerSuperId = playerSuperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.player_name
     *
     * @return the value of transfer_gold_record.player_name
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.player_name
     *
     * @param playerName the value for transfer_gold_record.player_name
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.opposite_player_id
     *
     * @return the value of transfer_gold_record.opposite_player_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Long getOppositePlayerId() {
        return oppositePlayerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.opposite_player_id
     *
     * @param oppositePlayerId the value for transfer_gold_record.opposite_player_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setOppositePlayerId(Long oppositePlayerId) {
        this.oppositePlayerId = oppositePlayerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.opposite_super_id
     *
     * @return the value of transfer_gold_record.opposite_super_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Long getOppositeSuperId() {
        return oppositeSuperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.opposite_super_id
     *
     * @param oppositeSuperId the value for transfer_gold_record.opposite_super_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setOppositeSuperId(Long oppositeSuperId) {
        this.oppositeSuperId = oppositeSuperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.opposite_player_name
     *
     * @return the value of transfer_gold_record.opposite_player_name
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public String getOppositePlayerName() {
        return oppositePlayerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.opposite_player_name
     *
     * @param oppositePlayerName the value for transfer_gold_record.opposite_player_name
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setOppositePlayerName(String oppositePlayerName) {
        this.oppositePlayerName = oppositePlayerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.before_safe_gold
     *
     * @return the value of transfer_gold_record.before_safe_gold
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Long getBeforeSafeGold() {
        return beforeSafeGold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.before_safe_gold
     *
     * @param beforeSafeGold the value for transfer_gold_record.before_safe_gold
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setBeforeSafeGold(Long beforeSafeGold) {
        this.beforeSafeGold = beforeSafeGold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.after_safe_gold
     *
     * @return the value of transfer_gold_record.after_safe_gold
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Long getAfterSafeGold() {
        return afterSafeGold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.after_safe_gold
     *
     * @param afterSafeGold the value for transfer_gold_record.after_safe_gold
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setAfterSafeGold(Long afterSafeGold) {
        this.afterSafeGold = afterSafeGold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.fee
     *
     * @return the value of transfer_gold_record.fee
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Long getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.fee
     *
     * @param fee the value for transfer_gold_record.fee
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setFee(Long fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.fee_rate
     *
     * @return the value of transfer_gold_record.fee_rate
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Integer getFeeRate() {
        return feeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.fee_rate
     *
     * @param feeRate the value for transfer_gold_record.fee_rate
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setFeeRate(Integer feeRate) {
        this.feeRate = feeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.change_safe_gold
     *
     * @return the value of transfer_gold_record.change_safe_gold
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Long getChangeSafeGold() {
        return changeSafeGold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.change_safe_gold
     *
     * @param changeSafeGold the value for transfer_gold_record.change_safe_gold
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setChangeSafeGold(Long changeSafeGold) {
        this.changeSafeGold = changeSafeGold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.create_time
     *
     * @return the value of transfer_gold_record.create_time
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.create_time
     *
     * @param createTime the value for transfer_gold_record.create_time
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.player_type
     *
     * @return the value of transfer_gold_record.player_type
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public Byte getPlayerType() {
        return playerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.player_type
     *
     * @param playerType the value for transfer_gold_record.player_type
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setPlayerType(Byte playerType) {
        this.playerType = playerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transfer_gold_record.channel_id
     *
     * @return the value of transfer_gold_record.channel_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transfer_gold_record.channel_id
     *
     * @param channelId the value for transfer_gold_record.channel_id
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}