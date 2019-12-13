package com.example.selection.controller;


import com.example.selection.service.IUserService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mr.Yu
 * @since 2019-11-21
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final IUserService iUserService;

    @GetMapping("/hello")
    @ApiOperation(value = "测试hello world")
    public String hello() {
        return "hello world";
    }
}

