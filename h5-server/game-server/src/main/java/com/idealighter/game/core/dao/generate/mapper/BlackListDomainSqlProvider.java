package com.idealighter.game.core.dao.generate.mapper;

import com.idealighter.game.core.dao.generate.domain.BlackListDomain;
import com.idealighter.game.core.dao.generate.domain.BlackListDomainExample.Criteria;
import com.idealighter.game.core.dao.generate.domain.BlackListDomainExample.Criterion;
import com.idealighter.game.core.dao.generate.domain.BlackListDomainExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class BlackListDomainSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table black_list
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public String countByExample(BlackListDomainExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("black_list");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table black_list
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public String deleteByExample(BlackListDomainExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("black_list");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table black_list
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public String insertSelective(BlackListDomain record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("black_list");
        
        if (record.getLimitType() != null) {
            sql.VALUES("limit_type", "#{limitType,jdbcType=VARCHAR}");
        }
        
        if (record.getLimitAction() != null) {
            sql.VALUES("limit_action", "#{limitAction,jdbcType=VARCHAR}");
        }
        
        if (record.getLimitValue() != null) {
            sql.VALUES("limit_value", "#{limitValue,jdbcType=VARCHAR}");
        }
        
        if (record.getEndTime() != null) {
            sql.VALUES("end_time", "#{endTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table black_list
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public String selectByExample(BlackListDomainExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("limit_type");
        sql.SELECT("limit_action");
        sql.SELECT("limit_value");
        sql.SELECT("end_time");
        sql.FROM("black_list");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        String tmp = "";
        if (example != null && example.getLimit() != null) {
            tmp = " limit " + example.getLimit().toString();
            if (example.getOffset() != null) {
                tmp = tmp + " offset " + example.getOffset().toString();
            }
        }
        return sql + tmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table black_list
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        BlackListDomain record = (BlackListDomain) parameter.get("record");
        BlackListDomainExample example = (BlackListDomainExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("black_list");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getLimitType() != null) {
            sql.SET("limit_type = #{record.limitType,jdbcType=VARCHAR}");
        }
        
        if (record.getLimitAction() != null) {
            sql.SET("limit_action = #{record.limitAction,jdbcType=VARCHAR}");
        }
        
        if (record.getLimitValue() != null) {
            sql.SET("limit_value = #{record.limitValue,jdbcType=VARCHAR}");
        }
        
        if (record.getEndTime() != null) {
            sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table black_list
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("black_list");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("limit_type = #{record.limitType,jdbcType=VARCHAR}");
        sql.SET("limit_action = #{record.limitAction,jdbcType=VARCHAR}");
        sql.SET("limit_value = #{record.limitValue,jdbcType=VARCHAR}");
        sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        
        BlackListDomainExample example = (BlackListDomainExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table black_list
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    public String updateByPrimaryKeySelective(BlackListDomain record) {
        SQL sql = new SQL();
        sql.UPDATE("black_list");
        
        if (record.getLimitType() != null) {
            sql.SET("limit_type = #{limitType,jdbcType=VARCHAR}");
        }
        
        if (record.getLimitAction() != null) {
            sql.SET("limit_action = #{limitAction,jdbcType=VARCHAR}");
        }
        
        if (record.getLimitValue() != null) {
            sql.SET("limit_value = #{limitValue,jdbcType=VARCHAR}");
        }
        
        if (record.getEndTime() != null) {
            sql.SET("end_time = #{endTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table black_list
     *
     * @mbg.generated Tue Aug 14 14:13:21 CST 2018
     */
    protected void applyWhere(SQL sql, BlackListDomainExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}