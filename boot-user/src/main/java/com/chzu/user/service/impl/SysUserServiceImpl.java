package com.chzu.user.service.impl;

import com.chzu.user.dao.SysUserMapper;
import com.chzu.user.model.SysUser;
import com.chzu.user.service.SysUserService;
import com.boot.base.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author CodeGenerator
 * @data 2020/03/23.
 */
@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

}
