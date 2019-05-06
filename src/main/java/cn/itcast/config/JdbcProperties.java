package cn.itcast.config;

import lombok.Data;

import java.util.List;

/**
 * @author 虎哥
 */
@Data
//@Component
//@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private User user = new User();
    @Data
    private class User{
        private String name;
        private int age;
        private List<String> girls;
    }
}
