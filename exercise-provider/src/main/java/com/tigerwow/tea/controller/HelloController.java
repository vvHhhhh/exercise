package com.tigerwow.tea.controller;

import com.tigerwow.tealife.api.TeaQueryRemote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Created by wanhu 2019-08-30 15:56
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Resource
    private TeaQueryRemote teaQueryRemote;

    @GetMapping("/v1")
    public void helloWorld() {
        System.out.println("asdas");
    }

    @GetMapping("/v2")
    public void queryTea(Integer teaId) {
        String str = teaQueryRemote.queryTeaById(teaId);
        System.out.println("接口调用成功，" + str);
    }
}
