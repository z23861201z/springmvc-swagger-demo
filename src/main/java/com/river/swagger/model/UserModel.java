package com.river.swagger.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;

@Data
public class UserModel {

    @JsonIgnore
    @JsonIgnoreProperties
    public int id;

    @ApiModelProperty(value = "用户账号")
    private String userCode;

    @ApiModelProperty(value = "所属单位")
    private String unitName;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "创建时间" ,example = "2020-08-27 09:46:53")
    private Date createTime;

}
