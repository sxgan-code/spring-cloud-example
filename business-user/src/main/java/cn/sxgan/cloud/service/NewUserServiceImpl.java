package cn.sxgan.cloud.service;

import cn.sxgan.cloud.entity.User;
import cn.sxgan.cloud.rpc.IUserService;
import cn.sxgan.cloud.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Description: 新版用户服务实现类
 * @Author: sxgan
 * @Date: 2024/3/27 10:54
 * @Version: 1.0
 **/

@DubboService(timeout = 3000, version = "v2.0.0")
@Slf4j
public class NewUserServiceImpl implements IUserService {

    int count = 1;

    @Override
    public User getUserByUserId(Long userId) {
        log.info("NewUserServiceImpl.getUserByUserId 服务调用第{}次", count++);
        //  模拟数据库查询2秒
        CommonUtils.sleep(4000);
        User user = new User();
        user.setUserId(userId);
        user.setUserName("张三");
        user.setPassword("666666");
        return user;
    }
}
