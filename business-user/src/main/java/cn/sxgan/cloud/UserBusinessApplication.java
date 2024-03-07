package cn.sxgan.cloud;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 用户服务启动类
 * @Author: sxgan
 * @Date: 2024-03-07 16:39
 * @Version: 1.0
 **/

@SpringBootApplication
@EnableDubbo
public class UserBusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserBusinessApplication.class, args);
    }
}
