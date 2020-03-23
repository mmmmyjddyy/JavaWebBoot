package com.chzu.user.controller;

import com.boot.base.core.Result;
import com.boot.base.core.ResultGenerator;
import com.chzu.user.model.SysPermission;
import com.chzu.user.service.SysPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author CodeGenerator
 * @data 2020/03/23.
 */
@RestController
@RequestMapping("/sys/permission")
@Api(value = "SysPermission控制类", description = "控制类接口测试")
public class SysPermissionController {
    @Resource
    private SysPermissionService sysPermissionService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result
<PageInfo<SysPermission>> list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SysPermission> list = sysPermissionService.findAll();
        PageInfo<SysPermission> pageInfo = new PageInfo<>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @PostMapping
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sysPermission",value = "待添加的sysPermission实例",paramType = "body",dataType = "SysPermission",required = true)
    })
    public Result add(@RequestBody SysPermission sysPermission) {
        sysPermissionService.save(sysPermission);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer"),
    })
    public Result delete(@PathVariable Integer id) {
        sysPermissionService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sysPermission",value = "更新的sysPermission实例",paramType = "body",dataType = "SysPermission",required = true)
    })
    public Result update(@RequestBody SysPermission sysPermission) {
        sysPermissionService.update(sysPermission);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
    })
    public Result detail(@PathVariable Integer id) {
        SysPermission sysPermission = sysPermissionService.findById(id);
        return ResultGenerator.genSuccessResult(sysPermission);
    }


}
