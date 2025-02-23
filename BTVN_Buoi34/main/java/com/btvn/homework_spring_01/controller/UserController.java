package com.btvn.homework_spring_01.controller;
import com.btvn.homework_spring_01.entity.UserEntity;
import com.btvn.homework_spring_01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
   @Autowired
    private UserService userService;
   // lấy danh sách người dùng
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getUsers();
    }
    // Thêm người dùng mới
    @PostMapping
    public String addUser(@RequestBody UserEntity user) {
        userService.addUser(user);
        return "Thêm người dùng thành công";
    }
}
