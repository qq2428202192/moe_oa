package com.oa.service;

import com.oa.entity.UserEntity;

import java.util.List;

/**
 * 用户 service
 * @Description:   接口类
 * @ClassName:     UserService.java
 * @author         moe
 * @Date           2017-12-14
 */

public interface UserService {

    //查询所有用户
    public List<UserEntity> sallUser();

}
