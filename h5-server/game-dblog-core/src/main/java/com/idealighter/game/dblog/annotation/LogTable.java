package com.idealighter.game.dblog.annotation;

import com.idealighter.game.dblog.core.TableType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日志表生成策略.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface LogTable {
  /**
   * table类型.
   * 
   * @return table类型.
   */
  public TableType type() default TableType.SINGLE;

  // 主键列,默认自增长
  /**
   * 主键列,默认自增长
   * 
   * @return 主键列,默认自增长.
   */
  // public String idColumn() default "";
}
