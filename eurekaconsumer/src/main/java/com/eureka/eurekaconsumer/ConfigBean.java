package com.eureka.eurekaconsumer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuxianbin
 * @ClassName: ConfigBean
 * @description: TODO
 * @date 2020/4/13 15:15
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced// Spring Cloud Ribbon 是基于 Netflix Ribbon 实现的一套客户端
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
