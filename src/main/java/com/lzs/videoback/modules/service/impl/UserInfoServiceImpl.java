package com.lzs.videoback.modules.service.impl;

import com.lzs.videoback.modules.entity.UserInfo;
import com.lzs.videoback.modules.mapper.UserInfoMapper;
import com.lzs.videoback.modules.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzs
 * @since 2021-02-04
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
