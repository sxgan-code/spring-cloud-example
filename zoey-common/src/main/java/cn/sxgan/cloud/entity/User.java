package cn.sxgan.cloud.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description: 用户实体类
 * @Author: sxgan
 * @Date: 2024-03-09 10:36
 * @Version: 1.0
 **/
@Data
@ToString
public class User implements Serializable {
    private Long userId;
    private String userName;
    private String password;
}
