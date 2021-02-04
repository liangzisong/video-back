package com.lzs.videoback.modules.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.lzs.videoback.common.BusinessException;
import com.lzs.videoback.modules.dto.LoginDto;
import com.lzs.videoback.modules.entity.UserInfo;
import com.lzs.videoback.modules.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lzs
 * @since 2021-02-04
 */
@RestController
@RequestMapping("/modules/user-info")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @PostMapping("login")
    public UserInfo login(LoginDto loginDto){
        UserInfo userInfo = userInfoService.getOne(Wrappers.<UserInfo>lambdaQuery()
                .eq(UserInfo::getUsername, loginDto.getUsername())
                .eq(UserInfo::getPassword, loginDto.getPassword()));
        if (userInfo == null) {
            throw new BusinessException("用户名或密码错误");
        }
        return userInfo;
    }
}
