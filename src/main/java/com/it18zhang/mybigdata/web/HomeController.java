package com.it18zhang.mybigdata.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiebi on 5/20/2017.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home() {
        System.out.println("welcome home");
        return "home";
    }
}
