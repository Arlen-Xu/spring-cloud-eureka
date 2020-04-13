package com.eureka.eurekaconsumer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuxianbin
 * @ClassName: ConsumerController
 * @description: TODO
 * @date 2020/4/13 15:17
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://eurekaprovide";

    @GetMapping(value = "/test/{name}")
    public String test(@PathVariable("name") String name){
        return restTemplate.getForObject(REST_URL_PREFIX + "/eurekaprovide/hi?name=" + name, String.class);
    }

}
