package com.xys.seckill.service.impl;

import com.xys.seckill.pojo.User;
import com.xys.seckill.mapper.UserMapper;
import com.xys.seckill.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xys
 * @since 2021-09-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
