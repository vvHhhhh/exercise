package com.tigerwow.tea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by wanhu 2019-08-30 15:56
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/v1")
    public void helloWorld() {
        System.out.println("asdas");
    }
}
