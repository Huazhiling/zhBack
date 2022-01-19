package com.test.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "实体类")
public class ConsultBean {
    @ApiModelProperty("Apc测试")
    private String apc;
    @ApiModelProperty("Cnt测试")
    private String cnt;

    public String getApc() {
        return apc;
    }

    public void setApc(String apc) {
        this.apc = apc;
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }
}
