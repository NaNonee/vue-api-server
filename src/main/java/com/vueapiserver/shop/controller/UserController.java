package com.vueapiserver.shop.controller;
import com.vueapiserver.shop.common.BaseController;
import com.vueapiserver.shop.common.page.TableDataInfo;
import com.vueapiserver.shop.entity.User;
import com.vueapiserver.shop.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户")
@RestController
public class UserController extends BaseController {
    @Autowired
    UserService userService;
    @ApiOperation(value = "获取用户列表")
    @GetMapping("/listusers")
    public TableDataInfo listUser(){
        startPage();
        User user = userService.getUserById(1);
       List<User> list =  userService.getUserlists();
        return getDataTable(list);
    }
}
