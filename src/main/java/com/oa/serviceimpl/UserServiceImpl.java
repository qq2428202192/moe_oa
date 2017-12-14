package com.oa.serviceimpl;

import com.oa.dao.UserDao;
import com.oa.entity.UserEntity;
import com.oa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 serviceImpl
 * @Description:   实现类
 * @ClassName:     UserService.java
 * @author         moe
 * @Date           2017-12-14
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> sallUser() {
        return userDao.sallUser();
    }
}
