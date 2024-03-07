package cn.sxgan.cloud.service;

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
    public String getUserNameByUserId(Long userId) {

        // 此处模拟查询到用户名
        String name = "张三";
        return name;
    }
}
