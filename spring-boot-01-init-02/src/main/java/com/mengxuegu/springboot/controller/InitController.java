package com.mengxuegu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/2/17
 * @Description:com.mengxuegu.springboot.controller
 * @version:1.0
 */
@Controller
public class InitController {
    @ResponseBody
    @RequestMapping("info")
    public String init(){
        return "hello init...";
    }
}
