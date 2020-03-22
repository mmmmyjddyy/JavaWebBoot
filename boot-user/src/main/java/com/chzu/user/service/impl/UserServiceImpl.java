package com.chzu.user.service.impl;

import com.chzu.user.dao.UserMapper;
import com.chzu.user.model.User;
import com.chzu.user.service.UserService;
import com.boot.base.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author CodeGenerator
 * @data 2020/03/19.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
