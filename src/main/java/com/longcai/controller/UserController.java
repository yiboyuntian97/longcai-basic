package com.longcai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.longcai.entity.User;
import com.longcai.service.UserService;
import com.longcai.util.ResultVOUtil;
import com.longcai.vo.ResultVO;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public ResultVO<List<User>> findAll(){
        return ResultVOUtil.success(userService.findAll());
    }

}
