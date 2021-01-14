package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/user")
@Api(tags = "用户相关接口", description = "提供用户相关的 Rest API")
public class UserController {
    @ApiOperation("新增用户接口")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }

    @ApiOperation("查找用户接口")
    @GetMapping("/find/{id}")
    @ApiImplicitParam(name = "id", value = "用户id", dataType = "Long", paramType = "path", example = "1", required = true)
//标记某个参数
//    public User findById(@PathVariable("id") int id) {
    public User findById(@PathVariable("id") int id) {
        return new User();
    }

    @ApiOperation("跟新用户接口")
    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }

    //    @ApiOperation("删除用户接口")
    @DeleteMapping("/delete/{id}")
    @ApiIgnore
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}