package com.king.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

/**
 * @author king
 * @Title:
 * @Package
 * @Description:
 * @date 2020/7/3121:21
 */
@Component
@ApiModel(value = "用户查询对象")
public class UserCondition {
    @ApiModelProperty(name = "用户id", dataType = "Integer", notes = "用户Id")
    private Integer userId;
    @ApiModelProperty(name = "用户名", dataType = "String", notes = "用户名")
    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}