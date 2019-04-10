package com.lw.mall.eurka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eurka注册中心
 *
 * @author 刘伟
 * @version [版本号, 2019年 04月 09 日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 **/
@SpringBootApplication
@EnableEurekaServer
public class SpringbootEurkaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurkaServerApplication.class, args);
    }
}
