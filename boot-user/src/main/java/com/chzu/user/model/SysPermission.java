package com.chzu.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;

@ApiModel(value="SysPermission")
@Table(name = "sys_permission")
public class SysPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="null")
    private Integer id;

    @Column(name = "parent_id")
    @ApiModelProperty(value="null")
    private Integer parentId;

    @Column(name = "res_name")
    @ApiModelProperty(value="null")
    private String resName;

    @Column(name = "res_type")
    @ApiModelProperty(value="null")
    private String resType;

    @ApiModelProperty(value="null")
    private String permission;

    @ApiModelProperty(value="null")
    private String url;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return res_name
     */
    public String getResName() {
        return resName;
    }

    /**
     * @param resName
     */
    public void setResName(String resName) {
        this.resName = resName;
    }

    /**
     * @return res_type
     */
    public String getResType() {
        return resType;
    }

    /**
     * @param resType
     */
    public void setResType(String resType) {
        this.resType = resType;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    /**
     * @param permission
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}