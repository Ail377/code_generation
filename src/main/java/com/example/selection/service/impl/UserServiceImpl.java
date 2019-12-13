package com.example.selection.service.impl;

import com.example.selection.entity.User;
import com.example.selection.mapper.UserMapper;
import com.example.selection.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mr.Yu
 * @since 2019-11-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
