package com.hezs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: leyou
 * @Package: com.hezs.controller
 * @ClassName: ${TYPE_NAME}
 * @Description:
 * @Author: hezs
 * @CreateDate: 2019-7-14 20:53
 * @Version: 1.0
 */
@RestController
public class HelloWord {
    @RequestMapping("/")
    public String helloWord(){
        return "helloWord";
    }
}
