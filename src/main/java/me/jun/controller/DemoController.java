package me.jun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jun
 * @Desc:
 * @Date: 2021/8/6 下午 6:56
 */
@RestController
public class DemoController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello GitHub Actions!";
    }
}
