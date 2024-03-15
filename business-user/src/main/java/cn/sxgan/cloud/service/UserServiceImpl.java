package cn.sxgan.cloud.service;

import cn.sxgan.cloud.entity.User;
import cn.sxgan.cloud.rpc.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Description: 用户服务实现类
 * @Author: sxgan
 * @Date: 2024-03-07 18:29
 * @Version: 1.0
 **/

@DubboService
public class UserServiceImpl implements IUserService {
    @Override
    public User getUserByUserId(Long userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("张三");
        user.setPassword("666666");
        return user;
    }
}
