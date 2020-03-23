package com.chzu.user.service.impl;

import com.chzu.user.dao.SysPermissionMapper;
import com.chzu.user.model.SysPermission;
import com.chzu.user.service.SysPermissionService;
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
public class SysPermissionServiceImpl extends AbstractService<SysPermission> implements SysPermissionService {
    @Resource
    private SysPermissionMapper sysPermissionMapper;

}
