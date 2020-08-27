package com.river.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "查询用户入参")
@Data
public class UserDto {

    @ApiModelProperty(value = "用户账号")
    private String userCode;

    @ApiModelProperty(value = "创建时间" , example = "2020-08-27")
    private Date creatTime;

}
