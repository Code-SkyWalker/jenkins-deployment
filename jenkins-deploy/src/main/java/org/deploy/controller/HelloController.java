package org.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author Code Skywalker
 * @Date 2023/7/10 15:24
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
