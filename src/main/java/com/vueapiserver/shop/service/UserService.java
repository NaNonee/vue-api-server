package com.vueapiserver.shop.service;

import com.vueapiserver.shop.entity.User;

import java.util.List;

public interface UserService {
     List<User> getUserlists();
     User getUserById(int uid);

}
