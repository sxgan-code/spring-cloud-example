package cn.sxgan.cloud.controller;

import cn.sxgan.cloud.rpc.IUserService;
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
@RequestMapping("/order")
public class OrderController {

    @DubboReference
    IUserService userService;

    @RequestMapping("/getOrder")
    public String getOrder() {
        Long userId = 1001L;
        String userName = userService.getUserNameByUserId(userId);
        // 此处模拟订单
        String order = "orderId:0001,userName:" + userName;
        return order;
    }
}
