package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/*
 * @Description: 请输入....
 * @Author: 麦子
 * @Date: 2019-07-24 11:17:03
 * @LastEditTime: 2019-07-25 20:02:32
 * @LastEditors: 麦子
 */
@Controller
public class MyController {

    @GetMapping(value="path")
    public String getMethodName(@RequestParam String param) {
        return "wo shi ceshi ";
    }

    @GetMapping(value="path")
    public String getMethodName2(@RequestParam String param) {
        return "wo shi ceshi ";
    }
    
    
    

    
    
      
}