//package com.idealighter.game.configuration.db;
//
//import com.mysql.cj.jdbc.MysqlDataSource;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//
//@Configuration
//@EnableAutoConfiguration
//@MapperScan(basePackages = WebControlDataSourceConfiguration.PACKAGE,
//    sqlSessionFactoryRef = "controlSqlSessionFactory")
//public class WebControlDataSourceConfiguration {
//
//  static final String PACKAGE = "com.idealighter.game.dao.control";
//  static final String MAPPER_LOCATION = "classpath:com/idealighter/game/dao/control/xml/*.xml";
//  static final String TYPE_ALIASES_PACKAGE = "com.idealighter.game.dao.control.po";
//
//  @Value("${spring.datasource.username}")
//  private String username;
//
//  @Value("${spring.datasource.password}")
//  private String password;
//
//  @Value("${control.datasource.url}")
//  private String jdbcUrl;
//
//  // @Value("${spring.datasource.dataSourceClassName}")
//  // private String dataSourceClassName;
//
//  @Value("${spring.datasource.driver-class-name}")
//  private String driverClassName;
//
//  @Value("${spring.datasource.poolName}")
//  private String poolName;
//
//  @Value("${spring.datasource.connectionTimeout}")
//  private int connectionTimeout;
//
//  @Value("${spring.datasource.maxLifetime}")
//  private int maxLifetime;
//
//  @Value("${spring.datasource.maximumPoolSize}")
//  private int maximumPoolSize;
//
//  @Value("${spring.datasource.minimumIdle}")
//  private int minimumIdle;
//
//  @Value("${spring.datasource.idleTimeout}")
//  private int idleTimeout;
//
//  /**
//   * @Title: userSystemDataSouce.
//   *  用户数据源.
//   * @author caijianbin
//   * @date 2016年4月26日 下午1:11:44
//   * @return 数据源.
//   */
//  @Bean(name = "controlDataSouce", destroyMethod = "close")
//  public DataSource controlDataSouce() {
//    // log.debug("配置Master数据库");
//
//    HikariConfig config = new HikariConfig();
//    config.setJdbcUrl(jdbcUrl);
//    config.setUsername(username);
//    config.setPassword(password);
//
//    config.setConnectionTimeout(connectionTimeout);
//    // config.setDriverClassName(driverClassName);
//    config.setIdleTimeout(idleTimeout);
//    config.setMaximumPoolSize(maximumPoolSize);
//    config.setMaxLifetime(maxLifetime);
//    config.setMinimumIdle(minimumIdle);
//    config.setPoolName(poolName);
//
//    MysqlDataSource mysqlDataSource = new MysqlDataSource();
//
//    mysqlDataSource.setPassword(password);
//    mysqlDataSource.setUrl(jdbcUrl);
//    mysqlDataSource.setUser(username);
//
//    config.setDataSource(mysqlDataSource);
//
//    HikariDataSource ds = new HikariDataSource(config);
//    return ds;
//  }
//
//  /**
//   * .
//   * 
//   * @param dataSource .
//   * @return .
//   * @throws Exception .
//   */
//  @Bean(name = "controlSqlSessionFactory")
//  public SqlSessionFactory controlSqlSessionFactory(
//      @Qualifier("controlDataSouce") DataSource dataSource) throws Exception {
//    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//    bean.setDataSource(dataSource);
//    bean.setMapperLocations(
//        new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
//    bean.setTypeAliasesPackage(TYPE_ALIASES_PACKAGE);
//    org.apache.ibatis.session.Configuration configuration =
//        new org.apache.ibatis.session.Configuration();
//    configuration.setMapUnderscoreToCamelCase(true);
//    configuration.setDefaultFetchSize(100);
//    configuration.setDefaultStatementTimeout(30);
//    bean.setConfiguration(configuration);
//    return bean.getObject();
//  }
//
//  @Bean(name = "controlTransactionManager")
//  public PlatformTransactionManager controlTransactionManager() {
//    return new DataSourceTransactionManager(controlDataSouce());
//  }
//
//}
