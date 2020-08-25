package com.vueapiserver.shop.service.serviceImpl;

import com.vueapiserver.shop.dao.UserMapper;
import com.vueapiserver.shop.entity.User;
import com.vueapiserver.shop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
     private UserMapper userMapper;
    @Override
    public List<User> getUserlists() {
        return userMapper.selectAllUser();
    }

    @Override
    public User getUserById(int uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}
