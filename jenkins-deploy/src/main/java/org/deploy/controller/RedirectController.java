package org.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Author Code Skywalker
 * @Date 2023/7/11 16:56
 */
@Controller
public class RedirectController {

    @GetMapping("redirect")
    public String redirect() {
        return "redirect:https://www.google.com.hk/";
    }
}
