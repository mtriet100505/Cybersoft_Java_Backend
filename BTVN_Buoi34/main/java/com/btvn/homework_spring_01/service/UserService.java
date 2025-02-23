package com.btvn.homework_spring_01.service;

import com.btvn.homework_spring_01.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    private List<UserEntity> users=new ArrayList<UserEntity>();

    public UserService() {
        users.add(new UserEntity("Nguyen Van A", "Hanoi", 25));
        users.add(new UserEntity("Tran Thi B", "Ho Chi Minh City", 30));
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }
    public void addUser(UserEntity user) {
        users.add(user);
    }
}
