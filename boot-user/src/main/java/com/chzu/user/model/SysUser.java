package com.chzu.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;

@ApiModel(value="SysUser")
@Table(name = "sys_user")
public class SysUser {
    @Id
    @Column(name = "user_id")
    @ApiModelProperty(value="null")
    private Integer userId;

    @Column(name = "user_name")
    @ApiModelProperty(value="null")
    private String userName;

    @Column(name = "full_name")
    @ApiModelProperty(value="null")
    private String fullName;

    @ApiModelProperty(value="null")
    private String password;

    @ApiModelProperty(value="null")
    private String salt;

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return full_name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }
}