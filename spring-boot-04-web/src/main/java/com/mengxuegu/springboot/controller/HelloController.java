package com.mengxuegu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/14
 * @Description:com.mengxuegu.springboot.controller
 * @version:1.0
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/success")
    public String execute(){
        return "Hello World!";
    }

    @RequestMapping("/execute")
    public String success(Map<String, Object> map){
        map.put("name", "Saber污妖王");
        //classpath:/templates/success.html
        return "success";
    }

}
