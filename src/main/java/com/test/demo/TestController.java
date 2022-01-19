package com.test.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试信息")
@RestController
public class TestController {
    @GetMapping("/out")
    @ApiOperation(value = "获取测试数据",notes = "测试数据连接Swagger")
    public ConsultBean test() {
        ConsultBean consultBean = new ConsultBean();
        consultBean.setApc("My os ConsultBean");
        consultBean.setCnt("My os ConsultBean  ---> Cnt");
        if (Math.random() * 5000 > 2000) {
            return consultBean;
        } else {
            return new ConsultBean();
        }
    }
}
