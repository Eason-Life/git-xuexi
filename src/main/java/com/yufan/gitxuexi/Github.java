package com.yufan.gitxuexi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author YuFan
 * @date 2020/11/1 14:47
 * @jdk version 1.8.0_251
 */

@RestController
public class Github {

    @RequestMapping(value = "/github")
    public String toGitHub(){

        return "git success";
    }

}
