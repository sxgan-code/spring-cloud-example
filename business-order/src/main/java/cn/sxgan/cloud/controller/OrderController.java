package cn.sxgan.cloud.controller;

import cn.sxgan.cloud.entity.User;
import cn.sxgan.cloud.rpc.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 订单访问接口
 * @Author: sxgan
 * @Date: 2024-03-07 18:36
 * @Version: 1.0
 **/

@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @DubboReference
    IUserService userService;

    @RequestMapping("/getOrder")
    public User getOrder() {
        Long userId = 1001L;
        User user = userService.getUserByUserId(userId);
        log.info(user.toString());
        // 此处方便展示，直接返回用户
        return user;
    }
}
