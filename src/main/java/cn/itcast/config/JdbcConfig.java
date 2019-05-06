package cn.itcast.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author 虎哥
 */
//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
//@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return null;
    }

  /*  @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;*/

 /* @Autowired
  private JdbcProperties jdbcProperties;*/

/*    @Bean
    public DataSource dataSource(JdbcProperties prop) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(prop.getDriverClassName());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUsername());
        dataSource.setPassword(prop.getPassword());
        return dataSource;
    }*/
}
