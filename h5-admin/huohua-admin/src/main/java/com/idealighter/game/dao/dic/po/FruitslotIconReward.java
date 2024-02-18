package com.idealighter.game.dao.dic.po;

import java.io.Serializable;

/**
 * @author 
 */
public class FruitslotIconReward implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 奖励名称
     */
    private String name;

    /**
     * 2个连线
     */
    private Integer twoline;

    /**
     * 3连线倍数
     */
    private Integer threeline;

    /**
     * 4连线倍数
     */
    private Integer fourline;

    /**
     * 5连线倍数
     */
    private Integer fiveline;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTwoline() {
        return twoline;
    }

    public void setTwoline(Integer twoline) {
        this.twoline = twoline;
    }

    public Integer getThreeline() {
        return threeline;
    }

    public void setThreeline(Integer threeline) {
        this.threeline = threeline;
    }

    public Integer getFourline() {
        return fourline;
    }

    public void setFourline(Integer fourline) {
        this.fourline = fourline;
    }

    public Integer getFiveline() {
        return fiveline;
    }

    public void setFiveline(Integer fiveline) {
        this.fiveline = fiveline;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FruitslotIconReward other = (FruitslotIconReward) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTwoline() == null ? other.getTwoline() == null : this.getTwoline().equals(other.getTwoline()))
            && (this.getThreeline() == null ? other.getThreeline() == null : this.getThreeline().equals(other.getThreeline()))
            && (this.getFourline() == null ? other.getFourline() == null : this.getFourline().equals(other.getFourline()))
            && (this.getFiveline() == null ? other.getFiveline() == null : this.getFiveline().equals(other.getFiveline()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTwoline() == null) ? 0 : getTwoline().hashCode());
        result = prime * result + ((getThreeline() == null) ? 0 : getThreeline().hashCode());
        result = prime * result + ((getFourline() == null) ? 0 : getFourline().hashCode());
        result = prime * result + ((getFiveline() == null) ? 0 : getFiveline().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", twoline=").append(twoline);
        sb.append(", threeline=").append(threeline);
        sb.append(", fourline=").append(fourline);
        sb.append(", fiveline=").append(fiveline);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}