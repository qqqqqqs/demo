package com.demo.controller;

import com.demo.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@MapperScan
public class UserController {
    @Autowired
    UserService service;



    @ResponseBody
    public List find(){
        return service.find();
    }

}
