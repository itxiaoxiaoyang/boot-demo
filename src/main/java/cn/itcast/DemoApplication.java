package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 虎哥
 */
@MapperScan("cn.itcast.mapper")
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // 初始化spring容器
        SpringApplication.run(DemoApplication.class, args);
    }
}
