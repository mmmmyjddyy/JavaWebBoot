package com.boot.base.core;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @ClassName Mapper
 * @Description Mapper
 * @Author FLZ
 * @Date 2020/3/18 14:59
 * @Version 1.0
 */
public interface Mapper <T>
     extends
    BaseMapper<T>,
    ConditionMapper<T>,
    IdsMapper<T>,
    InsertListMapper<T>,
    ExampleMapper<T> {
}
