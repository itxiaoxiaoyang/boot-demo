package cn.itcast.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 虎哥
 */
@Slf4j
@RestController
public class HelloController {
/*    @Autowired
    private JdbcProperties properties;*/

    @GetMapping("hello")
    public String hello(){
        log.info("hello method is running!");
        return "hello, spring boot!";
    }
}
