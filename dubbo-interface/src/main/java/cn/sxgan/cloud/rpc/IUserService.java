package cn.sxgan.cloud.rpc;

import cn.sxgan.cloud.entity.User;

/**
 * @Description: 用户服务接口
 * @Author: sxgan
 * @Date: 2024-03-07 17:20
 * @Version: 1.0
 **/

public interface IUserService {
    /**
     * 通过userId查询用户名
     *
     * @param userId
     * @return
     */
    User getUserByUserId(Long userId);
}
