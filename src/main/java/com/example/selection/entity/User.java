package com.example.selection.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mr.Yu
 * @since 2019-11-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名称")
    private String name;

    private String nickname;

    @ApiModelProperty(value = "性别（0：男，1：女）")
    private Boolean sex;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "是否删除（‘0’：否，‘1’：是）")
    private Boolean isDelete;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;


}
