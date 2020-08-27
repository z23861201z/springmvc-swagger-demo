package com.river.swagger.controller;

import com.river.swagger.model.UserDto;
import com.river.swagger.model.UserModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  @Description:       用户基本信息相关接口；swagger2.6tags上不能写中文，用description描述接口即可。
 *  @Author:            chen.junjin
 *  @Date:              2020/8/27 10:47
 */
@Api(tags = "userController" ,description = "用户基本信息相关接口")
@RestController
public class UserController {

    /**
     *  @Description:       获取用户列表；
     *  @Author:            chen.junjin
     *  @Date:              2020/8/27 11:20
     */
    @RequestMapping(value = "/loadUser.do" , method = RequestMethod.GET)
    @ApiOperation(value = "获取用户列表")
    public List<UserModel> loadUser(UserDto userDto){
        List<UserModel> userList = new ArrayList<UserModel>();
        for(int i = 0 ; i < 10 ; i++){
            UserModel userModel = new UserModel();
            userModel.setCreateTime(new Date());
            userModel.setId(i);
            userModel.setNickName("昵称"+i);
            userModel.setUserCode("userCode"+i);
            userModel.setUnitName("单位"+i);
            userList.add(userModel);
        }
        return userList;
    }

}
