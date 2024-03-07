package cn.sxgan.cloud;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 订单业务启动类
 * @Author: sxgan
 * @Date: 2024-03-07 16:40
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDubbo
public class OrderBusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderBusinessApplication.class, args);
    }
}
