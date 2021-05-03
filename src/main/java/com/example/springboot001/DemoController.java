package com.example.springboot001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jerry
 * @create 2021-04-23 18:22
 */
@RestController
@RequestMapping("testboot")
public class DemoController {
    @RequestMapping("index")
    public String index(){
        return "hello!my first Springboot project of IDEA" ;
    }
}
